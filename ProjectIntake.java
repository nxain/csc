
public class ProjectIntake {

	public static void main(String[] args) {

		ProjectObject project = new ProjectObject();
		
		System.out.println("Project Calculator.....................................\n");
		
		project.setName();
		project.setCustomer();
		project.setRate();
		project.setDuration();
		project.setBudget();
		project.getUnknownValue();

		System.out.println("\n\nProject Summary.........................................\n");
		System.out.println("Project name is: " +project.name);
		System.out.println("Customer name is: " +project.customer);
		
		System.out.println("Project budget is: $" +project.budget);
		System.out.println("Project duration is: " +project.duration + " hours.");
		System.out.println("Project hourly rate is: $" +project.rate);

	}

}
