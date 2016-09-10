package cn.rong.superLottery.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import cn.rong.superLottery.model.User;
import cn.rong.superLottery.service.UserService;
import cn.rong.superLottery.utils.Result;

/**
 * <p>Title:UserController</p>
 * <p>Description:	</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月26日 上午11:24:02
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	private Log log = LogFactory.getLog(UserController.class);
	
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response, User user) throws Exception{
		
		log.info("-----用户请求登录-----" + JSON.toJSONString(user));
		Result result = userService.login(user);
		if(!result.isStatus()){
			log.info("-----用户登录失败-----");
			request.setAttribute("msg", "用户名或密码错误");
			request.getRequestDispatcher("/index.jsp").forward(request, response);;
		}else{
			log.info("-----用户登录成功-----");
			//把登录用户信息放入session中
			request.getSession().setAttribute("user", result.getObj());
			request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);;
		}
		
		return;
	}
	
	/**
	 * 
	 * 
	* @Title: logout 
	* @Description: 用户退出请求
	* @param @param user
	* @param @param response
	* @return void
	* @throws
	 */
	@RequestMapping("/logout")
	public void logout(User user, HttpServletResponse response, HttpServletRequest request) {
		
		log.info("----用户请求退出-----" + user.getUid());
		
		//思路  用户退出操作  先把session中的用户清除 ,然后把session失效
		request.getSession().removeAttribute("user");
		request.getSession().invalidate();
		
		log.info("-----用户请求退出成功-----");
		return;
	}
	
	/**
	 * @throws Exception 
	 * 
	* @Title: toHomepage 
	* @Description: 请求主页
	* @param @param request
	* @param @param response
	* @param @return
	* @return String
	* @throws
	 */
	@RequestMapping("/toHomepage")
	public String toHomepage(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		log.info("-----请求主页信息-----");
		User user = (User) request.getSession().getAttribute("user");
		
		//如果没有登录就返回登录界面
		if(user == null){
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
		
		log.info("-----返回主页信息成功-----");
		
		return "home";
	}
	
}
