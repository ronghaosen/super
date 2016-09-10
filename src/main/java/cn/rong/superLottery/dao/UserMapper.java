package cn.rong.superLottery.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.rong.superLottery.model.User;

/**
 * <p>Title:UserDao</p>
 * <p>Description: 用户管理dao	</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月25日 下午3:16:54
 */

public interface UserMapper {

	
	/**
	 * 根据用户id查询用户信息
	 */
	public User selectUserById(String id);
	
	/**
	 * 根据用户名和用户密码查询用户信息
	 */
	public User selectUserByNameAndPassword(User user);
	
	/**
	 * 添加用户信息
	 */
	public int addUser(User user);
	
	/**
	 * 根据id删除用户信息
	 */
	public int delUser(String id);
	
	/**
	 * 根据用户id更新商户信息
	 */
	public int updateUserById(User user);
	
	
	/**
	 * 查询所有的用户信息
	 */
	public List<User> selectAllUsers();
	
	/**
	 * 查询用户记录数
	 */
	public int selectTotalCounts();
	
}
