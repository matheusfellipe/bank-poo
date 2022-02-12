package bankChallenge;

public interface iAccount {
	 void withdraw(double value);
	
	 void deposit(double value) ;
	
	 void transfer(double value,iAccount destinationAccount);
	 
	 void bankStatement();
}
