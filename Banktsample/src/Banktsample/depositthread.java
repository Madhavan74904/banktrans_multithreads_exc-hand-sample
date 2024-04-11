package Banktsample;

public class depositthread extends Thread{
	account X;
	int amount;
	public depositthread(account X,int amount) {
		this.X=X;
		this.amount=amount;
	}
	public void run() {
		this.X.deposit(this.amount);
	}
}