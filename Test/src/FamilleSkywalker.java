public class FamilleSkywalker {
  public static void main(String[] arguments) {

        String[][] tabMembres = {
                {"Padmé","AMIDALA"},
                {"Morrigan","CORDE"},
                {"Mara","JADE"},
                {"Leia","ORGANA"},
                {"Anakin","SKYWALKER"},
                {"Ben","SKYWALKER"},
                {"Cade","SKYWALKER"},
                {"Kol","SKYWALKER"},
                {"Luke","SKYWALKER"},
                {"Nat","SKYWALKER"},
                {"Shmi","SKYWALKER"},
                {"Anakin","SOLO"},
                {"Han","SOLO"},
                {"Jacen","SOLO"},
                {"Jaina","SOLO"}
                };
	
	System.out.println("Les 15 membres de la Famille Skywalker sont :");	
	for(int i=0;i<tabMembres.length;i++){
		System.out.println(tabMembres[i][1]+" "+tabMembres[i][0]);
	}
	 // tableau de 20 personnes non définies
        Personne[] tabPersonnes = {null, null, null, null, null,
                 null, null, null, null, null,
                 null, null, null, null, null,
                 null, null, null, null, null
                } ;
	// Remplissage tabPersonnes[]
	for(int i=0;i<15;i++){
		tabPersonnes[i] = new Personne(tabMembres[i][1],tabMembres[i][0]);
	}
	
	// Affichage de tabPersonnes
	System.out.println("\nLes 15 membres de la Famille Skywalker sont :");
	for(int i=0;i<15;i++){
		System.out.println(tabPersonnes[i].nom+" "+tabPersonnes[i].prenom);
	}
	//Tri du tableau par ordre alphabétique croissant des prénoms
	trierTableauDeChaines(tabMembres, tabMembres.length);
	//Affichage du Tableau Trié
	System.out.println("\nLes 15 membres de la Famille Skywalker triés par prénom :");	
	for(int i=0;i<tabMembres.length;i++){
		System.out.print(tabMembres[i][0]+" "+tabMembres[i][1]+"-");
	}
	//Tri tableau avec  trierTableauDePersonnes()
	 trierTableauDePersonnes(tabPersonnes, 15);
	//Affichage du Tableau Trié
	System.out.println("\n\nLes 15 personnes de la Famille Skywalker triées par nom puis prénom :");
	for(int i=0;i<15;i++){
		System.out.print(tabPersonnes[i].prenom+" "+tabPersonnes[i].nom+"-");
	}
 } // fin du main()
 //Procédure de Tri par ordre alphabétique croissant des prénoms
 public static void trierTableauDeChaines(String[][] pfTab,int pfNbATrier){
	  for(int j=0;j<pfNbATrier-1;j++){
		for(int i=j+1;i<pfNbATrier;i++){ 
			if (pfTab[j][0].compareTo(pfTab[i][0]) > 0 ) { //pfTab[j][0]est dans l'ordre alphabétique après pfTab[i][0]
			String ech0 = pfTab[j][0];
			String ech1 = pfTab[j][1];
			pfTab[j][0] = pfTab[i][0];
			pfTab[j][1] = pfTab[i][1];
			pfTab[i][0]=ech0;
			pfTab[i][1]=ech1;
			}
		}
	} 
 }
 public static void trierTableauDePersonnes(Personne[] pfTab,int pfNbATrier){
	for(int j=0;j<pfNbATrier-1;j++){
		for(int i=j+1;i<pfNbATrier;i++){ 
			if ((pfTab[j].nom+" "+pfTab[j].prenom).compareTo(pfTab[i].nom+" "+pfTab[i].prenom) > 0 ) { //pfTab[j][0]est dans l'ordre alphabétique après pfTab[i][0]
			String ech_prenom = pfTab[j].prenom;
			String ech_nom = pfTab[j].nom;
			pfTab[j].prenom = pfTab[i].prenom;
			pfTab[j].nom = pfTab[i].nom;
			pfTab[i].prenom=ech_prenom;
			pfTab[i].nom=ech_nom;
			}
		}
	}
 }
}// fin de la classe