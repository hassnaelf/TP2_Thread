package javaa;

public class exo1 implements Runnable{
	String val;
	int var;
	exo1(String val, int var){
		this.val=val;
		this.var=var;
		
	}
	public void run() {
		if(this.var==0) {
		for(int i=1;i<=1000;i++) {
			System.out.println(i+""+this.val);		}
		}
		else {
		for(int i=1000;i>=1;i--) {
			System.out.println(i+""+this.val);
		}
		}
	}
	public static void main(String[] args) {
		exo1 TA = new exo1("TA",0);
		new Thread( TA).start();
		exo1 TB = new exo1("TB",1);
		new Thread( TB).start();

	}
}
