package javaa;

public class compteur implements Runnable{
	String Nom;
	int MaxValue;
	compteur(String Nom,int MaxValue){
		this.Nom=Nom;
		this.MaxValue=MaxValue;
	}
	@Override
	public void run() {
		long d=(long)(Math.random()*100);
		for(int i=1;i<=MaxValue;i++) {
			System.out.println("nom : "+this.Nom+" Valeur = "+i+"***"+d);
			
			
			try {
				Thread.sleep(d);
				//System.out.println((long) (Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
