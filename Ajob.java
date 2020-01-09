package javaa;

public class Ajob implements Runnable{
	
	valeur myVal;
	int i;
	
	Ajob(valeur myVal,int i){
		this.myVal=myVal;
		this.i=i;
		
	}
	
	
	public void run() {
		
		for(int k=0;k<10;k++) {
			myVal.add(i);
			System.out.println(myVal.val);
		}
	}
	
}
