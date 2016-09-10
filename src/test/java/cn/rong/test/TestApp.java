package cn.rong.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.rong.superLottery.dao.UserMapper;
import cn.rong.superLottery.model.User;

/**
 * <p>Title:TestApp</p>
 * <p>Description:	</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月25日 下午6:48:56
 */
public class TestApp {

	public static void main(String[] args) throws Exception{
		
		
		InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
		
		
		SqlSession session = sqlSessionFactory.openSession();
		
		List<Object> list = session.selectList("cn.rong.superLottery.dao.UserMapper.selectAllUsers");
		
		System.out.println(list.size());
		
		session.close();
		
	}
	
	
	@Test
	public void test() throws Exception{
		
		InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = sqlSessionFactory.openSession();
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.selectUserById("1");
		
		System.out.println(user.getUsername() + "  " + user.getPassword());
		
		session.close();
		
	}
	
	@Test
	public void testupdate() throws Exception{
		
		InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = factory.openSession();
		User user = new User();
		user.setUid("1");
		user.setUsername("张馨予");
		user.setPassword("98765432");
		int len = session.update("cn.rong.superLottery.dao.UserMapper.updateUserById", user);
		System.out.println(len);
		
		session.commit();
		session.close();
		
	}
	
	@Test
	public void testadd() throws Exception{
		InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = factory.openSession();
		
		UserMapper usermapper = session.getMapper(UserMapper.class);
		
		User user = new User();
		user.setUsername("林志玲");
		user.setPassword("01010");
		
		int len = usermapper.addUser(user);
		
		System.out.println(len + user.getUid());
		
		session.commit();
		session.close();
		
		System.out.println(len + user.getUid());
		
	}
	
	@Test
	public void testdel() throws Exception{
		InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = factory.openSession();
		
		UserMapper usermapper = session.getMapper(UserMapper.class);
		
		
		usermapper.delUser("5");
		
		session.commit();
		session.close();
		
	}
	
	@Test
	public void testselectall() throws Exception{
		
		InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
		
		SqlSession session = build.openSession();
		
		
		UserMapper usermapper = session.getMapper(UserMapper.class);
		
		List<User> list = usermapper.selectAllUsers();
		for (User user : list) {
			
			System.out.println(user.getUid() + " " + user.getUsername()+" " + user.getPassword());
			
		}
		
		session.commit();
		session.close();
		
	}
	
	@Test
	public void testaddnull() throws Exception{
		InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = build.openSession();
		
		User user = new User();
		
		user.setUid("9999");
		user.setUsername("玛丽莲");
		user.setPassword(null);
		
		UserMapper usermapper = session.getMapper(UserMapper.class);
		int len = usermapper.addUser(user);
		System.out.println(len);
		
		session.commit();
		session.close();
		
	}
	
	
	
}
