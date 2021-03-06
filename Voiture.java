package javaa;

public class Voiture implements Runnable { 
	public String nom; 
	public Parking park;
    public Voiture(String name, Parking park){
	this.nom=name; 
	this.park=park; 
    }
	public void run() {
	System.out.format("[%s]: Je d�bute !  \n", this.nom);
	
	    while(true){
		try {
			Thread.sleep((long)  (50000* Math.random()));
			System.out.format("[%s]: Je demande � rentrer  \n", this.nom);
			this.rentrer();
			System.out.format("[%s]: Je viens d'entrer \n", this.nom);
			Thread.sleep((long)  (50000* Math.random()));
			System.out.format("[%s]: Je demande � sortir  \n", this.nom);
			this.park.leave(this);  
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
	
	    public void rentrer() throws InterruptedException{	
			while (!(this.park.accept(this)))
			{
			    Thread.sleep((long)  (1000* Math.random()));
			    System.out.format("[%s]  : Je redemande � rentrer  \n", this.nom);
			}
		}
	    public static void main(String[] args) {
	    	int TailleParking=8;
	    	int nbVoitures=15; 
	    	Parking leParking = new Parking(TailleParking);
	    	Thread MesVoitures[] = new Thread[nbVoitures];
	    	for (int i =0; i< nbVoitures; i++){
	    	    MesVoitures[i]= new Thread(new Voiture(String.format("Voit %d ", i) , leParking));
	    	    MesVoitures[i].start();}}
	    }
