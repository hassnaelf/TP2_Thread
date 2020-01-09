package javaa;

public class exo1_part2 extends Thread{

	public static void main(String[] args) {
		Thread TA = new Thread() {
			public void run() {
				for(int i=1;i<=1000;i++) {
					System.out.println(i);
				}
		}
			
	};
	Thread TB = new Thread() {
		public void run() {
			
			for(int i=1000;i>=1;i--) {
				System.out.println(i);
			}
	}
	};
	TA.start();
	TB.start();

}

	

}