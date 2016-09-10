package cn.rong.superLottery.model;

import java.util.Date;

public class SuperLottery {

	private Integer id;		//我自己定的id 
	private int num1;		//第一个号码
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	
	private int luckyNum1;	//幸运号
	private int luckyNum2;
	private Date otime;		//开奖时间
	private String sid;		//发行的编号
	
	
	
	public SuperLottery() {
		super();
	}
	
	


	public SuperLottery(Integer id) {
		super();
		this.id = id;
	}




	public SuperLottery(Integer id, int num1, int num2, int num3, int num4, int num5, int luckyNum1, int luckyNum2,
			Date otime, String sid) {
		super();
		this.id = id;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.luckyNum1 = luckyNum1;
		this.luckyNum2 = luckyNum2;
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



	public int getLuckyNum1() {
		return luckyNum1;
	}



	public void setLuckyNum1(int luckyNum1) {
		this.luckyNum1 = luckyNum1;
	}



	public int getLuckyNum2() {
		return luckyNum2;
	}



	public void setLuckyNum2(int luckyNum2) {
		this.luckyNum2 = luckyNum2;
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
		return "SuperLottery [id=" + id + ", num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4
				+ ", num5=" + num5 + ", luckyNum1=" + luckyNum1 + ", luckyNum2=" + luckyNum2 + ", otime=" + otime
				+ ", sid=" + sid + "]";
	}
	
	
	
	
}
