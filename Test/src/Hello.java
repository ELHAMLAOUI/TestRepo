import java.io.InputStream;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner sc = null;
		Jour jour = null;
		if (args.length == 0) {
		  sc = new Scanner(System.in);
		  System.out.println("Merci de ...");
		  jour =  Jour.valueOf(sc.next());
		}
		else 
		 jour = Jour.valueOf(args[0]);
	
	if (jour == Jour.SAMEDI) System.out.print("fin de semaine : ");
	switch(jour)	{
		case SAMEDI :
		case DIMANCHE :
			System.out.println("se reposer");
			break;
		default : 
			System.out.println("travailler");
			break;
	}
	}

}
