import fr.projets.java.cardgame.*;

public class Carte
{
	private final String name;
	private final AttributCarte attribut;
	
	public Carte(String name, AttributCarte attribut)
	{
		this.name = name;
		this.attribut = attribut;
	}

	public String getName()
	{
		return this.name;
	}

	public AttributCarte getAttribut()
	{
		return this.attribut;
	}
	
}