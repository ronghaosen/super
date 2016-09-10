package cn.rong.superLottery.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.rong.superLottery.model.User;
import cn.rong.superLottery.utils.ConfigUtils;

/**
 * <p>Title:UserFilter</p>
 * <p>Description: 用户登录校验	</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月25日 下午2:51:45
 */
public class UserFilter implements HandlerInterceptor {

	private Log log = LogFactory.getLog(UserFilter.class);
	
	 /**
	  * controller 方法执行前执行此方法,返回true继续执行,返回false终止执行
	  */
	/**
	 * 使用本系统需要先登录,但是这个拦截器不拦截登录界面,如果先在session中查找是否已经登录,如果没有登录就跳转到登录界面,已经登录就放行
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//如果用户已经登录了就不再拦截
		if(request.getSession().getAttribute("user") != null){
			return true;
		}
		
		
		//首先这里不能够拦截登录的请求
		String servletPath = request.getServletPath();
		String loginPath = ConfigUtils.getProperty("loginPath");
		log.info("-----userFilter-----拦截请求-----" + servletPath);
		
		if(loginPath.equals(servletPath)){
			return true;
		}
		
		//先去session中查询用户是否已经登录,如果没有登录就跳转到登录界面
		User sessionUser = (User) request.getSession().getAttribute("user");
		
		if(sessionUser == null){
			log.info("-----一个不知道是不是人的未知体来访问我的系统-----没有登录就来访问-----");
			response.sendRedirect(request.getContextPath() + "/index.jsp");
			return false;
		}else{
			return true;
		}
		
	}

	
	/**
	 * controller 方法执行后但视图未返回前执行此方法  此处可以对模型数据进行加工,比如加入公共信息
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	/**
	 * controller 执行后且视图返回后执行此方法,这里可以得到执行controller时的异常信息
	 * 可以记录日志,资源清理等
	 * 
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
