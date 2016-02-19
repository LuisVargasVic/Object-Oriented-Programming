package geometry;
import javax.swing.*;

public class Circle extends Figure{
	double radius = Double.parseDouble(JOptionPane.showInputDialog("Give radius of the circle: "));
	public Circle()
    {
        super("Circle");
    }
      public Circle(String name)
    {
        super(name);
    }
    public double calculateArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double calculatePerimeter(){
    	return 2*Math.PI*radius;
    }
}
