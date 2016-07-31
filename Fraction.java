
public class Fraction implements java.io.Serializable {
	
	private int numerator;
	private int denominator;
	private static char slash = '/';
	private double quotient;
	private String rational;
	private String n;
	private String d;
	
	public Fraction(){
		numerator = 1;
		denominator = 1;
		calcQuotient();
		makeRational();
	}
	
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		calcQuotient();
		makeRational();
	}
	
	public int getNumerator(){
		return numerator;
	}
	
	public int getDenominator(){
		return denominator;
	}
	
	public String getRational(){
		makeRational();
		return rational;
	}
	
	public double getQuotient(){
		return quotient;
	}
	
	public void printFraction(){
		System.out.println(getRational());
		System.out.println(getQuotient());
	}
	
	public void setNumerator(int numerator){
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator){
		this.denominator = denominator;
	}
	
	private void calcQuotient(){
		quotient = (double)numerator / (double)denominator;
	}
	
	private void makeRational(){
		n = Integer.toString(numerator);
		d = Integer.toString(denominator);
		rational = n + slash + d;
	}
}

