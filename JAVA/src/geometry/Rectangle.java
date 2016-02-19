package geometry;
import javax.swing.*;

public class Rectangle extends Figure{
	double height = Double.parseDouble(JOptionPane.showInputDialog("Give height of the rectangle: "));
	double base = Double.parseDouble(JOptionPane.showInputDialog("Give base of the rectangle: "));
	
	// This child inherits the String figureName of the parent, so that way we reduce code
	
	public Rectangle(){
		super("Rectangle");
	}
	public Rectangle(String name){
		super(name);
	}
	
	/*In both calculateArea and calculatePerimeter we use abstraction because 
	  we use different formulas and that is because they are different figures*/
	
	public double calculateArea(){
		return base * height;
	}
	public double calculatePerimeter(){
		return base*2 + height*2;
	}
	
}
