package bankChallenge;

public class SavingsAccount extends Account {
	
	public SavingsAccount(Customers costumer) {
		super(costumer);
		
	}

	@Override
	public void bankStatement() {
	System.out.println("===Extrato Conta Poupança===");
	super.printInfo();
	}
}
