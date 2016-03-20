package fr.projets.java.cardgame;


public enum AttributCarte
{
	TENEBRES("Ténèbres"),
	LUMIERE("Lumière"),
	FEU("Feu"),
	EAU("Eau"),
	TERRE("Terre"),
	VENT("Vent"),
	MAGIE("Magie"),
	PIEGE("Piège");

	private String attributCarte;
	
	private AttributCarte(String attribut)
	{
		this.attributCarte = attribut;
	}
	
	public String getAttributCarte()
	{
		return this.attributCarte;
	}
}