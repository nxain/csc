
public class Account {
	
	/** Account
	 * Class developed for CSC130 final project by James Cowgill.  
	 * 
	 * Created: 5.4.2014
	*/
	
	private String[] custName = new String[4];
	private double balance = 0.0;
	private String key = "";
	
	
	private static int accountsTotal = 0;  // should this go in a method
	private static String keyList[] = new String[5];  // static variable to hold list of account key strings, should update to ArrayList object
	
///////////// Constructors
	
	public Account()  // default constructor - just in case
	{
		custName[0] = "null";
		custName[1] = "Unknown";
		custName[2] = "Unknown";
		custName[3] = "Unknown";
		balance = 0;
		accountsTotal++;
	}
	
	
	public Account(String initialLastName, String initialFirstName, String initialMiddleName, double initialBalance)  // constructor for new accounts
	{
		custName[0] = setKeyGen();
		custName[1] = initialLastName;
		custName[2] = initialFirstName;
		custName[3] = initialMiddleName;
		balance = initialBalance;
		accountsTotal++;
	}

	
///////////// Instance Methods
	
	public void deposit(int deposit)  // add money to this account's balance
	{
		balance = balance + deposit;
		inquire();
	}

	
	public void withdraw(int withdraw)  // take away money from this account's balance
	{
		if(withdraw > balance)
		{
			System.out.println("You have insufficent funds for this transaction.");
		} else {
			balance = balance - withdraw;
		}
		inquire();
	}


	public void inquire()  // writes balance inquiry for this object
	{
		System.out.println("\nCurrent account balance for account " + custName[0]+" is: $" + balance);
	}
		

	public void report()  // writes a report to the screen for this account
	{
		System.out.println("\nAccount Report..............................");
		System.out.println("Account Number:  " + custName[0] + "\nLast Name:       " + custName[1] + "\nFirst Name:      " + custName[2] + "\nMiddle Name:     " + custName[3]);
		System.out.println("Current Balance: $" + balance); 
	}
	
	private String setKeyGen()  // sets the key with a random number
	{
		int flag = 1;
		do
		{
			key = getRandKey();  // call to generate random number
			for(int i=0; i<keyList.length;i++)
			{
				if(key.equals(keyList[i])) //check to make sure it's not a duplicate
				{
					flag = -1;
				}
			}
		} while(flag == -1);
		keyList[accountsTotal] = key;  //add a new entry to the keyList
		return key;
	} 
		
	private String getRandKey()  //generates 9 random digits, one at a time removing a starting 0
	{
		String keyString = "";
		long randNum = 0;
		for(int i=0; i<9; i++)
		{
			randNum = Math.round(((Math.random()*9)));
			if((i==0) && (randNum == 0)) 
				{
				i--;
				} else { 
					keyString = keyString + Long.toString(randNum);
				}
		}
		return keyString;
	}
	
	
///////////// Static Methods
	
	public static int getAccountsTotal()  //  return total number of account objects successfully created
	{
		return accountsTotal;
	}
}


