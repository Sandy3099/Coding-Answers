import java.util.Scanner;
public class TaxCalculator 
{
	public static void main(String[] args)
	   {
	     double tax=0,it;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Annual Income");
	     it = sc.nextDouble();
	     if(it>=0 && it<=250000)
	        tax = 0;
	     else if(it>=250000 && it<=500000)
	        tax = 0.1 * (it-250000);
	     else if(it>=500000 && it<=1000000)
		tax=(0.2*(0.1*(it-250000))+(0.1*250000));
	     else
		tax=(0.3*(it-1000000))+(0.3*500000)+(0.2*250000)+(0.1*100000);
	     System.out.println("Income tax amount is "+tax);
	    }
}
