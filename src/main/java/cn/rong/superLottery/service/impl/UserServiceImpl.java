package cn.rong.superLottery.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.rong.superLottery.dao.UserMapper;
import cn.rong.superLottery.model.User;
import cn.rong.superLottery.service.UserService;
import cn.rong.superLottery.utils.Result;

/**
 * <p>Title:UserServiceImpl</p>
 * <p>Description:	</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月26日 上午11:32:02
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	private Log log = LogFactory.getLog(UserServiceImpl.class);

	@Override
	public Result login(User user) {
		log.info("--UserServiceImpl---用户请求登录----" + JSON.toJSONString(user));
		User backuser = userMapper.selectUserByNameAndPassword(user);
		Result result = new Result();
		if(backuser == null){
			log.info("-----用户名或者密码错误-----" + JSON.toJSONString(user));
			result.setStatus(false);
			result.setMsg("用户名或者密码错误");
			return result;
		}
		result.setStatus(true);
		result.setObj(backuser);
		log.info("-----用户登录成功-----" + JSON.toJSONString(result));
		return result;
	}

	
	
}
