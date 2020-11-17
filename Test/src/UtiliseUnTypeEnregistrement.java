public class UtiliseUnTypeEnregistrement {
  public static void main(String[] arguments) {
        // création d'un nouvel enregistrement
        UnTypeEnregistrement unEnregistrement = new UnTypeEnregistrement();

        // affichage du contenu de ses champs
        System.out.println("unEnregistrement.champChaine = "+unEnregistrement.champChaine);
        System.out.println("unEnregistrement.champEntier = "+unEnregistrement.champEntier);

        // modification du contenu de ses champs
        unEnregistrement.champChaine = "IUT" ;
        unEnregistrement.champEntier = 2014 ;

        // affichage du contenu de ses champs
        System.out.println("unEnregistrement.champChaine = "+unEnregistrement.champChaine);
        System.out.println("unEnregistrement.champEntier = "+unEnregistrement.champEntier);
  
	// création d'un nouvel enregistrement
        UnTypeEnregistrement monEnregistrement = new UnTypeEnregistrement();

        // affichage du contenu de ses champs
        System.out.println("monEnregistrement.champChaine = "+monEnregistrement.champChaine);
        System.out.println("monEnregistrement.champEntier = "+monEnregistrement.champEntier);

        // modification du contenu de ses champs
        monEnregistrement.champChaine = "Place G. Brassens";
        monEnregistrement.champEntier = 1;

        // affichage du contenu de ses champs
        System.out.println("monEnregistrement.champChaine = "+monEnregistrement.champChaine);
        System.out.println("monEnregistrement.champEntier = "+monEnregistrement.champEntier);
	  
	// ******************************************************
        // création d'un nouvel enregistrement
        UnTypeEnregistrement monPremierEnregistrement = new UnTypeEnregistrement();

        // affiche la valeur des champs de monPremierEnregistrement
	System.out.println("monPremierEnregistrement.champChaine = "+monPremierEnregistrement.champChaine);
	System.out.println("monPremierEnregistrement.champEntier = "+monPremierEnregistrement.champEntier); 


        // création d'un nouvel enregistrement
        UnTypeEnregistrement monSecondEnregistrement = new UnTypeEnregistrement("IUT");

        // affiche la valeur des champs de monSecondEnregistrement
        System.out.println("monSecondEnregistrement.champChaine = "+monSecondEnregistrement.champChaine);
	System.out.println("monSecondEnregistrement.champEntier = "+monSecondEnregistrement.champEntier); 


        // création d'un nouvel enregistrement
        UnTypeEnregistrement MonTroisiemeEnregistrement = new UnTypeEnregistrement(-2);

        // affiche la valeur des champs de monTroisiemeEnregistrement
	System.out.println("MonTroisiemeEnregistrement.champChaine = "+MonTroisiemeEnregistrement.champChaine);
	System.out.println("MonTroisiemeEnregistrement.champEntier = "+MonTroisiemeEnregistrement.champEntier); 


        // création d'un nouvel enregistrement
        UnTypeEnregistrement MonQuatriemeEnregistrement = new UnTypeEnregistrement("IUTIUT",20142015);

        // affiche la valeur des champs de monQuatriemeEnregistrement
        System.out.println("MonQuatriemeEnregistrement.champChaine = "+MonQuatriemeEnregistrement.champChaine);
	System.out.println("MonQuatriemeEnregistrement.champEntier = "+MonQuatriemeEnregistrement.champEntier); 
	
	// ** PRIVATE DOUBLE
	// System.out.println("monPremierEnregistrement.champPrivateDouble = "+monPremierEnregistrement.champPrivateDouble);
	// Ce résultat n'est pas surprenant car la propriété chamPrivateDouble est de type privé
	  }
}