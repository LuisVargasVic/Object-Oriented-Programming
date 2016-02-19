package geometry;
import javax.swing.*;

public class Triangle extends Figure {
	double height = Double.parseDouble(JOptionPane.showInputDialog("Give height of the triangle: "));
	double base = Double.parseDouble(JOptionPane.showInputDialog("Give base of the triangle: "));
	double side1 = Double.parseDouble(JOptionPane.showInputDialog("Give side 1 of the triangle: "));
	double side2 = Double.parseDouble(JOptionPane.showInputDialog("Give side 2 of the triangle: "));
	public Triangle(){
		super("Triangle");
	}
	public Triangle(String name){
		super(name);
	}
	public double calculateArea(){
		return (base * height)/2;
	}
	public double calculatePerimeter(){
		return side1 + side2 + base;
	}
}
