public class CarteMonstre extends Carte
{
	private final int level;
	private final String type;
	private int attack;
	private int defense;
	
	public CarteMonstre(String name, String attribut, int level, String type,int attack, int defense)
	{
		super(name, attribut);
		this.level = level;
		this.type = type;
		this.attack = attack;
		this.defense = defense;
	}

	public int getAttack()
	{
		return this.attack;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}

	public int getDefense()
	{
		return this.defense;
	}

	public void setDefense(int defense)
	{
		this.defense = defense;
	}

	public int getLevel()
	{
		return this.level;
	}

	public String getType()
	{
		return this.type;
	}

	@Override
	public String toString()
	{
		return "CarteMonstre [name= "+this.getName()+", type= "+this.type+", attribut= "+this.getAttribut()+", level= " + this.level + ", attack= " + this.attack + ", defense= " + this.defense + "]";
	}
	
	
}