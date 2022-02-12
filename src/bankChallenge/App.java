package bankChallenge;

public class App {

	public static void main(String[] args) {
		Customers Paulo = new Customers();
		Paulo.setNome("Paulo");
		
		Account ca = new CheckingAccount(Paulo);
		ca.deposit(100);
		
		Account sa = new SavingsAccount(Paulo);
		ca.transfer(50, sa);
		
		ca.printInfo();
		sa.printInfo();

	}

}
