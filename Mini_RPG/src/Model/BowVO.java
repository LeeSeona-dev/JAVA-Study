package Model;

public class BowVO extends itemVO {
	
	private int durability;
	public BowVO(int itemNum, String name, int attackPower, int durability) {
		super(itemNum, name, attackPower);
		
		this.durability = durability;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	
	
	
	
}
