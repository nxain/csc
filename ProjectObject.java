import java.util.Scanner;

public class ProjectObject {
	
	public String name, customer, projectManager, riskLevel, projectType;
	public int duration=0, rate = 0, budget = 0, cost = 0;
			
	// Set strings for project
	public void setName()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter project name: ");
			name = keyboard.nextLine();
	}
	
	public void setCustomer()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter customer name: ");
			customer = keyboard.nextLine();
	}
	
	// Set values for project cost
	public void setRate()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the desired hourly rate as an integer: ");
			rate = keyboard.nextInt();
	}
	
	public void setDuration()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter project duration as hours (0 if unknown): ");
		duration = keyboard.nextInt();
	}
	
	public void setBudget()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter project budget (0 if unknown): ");
		budget = keyboard.nextInt();
	}
	
	
	// calculate unknown value
	public void getUnknownValue()
	{
		if(rate==0)
		{
			rate = (budget / duration);
			//return rate;
		} else if (duration == 0)
		{
			duration = (budget / rate);
			//return duration;
			
		} else {
			budget = (rate*duration);
			//return budget;
		}

	}
	
}
