import javax.swing.*;
public class Babylonian {
	double num;
	public Babylonian(double num){
		this.num = num;
	}
	public double sqrt(double num){
		double x = num / 2;
		double y = x + 1;
		while (x!=y){
			double z = num / x;
			y = x;
			x = (x+z)/2;
		}
		return x;
	}
	public static void main(String[] args){
		double ans= Double.parseDouble(JOptionPane.showInputDialog("Give a number to get  it's square root"));
		if (ans == 0){
			System.out.println("The square root of 0 is 0");
		}
		else{
			if (ans < 0){
				System.out.println("Error no square root for negative numbers.");
			}
			else{
				Babylonian number = new Babylonian(ans);
				System.out.println(number.sqrt(ans));
			}
		}
	}
}
