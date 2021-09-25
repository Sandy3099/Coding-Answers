package Q2;
public class Transaction 
{
	public static double deposit(Account account,double amount)
	{
		account.setBalance(account.getBalance()+amount);
		return account.getBalance();
	}
	public static void double withdraw(Account account,double amount)
	{
		if(account.getBalance()-amount<5000)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			account.setBalance(account.getBalance()-amount);
			return account.getBalance();
		}
	}

}
