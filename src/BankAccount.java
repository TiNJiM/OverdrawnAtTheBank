
public class BankAccount {
double balance;
String name;
public BankAccount (double b1, String n1) {
	balance = b1;
	name = n1;
}
public void deposit (double d) {
	balance += d;
}
public void withdraw (double w) {
	balance -= w;
}
}
