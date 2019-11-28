package cn.com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.ssm.mapper.UserMapper;
import cn.com.ssm.po.User;
import cn.com.ssm.po.UserCustom;
import cn.com.ssm.po.UserQueryVo;
import cn.com.ssm.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private UserMapper userMapper;

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) {

		return userMapper.findUserList(userQueryVo);
	}

	@Override
	public UserCustom findUserById(Integer id) {
		User user = userMapper.findUserById(id);
		//中间对商品信息进行业务处理
		UserCustom userCustom = new UserCustom();
		BeanUtils.copyProperties(user, userCustom);
		return userCustom;
	}

	@Override
	public void updateUser(Integer id, UserCustom userCustom) {
		//业务校验，通常在service接口对关键参数进行校验
		//id 为空，抛出异常
		
		userCustom.setId(id);
		userMapper.updateUser(userCustom);
	}

}
