
public abstract class Project {

	//create general references
	String name;
	String customer;
	String pm;
	String type;
	String shortDescription;
	double budget;
	int duration;
	int rate;
	int tier;
	int risk;
	int key;
	
	static int projCount = 0;
	StringBuilder longName = new StringBuilder();

	//add gregorian calendar date - creation, target, start...?
	
	public Project(){
		this.name = "empty";
		this.key = 10000;
		this.customer = "empty";
		this.pm = "empty";
		this.type = "empty";
		this.shortDescription = "empty";
		this.tier = 0;
		this.risk = 0;
		this.duration = 0;
		this.budget = 0.0;
		addToCount();
	}
	
	public Project(String name, String customer, String pm, String type, String shortDescription, double budget, int duration, int rate, int tier, int risk){
		setName(name);
		setCustomer(customer);
		setPm(pm);
		setType(type);
		setShortDescription(shortDescription);
		setBudget(budget);
		setDuration(duration);
		setRate(rate);
		setTier(tier);
		setRisk(risk);
		setKey();
		addToCount();
	}
	
	////get values
	public String getName(){
		return name;
	}
	
	public String getCustomer(){
		return customer;
	}
	
	public String getPm(){
		return pm;
	}
	
	public String getType(){
		return type;
	}
	
	public int getTier(){
		return tier;
	}
	
	public int getRisk(){
		return risk ;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public double getRate(){
		return rate;
	}
	
	public double getBudget(){
		return budget;
	}
	
	////set values
	public void setName(String name){
		this.name = name;
	}
	
	public void setCustomer(String customer){
		this.customer = customer;
	}
	
	public void setPm(String pm){
		this.pm = pm;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}
	
	public void setTier(int tier){
		this.tier = tier;
	}
	
	public void setRisk(int risk){
		this.risk = risk;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public void setRate(int rate){
		this.rate = rate;
	}
	
	public void setBudget(double budget){
		this.budget = budget;
	}
	
	public void setKey(){
		this.key = 1000;
	}
	
	//add to string
	public String toString(){
		String s;
		longName.append(Integer.toString(this.key));
		longName.append("--");
		longName.append(type);
		longName.append("--");
		longName.append(name);
		s = longName.toString();
		return s;
		
	}
	
	public void printSummary(){
		System.out.println(toString());
		System.out.println(name);
		System.out.println(customer);
		System.out.println(pm);
		System.out.println(type);
		System.out.println(shortDescription);
		System.out.println(budget);
		System.out.println(duration);
		System.out.println(rate);
		System.out.println(tier);
		System.out.println(risk);
		System.out.println(key);
		System.out.println("Total Number of Projects: " + projCount);
	}
	
	//add static project count
	public static void addToCount(){
		projCount++;
	}
	
	public static int getProjCount(){
		return projCount;
	}
	
}
