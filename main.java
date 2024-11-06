package atm;

import java.util.Scanner;

public class Main{
	private static int status;
	public static void main(String args[]) {
		Atmoperationimpl op=new Atmoperationimpl();
		Scanner scan=new Scanner(System.in);
		int accountnumber=1234;
		int atmpin=123;
		System.out.println("WELCOME TO NAGAS BANK ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum2=scan.nextInt();
		System.out.println("ENTER THE ATM PIN NUMBER");
		int atmpin2=scan.nextInt();
		if((accountnumber==atmnum2) &&(atmpin==atmpin2))
		{
			while(true)
			{
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit amount\n4.View MiniStatement\n5.exit");
				System.out.println("enter choice :");
				int ch=scan.nextInt();
				if(ch==1)
				{
					//System.out.println("View Available Balance");
					op.viewBalance();
				}
				else if(ch==2)
				{
					System.out.println(" Enter amount to withdrawn");
					double withdrawAmount=scan.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3)
				{
					System.out.println("Enter Amount to Deposit:");
					double depositAmount=scan.nextDouble();//5000
					op.depositAmount(depositAmount);
				}
				else if(ch==4)
				{
					op.viewMiniStatement();
					//System.out.println("View MiniStatement");
				}
				else if(ch==5)
				{
					System.out.println("Collect your ATM Card\n Thank you for choosing ATM Machine");
					System.exit(status);
				}
				else
				{
					System.out.println("Please enter correct choice");
				}
			}
		}
		else
		{
			System.out.println("incorrect ATM Number or pin");
			System.exit(status);
		}
	}

}
