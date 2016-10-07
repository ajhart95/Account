package Banking.Account;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	Date dateCreated = new Date();
	
	public Account(){
		get_id();
		getBalance();
		getAnnualInterestRate();
		getDateCreated();
	}
	
	public Account(int id, double balance){
		this();
		set_id(id);
		setBalance(balance);
	}
	
	public int get_id(){
		return id;
	}
	
	public void set_id(int id){
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		double monthly_rate = annualInterestRate / 12;
		return monthly_rate;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException
	{
		if ((balance - amount) >= 0) {
			balance = balance - amount;
			return balance;
		}
		else{
			throw new InsufficientFundsException();
		}
			
	}
	
	public double deposit(double amount){
		this.balance = balance + amount;
		return balance;
	}
	
}

