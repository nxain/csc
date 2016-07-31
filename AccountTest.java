
public class AccountTest {

/** AccountTest
 * Class developed for CSC130 final project by James Cowgill.  
 * For testing the Account class.
 * Created: 5.4.2014
 */

	public static void main(String[] args) {
		
		Account[] account = new Account[4];
		
		
		/////////////////////// Test data for Account class
		
		account[0] = new Account("Smith", "Mike", "H", 500);
		account[1] = new Account("Barnes", "Susan", "D", 100);
		account[2] = new Account("Harrison", "Bill", "", 1000);
		account[3] = new Account("Honda", "Hiroko", "Midori", 10000);
		
		System.out.println("<--------------- Account Application --------------->" );
		System.out.println("\nTotal accounts:   " + Account.getAccountsTotal()+"\n");
		
		for(int i=0; i<(Account.getAccountsTotal()); i++)
		{
			account[i].report();
		}
		
		
		//////////////////////// Account class tests
		
		// tests for Mike's account
		System.out.println("\nMake $500 deposit to Mike Smith's account." );
		account[0].deposit(500);
		account[0].report();
		
		// test accessors for Susan's account
		System.out.println("\nMake $50 withdraw from Susan Barne's account." );
		account[1].withdraw(50);
		System.out.println("\nMake $70 withdraw from Susan Barne's account." );
		account[1].withdraw(70);
		account[1].report();
		
	}
}

