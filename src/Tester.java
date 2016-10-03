
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myAccount = new BankAccount (1000, "Brandon Northrop");
		myAccount.deposit (505.22);
		System.out.println (myAccount.balance);
		myAccount.withdraw (100);
		System.out.println ("The " + myAccount.name + " account balance is, " + myAccount.balance);
	}

}
