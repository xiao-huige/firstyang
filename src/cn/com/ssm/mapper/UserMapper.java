package cn.com.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.ssm.po.User;
import cn.com.ssm.po.UserCustom;
import cn.com.ssm.po.UserQueryVo;

@Repository
public interface UserMapper {
	// 根据id查询用户信息，使用resultMap输出
	public User findUserByIdResultMap(int id) throws Exception;

	public List<UserCustom> findUserList(UserQueryVo userQueryVo);

	public int findUserCount(UserQueryVo userQueryVo) throws Exception;

	public User findUserById(int id);

	public List<User> findUserByName(UserQueryVo userQueryVo) throws Exception;

	public void deleteUser(int id);

	public void creatUser(User user);

	public void updateUser(User user);

}
