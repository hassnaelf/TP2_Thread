package javaa;

public class valeur {
	int val;
	valeur(int vleur){
		this.val=vleur;
	}
	public int getVal() {
		return this.val;
	}
	public synchronized void add(int i)  {
		this.val=this.val+i;
	}
	public String toString() {
		return "la valeur = "+this.val;
	}
}

