import fr.projets.java.cardgame.*;

public class Main
{
	public static void main(String[] args)
	{
		CarteMonstre aCard = new CarteMonstre("Dragon étincelant", AttributCarte.VENT, 4, TypeCarte.DRAGON, 1900, 1600);
		Player yugi = new Player();
		Player kaiba = new Player();
		
		System.out.println(aCard.toString());
		
		System.out.println(kaiba.toString());
		yugi.lancerAttaque(aCard, kaiba);
		System.out.println(kaiba.toString());
	}
}