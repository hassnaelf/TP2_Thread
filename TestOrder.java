package javaa;

public class TestOrder {
	public static void main(String[] args) {
		compteur C1 = new compteur("T1",10);
		new Thread(C1).start();
		compteur C2 = new compteur("T2",10);
		new Thread(C2).start();
		compteur C3 = new compteur("T3",10);
		new Thread(C3).start();
		compteur C4 = new compteur("T4",10);
		new Thread(C4).start();
		//3: L�affichage est de fait apparement al�atoire, l�ordonnanceur de la JVM donne 
		//la main � chacun des Threads d�une facon ind�termin�e que nous ne pouvons pas pr�voir.
		//on peut seulement supposer que tout thread qui ne dort pas aura la main de temps � autre.
		
		//4:Les deux Threads sont en concurrence bien entendu pour le CPU ,
		//la m�moire, mais aussi pour l�acc�s au flux de sortie .Par ailleurs la concurrence n�est pas forte car les deux threads 
		//ne partagent aucun objet ou variable, mis � part bien entendu les objets systemes tels que Systeme.out.
	

	}

}
