package cn.rong.superLottery.model;

public class SuperNumber implements Comparable<SuperNumber> {

	private int num;	//数字
	private double chance;	//已经出现的概率
	private int counts;	//出现的次数
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getChance() {
		return chance;
	}
	public void setChance(double chance) {
		this.chance = chance;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	
	
	public int compareTo(SuperNumber o) {
		
		if(this.chance - o.chance < 0){
			return -1;
		}
		
		return 1;
	}
	
	
}
