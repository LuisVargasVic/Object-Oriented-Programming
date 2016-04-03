package assignment;

public class FooCorporation {
	private double basePay;
	private double hoursWorked;
	
	public FooCorporation(double a, double b){
		this.basePay = a;
		this.hoursWorked = b;
	}
	public double payment(){
		if (this.hoursWorked > 60 || this.basePay < 8){
			return -1.0;
		}
		else {
			if (this.hoursWorked > 40.0){
				return (this.hoursWorked * this.basePay) + (this.hoursWorked - 40.0) * this.basePay * 1.5;
			}
			else {
				return this.hoursWorked * this.basePay;
			}
		}	
	}
	public void notPaid(){
		
	}
	public static void main(String[] arguments){
		FooCorporation employee1 = new FooCorporation(7.5,35.0);
		FooCorporation employee2 = new FooCorporation(8.2,47.0);
		FooCorporation employee3 = new FooCorporation(10.0,73.0);
		System.out.println(employee1.payment());
		System.out.println(employee2.payment());
		System.out.println(employee3.payment());
	}
}
