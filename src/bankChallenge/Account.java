package bankChallenge;

public class Account implements iAccount{
	
	protected static final int bankBranchDefault = 0001; 
	
	protected int bankBranch;
	protected int number;
	protected double balance;
	protected Customers costumer;
	
	
	public static int sequential = 0;
	
		public Account(Customers costumer) {
		this.bankBranch =Account.bankBranchDefault;
		this.number=sequential++;
		this.costumer = costumer;
		}
	

	public int getBankBranch() {
		return bankBranch;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double value) {
		balance -= value;
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, iAccount destinationAccount) {
		this.withdraw(value);
		destinationAccount.deposit(value);
		
	}


	public void bankStatement() {
		
		
	}
	
	protected void printInfo() {
		System.out.println(String.format("Cliente: %s",this.costumer.getName()));
		System.out.println(String.format("Agencia: %d",this.bankBranch));
		System.out.println(String.format("Number: %d",this.number));
		System.out.println(String.format("Saldo: %.2f",this.balance));
	}
}
