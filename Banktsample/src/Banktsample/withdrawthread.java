package Banktsample;

public class withdrawthread extends Thread{
	account X;
	int amount;
	public withdrawthread(account X,int amount) {
		this.X=X;
		this.amount=amount;
	}
	public void run() {
		this.X.withdraw(this.amount);
	}
}
