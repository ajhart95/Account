package Banking.Account;

import org.junit.Test;
import static org.junit.Assert.*;

import Banking.Account.Account;
import Banking.Account.InsufficientFundsException;



public class Account_Test {
	Account test = new Account();
	
	private int ID = 1122;
	private double Balance = 20000;
	private double Annual_Interest = .045;
	private double WithDraw = 2500;
	private double Deposit = 3000;

	@Test
	public void TestBalance() throws InsufficientFundsException {
		test.set_id(ID);
		test.setBalance(Balance);
		test.setAnnualInterestRate(Annual_Interest);
		test.withdraw(WithDraw);
		test.deposit(Deposit);

		System.out.println("Account ID: " + test.get_id());
		System.out.println("Balance: " + test.getBalance());
		System.out.println("Monthly Interest Rate: " + test.getMonthlyInterestRate());
		System.out.println("Created account on " + test.getDateCreated());
		
		//This assert tests the balance of the account after withdrawing and depositing, thereby testing the necessary methods//
		assertTrue(test.getBalance() == 20500);
	}
	
	@Test
	public void Test_MonthlyRate(){
		test.setAnnualInterestRate(Annual_Interest);
		assertTrue(test.getMonthlyInterestRate() == 0.00375);
	}	
}

