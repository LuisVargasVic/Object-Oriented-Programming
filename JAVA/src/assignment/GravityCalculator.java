package assignment;

public class GravityCalculator {
	private double gravity;
	private double initialVelocity;
	private double fallingTime;
	private double initialPosition;
	
	public GravityCalculator(double a, double b, double c, double d){
		this.gravity = a;
		this.initialVelocity = b;
		this.fallingTime = c;
		this.initialPosition = d;
	}
	public double finalposition(){
		return 0.5 * (this.gravity)*((this.fallingTime)*(this.fallingTime)) + (this.initialVelocity)*(this.fallingTime) + (this.initialPosition);
	}
	
	public static void main(String[] arguments) {
		 GravityCalculator ans = new GravityCalculator(-9.81,0.0,10.0,0.0);
		 System.out.println(ans.finalposition());
		}
}
