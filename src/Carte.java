public class Carte
{
	private final String name;
	private final String attribut;
	
	public Carte(String name, String attribut)
	{
		this.name = name;
		this.attribut = attribut;
	}

	public String getName()
	{
		return this.name;
	}

	public String getAttribut()
	{
		return this.attribut;
	}
	
}