	public class TabNEntiers{
		public static void main(String [] args){
			int i;
			int N;
			int []tab;
			int p;
			int a;
			int a2;
			int a3;
			int b;
			int c;
			int []tabbis;

		System.out.print("Donner la taille du tableau : ");
		N = Lire.i();
		tab = new int[N];
		
		for(i = 0; i < N; i++){
		System.out.print("Donner un nombre strictement positif a stocker dans le tableau "+i+" : ");

		  tab[i] = Lire.i();
		}
		System.out.println(" ");

		System.out.print("Donner un autre nombre pour la valeur p : ");
		p = Lire.i();

		System.out.println(" ");
		
		a = 0;

		for(i = 0; i < N; i++){
			if(tab[i] < p){
				a = a + 1;
			}
		}

System.out.println("Le nombre d'entiers strictement inferieur a "+p+" est de : "+a);

		System.out.println(" ");
		
	     	b = 0;

		for(i = 0; i < N; i++){
			if(tab[i] == p){
				b = b + 1;
			}	
		}

System.out.println("Le nombre d'entiers egal a "+p+" est de : "+b);
		System.out.println(" ");
		
		c = 0;
	
		for(i = 0; i < N; i++){
			if(tab[i] > p){
			 	 c = c + 1;
			}
		}
System.out.println("Le nombre d'entiers superieur a "+p+" est de : "+c);

		System.out.println(" ");
		a2 = 0;
		a3 = a;
		tabbis = new int [N];
		
		for(i = 0; i < N; i++){
			if(tab[i] < p){
				tabbis[a2] = tab[i];
				a2 = a2 + 1;
			}else{
				tabbis[a3] = tab[i];
				a3 = a3 + 1;
			}

		}

System.out.println("tabbis : ");
		for(i = 0; i < p; i++){
			System.out.print(" "+tabbis[i]);
		}
		System.out.println(" ");
		System.out.println("Fin du programme");
	    }
	}