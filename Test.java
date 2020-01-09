package javaa;

public class Test {
	public static void main(String[] args) {
		valeur MyVal = new valeur(10);
		Ajob A1 = new Ajob(MyVal,1);
		Ajob A2 = new Ajob(MyVal,-1);
			Thread a=new Thread(A1);
			Thread b=new Thread(A2);
			a.start();
		b.start();
	}
}
