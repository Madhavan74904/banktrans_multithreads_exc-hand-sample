package Banktsample;
public class multthread {

	public static void main(String[] args) {
		account maddy=new account(1000,123);
		depositthread d=new depositthread(maddy,900);
		withdrawthread w=new withdrawthread(maddy,500);
		d.start();
		w.start();
}
}