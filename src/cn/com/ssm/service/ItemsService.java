package cn.com.ssm.service;

import java.util.List;

import cn.com.ssm.po.UserCustom;
import cn.com.ssm.po.UserQueryVo;

/**
 * 商品管理service
 * 
 * @author 26918
 *
 */
public interface ItemsService {
	
	// 商品查询列表
	public List<UserCustom> findUserList(UserQueryVo userQueryVo);

	// 根据id查询商品信息
	public UserCustom findUserById(Integer id);

	// 修改商品信息
	public void updateUser(Integer id, UserCustom userCustom);
}
