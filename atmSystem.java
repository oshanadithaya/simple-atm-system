import java.util.Scanner;
public class atmSystem{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		double amount;
		double cBalance=400000;
		double daylimit=200000;
		double interest=cBalance*2/100;
		double cBalanceAfter;
		System.out.print("Enter Amount : " );
		amount=input.nextDouble();
		if(amount>cBalance)
		{
			System.out.println("Withdrawal is refused");
			System.out.println("Your account balance is lower!");
		}
		else if(amount>daylimit)
		{
			System.out.println("Withdrawal is refused");
			System.out.println("Enterd amount is higher than daylimit");
		}
		else if(cBalance<5000)
		{
			cBalanceAfter=cBalance-amount-interest;
			cBalance=cBalance-interest;
			System.out.println("Your withdrawal is complete");
			System.out.println("Your account balance is less than Rs:5000");
			System.out.println("A charge of 2% is made from your current balance");
			System.out.println("Rs:"+interest+" charged from your account");
			System.out.print("Your current account balance is : "+cBalanceAfter);
		}
		else if(amount<200)
		{
			System.out.print("Cannot withdraw amount less than Rs:200");
		}else{
			cBalanceAfter=cBalance-amount;
			System.out.println("Your withdrawal is completed");
			System.out.println("You have withdrawed : Rs:"+amount);
			System.out.print("Your current account balance is : "+cBalanceAfter);
		}
	}
}
		


