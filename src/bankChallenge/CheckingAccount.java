package bankChallenge;

public class CheckingAccount extends Account {
	
	public CheckingAccount(Customers client) {
		super(client);
		
	}

	@Override
	public void bankStatement() {
		System.out.println("Extrato Conta Corrente");
		printInfo();
	}

	
	
	}

