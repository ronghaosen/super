package cn.rong.superLottery.service;

import cn.rong.superLottery.model.User;
import cn.rong.superLottery.utils.Result;

/**
 * <p>Title:UserService</p>
 * <p>Description:	用户业务层</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月26日 上午11:27:22
 */
public interface UserService {

	
	public Result login(User user);
	
}
