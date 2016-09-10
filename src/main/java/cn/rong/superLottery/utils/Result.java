package cn.rong.superLottery.utils;

import java.io.Serializable;

/**
 * <p>Title:Result</p>
 * <p>Description:	</P>
 * <p>Company:www.sumpay.cn</p>		
 * @author ronghaosen
 *
 * @date 2016年8月26日 上午11:29:25
 */
public class Result implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean status;
	private String msg;
	private Object obj;
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
