package Banktsample;

public class account {
	public int balance;
	public int acc_id;
	public account(int balance,int acc_id) {
		this.balance=balance;
		this.acc_id=acc_id;
	}
	synchronized public void deposit(int amount) {
		this.balance=amount+this.balance;
		display_balance();
	}
	 synchronized public void withdraw(int amount) {
		int flag=1;
		try {
			if(this.balance<amount)
				throw new low_balance("Insufficient resource!");
		}
		catch(low_balance e) {
			flag=0;
			System.out.println(e.getMessage());
		}
		if(flag==1) {
		this.balance=this.balance-amount;
		display_balance();
		}
	}
	public void display_balance() {
		System.out.println("Balance:"+balance+"Rs");
	}
}
