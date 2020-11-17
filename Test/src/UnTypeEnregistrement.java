public class UnTypeEnregistrement {
	
private double champPrivateDouble = 3.14;
	
UnTypeEnregistrement(double pfValeurInitialeDouble) {
	champPrivateDouble=pfValeurInitialeDouble;
}
	
  String champChaine = "champ" ;
  int champEntier = 0 ;


 UnTypeEnregistrement(){    // 1
        champChaine = "IUT" ;
        champEntier = 100 ;
  }

  UnTypeEnregistrement(String pfValeurInitialeChaine){    // 2
        champChaine = pfValeurInitialeChaine ;
        champEntier = 100 ;
  }

  UnTypeEnregistrement(int pfValeurInitialeEntier){    // 3
        champChaine = "champ champ" ;
        champEntier = pfValeurInitialeEntier ;
  }

  UnTypeEnregistrement(String pfValeurInitialeChaine, int pfValeurInitialeEntier){    // 4
        champChaine = pfValeurInitialeChaine ;
        champEntier = pfValeurInitialeEntier ;
  }
  public static void main(String[] arguments) {
        // création d'un nouvel enregistrement
        UnTypeEnregistrement unEnregistrement = new UnTypeEnregistrement();    // 12

        // affichage du contenu de ses champs
        System.out.println("unEnregistrement.champChaine = "+unEnregistrement.champChaine);
        System.out.println("unEnregistrement.champEntier = "+unEnregistrement.champEntier);
  
	
	UnTypeEnregistrement MonEnregistrement = new UnTypeEnregistrement();    // 12
	MonEnregistrement.champChaine ="IUT";
	MonEnregistrement.champEntier = 2014;
        // affichage du contenu de ses champs
        System.out.println("MonEnregistrement.champChaine = "+MonEnregistrement.champChaine);
        System.out.println("MonEnregistrement.champEntier = "+MonEnregistrement.champEntier); 
	  
	// Création du cinquième enregistrement
	UnTypeEnregistrement monCinquiemeEnregistrement = new UnTypeEnregistrement(123.4);
	
	// Affichage du cinquième enregistrement
	System.out.println("monCinquiemeEnregistrement.champChaine = "+monCinquiemeEnregistrement.champChaine);
        System.out.println("monCinquiemeEnregistrement.champEntier = "+monCinquiemeEnregistrement.champEntier); 
	System.out.println("monCinquiemeEnregistrement.champPrivateDouble = "+monCinquiemeEnregistrement.champPrivateDouble); 
	//Tentative de modification
	monCinquiemeEnregistrement.champChaine = "modification OK";
	monCinquiemeEnregistrement.champEntier = 9876;
	monCinquiemeEnregistrement.champPrivateDouble = 33.33;
	// Affichage Modifications
	System.out.println("monCinquiemeEnregistrement.champChaine = "+monCinquiemeEnregistrement.champChaine);
        System.out.println("monCinquiemeEnregistrement.champEntier = "+monCinquiemeEnregistrement.champEntier); 
	System.out.println("monCinquiemeEnregistrement.champPrivateDouble = "+monCinquiemeEnregistrement.champPrivateDouble); 
	// Les modifications fonctionnent
	
	}
}