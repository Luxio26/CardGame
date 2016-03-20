public class Player
{
	public static final int DEFAULT_LIFEPOINTS = 8000;
	public static final int MINIMUM_LIFEPOINTS = 0;
	
	private int lifePoints;
	
	public Player()
	{
		this.lifePoints = DEFAULT_LIFEPOINTS;
	}

	public int getLifePoints()
	{
		return this.lifePoints;
	}

	public void setLifePoints(int lifePoints)
	{
		this.lifePoints = lifePoints;
	}
	
	public void lancerAttaque(CarteMonstre carteMonstre, Player cible)
	{
		int calcul = cible.getLifePoints() - carteMonstre.getAttack();
		if(calcul < MINIMUM_LIFEPOINTS)
			calcul = MINIMUM_LIFEPOINTS;
		
		cible.setLifePoints(calcul);
	}

	@Override
	public String toString()
	{
		return "Player [lifePoints=" + this.lifePoints + "]";
	}
}