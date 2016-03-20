package fr.projets.java.cardgame;

public enum TypeCarte
{
	AQUA("Aqua"),
	BETE("Bête"),
	BETE_AILEE("Bête Ailée"),
	BETE_DIVINE("Bête Divine"),
	BETE_GUERRIER("Bête Guerrier"),
	DEMON("Démon"),
	DINOSAURE("Dinosaure"),
	DRAGON("Dragon"),
	ELFE("Elfe"),
	GUERRIER("Guerrier"),
	INSECTE("Insecte"),
	MACHINE("Machine"),
	MAGICIEN("Magicien"),
	PLANTE("Plante"),
	POISSON("Poisson"),
	PSYCHIQUE("Psychique"),
	PYRO("Pyro"),
	REPTILE("Reptile"),
	ROCHER("Rocher"),
	SERPENT_DE_MER("Serpent de Mer"),
	TONNERRE("Tonnerre"),
	ZOMBIE("Zombie");
	
	private String typeCarte;
	
	private TypeCarte(String type)
	{
		this.typeCarte = type;
	}
	
	public String getTypeCarte()
	{
		return this.typeCarte;
	}
}