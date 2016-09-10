package cn.rong.superLottery.model;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class DbColorball {


	private Integer id;		//我自己定的id 
	private int num1;		//第一个号码
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	private int num6;
	
	
	private int luckyNum;	//幸运号
	private Date otime;		//开奖时间
	private String sid;		//发行的编号
	
	
	public DbColorball() {
		super();
	}

	

	public DbColorball(Integer id) {
		super();
		this.id = id;
	}



	public DbColorball(Integer id, int num1, int num2, int num3, int num4, int num5, int num6, int luckyNum, Date otime,
			String sid) {
		super();
		this.id = id;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
		this.luckyNum = luckyNum;
		this.otime = otime;
		this.sid = sid;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public int getNum3() {
		return num3;
	}


	public void setNum3(int num3) {
		this.num3 = num3;
	}


	public int getNum4() {
		return num4;
	}


	public void setNum4(int num4) {
		this.num4 = num4;
	}


	public int getNum5() {
		return num5;
	}


	public void setNum5(int num5) {
		this.num5 = num5;
	}


	public int getNum6() {
		return num6;
	}


	public void setNum6(int num6) {
		this.num6 = num6;
	}


	public int getLuckyNum() {
		return luckyNum;
	}


	public void setLuckyNum(int luckyNum) {
		this.luckyNum = luckyNum;
	}


	public Date getOtime() {
		return otime;
	}


	public void setOtime(Date otime) {
		this.otime = otime;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	@Override
	public String toString() {
		return "DbColorball [id=" + id + ", num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4
				+ ", num5=" + num5 + ", num6=" + num6 + ", luckyNum=" + luckyNum + ", otime=" + otime + ", sid=" + sid
				+ "]";
	}
	
	
}
