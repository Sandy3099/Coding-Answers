package Q2;
import java.util.*;
import java.util.Time;
class InsufficientBalanceException extends Exception()
public class Account 
{
	private int accountNumber;
	double balance;
	public Account()
	{
		
	}
	public Account(int accountNumber,double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}
