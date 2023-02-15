package mybank;

import java.util.Scanner;

class Bank {
	static String un;
	static String pwd;
	static long pn;
	static double bal = 100;

	public void Signup(String name, String password, long phoneNumber) {
		un = name;
		pwd = password;
		pn = phoneNumber;
		System.out.println("SignUp done");
	}

	public void Login(String name, String password) {
		if (un.equals(name) && pwd.equals(password)) {
			System.out.println("login done");
		} else {
			System.out.println("Incorrect usernaem or password");
		}
	}

	public void checkBalance() {
		System.out.println(un + " balance is " + bal);
	}

	public void withDrawal(double amt) {
		if (amt <= bal) {
			System.out.println("take the amount");
			bal = bal - amt;
		} else {
			System.out.println("Entered amt is more than balance");
		}
	}
	
	public void deposit(double amt) {
		{
			System.out.println("Amount added Successfully");
			bal = bal + amt;
			System.out.println("New Balence after adding is "+bal);
		}
	}

	public void changePwd(String password, String newpwd) {
		if (pwd.equals(password)) {
			pwd = newpwd;
			System.out.println("PASSWORD CHANGED");
		} else {
			System.out.println("wrong password");
		}
	}

	public void logOut() {
		System.out.println("thanku visit again");
	}
}

public class myBank {
	static Bank b = new Bank();
	static boolean flag = true;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (flag) {
			System.out.println("****************");
			System.out.println("Select the option");
			System.out.println("1.Signup");
			System.out.println("2.Login");
			System.out.println("3.Check Balance");
			System.out.println("4.Withdarwl");
			System.out.println("5.Deposit");
			System.out.println("6.ChangePassword");
			System.out.println("7.Logout");
			System.out.println("*****************");

			int option = s.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the name");
				String name = s.next();
				System.out.println("Enter the password");
				String pwd = s.next();
				System.out.println("Enter the Phone number");
				long pn = s.nextLong();
				b.Signup(name, pwd, pn);

			}
				break;
			case 2: {
				System.out.println("Enter the name");
				String name = s.next();
				System.out.println("Enter the password");
				String pwd = s.next();
				b.Login(name, pwd);
			}
				break;
			case 3: {
				b.checkBalance();
			}
				break;
			case 4: {
				System.out.println("Enter the amount");
				double amt = s.nextDouble();
				b.withDrawal(amt);
			}
				break;
			case 5: {
				System.out.println("Enter the amount");
				double amt = s.nextDouble();
				b.deposit(amt);
			}
				break;
			case 6: {
				System.out.println("Enter the old password");
				String oldpwd = s.next();
				System.out.println("Enter the new password");
				String newpwd = s.next();
				b.changePwd(oldpwd, newpwd);
			}
				break;
			case 7: {
				b.logOut();
				flag = false;
			}
				break;
			default:

			{
				System.out.println("invalid option");
			}

			}
		}
	}

}
