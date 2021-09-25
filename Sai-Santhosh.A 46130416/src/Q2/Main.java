package Q2;
public class Main 
{
	public static void main(String[] args)
	{
		try
		{
			Account a = new Account("Sai",12000);
			Transaction t = new Transaction();
			System.out.println(a.getBalance());
			System.out.println(t.deposit(a,500));
			System.out.println(t.withdraw(a,5000));
			System.out.println(t.withdraw(a,20000));
		}
		catch(InsufficientBalanceException i)
		{
			System.out.println("Insufficient Balance");
		}
	}
}
