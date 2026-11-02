
/**
 * Write a description of class Square here.
 *
 * @author Luis Castillo
 * @version V1.0
 * @since 11/01/26
 */
import java.util.Scanner;
public class Square
{
private String name;
private double side;
public Square() {
    name = "Nothing";
    side = 0.0;
}

public Square(String inName, double inSide) {
    name = inName;
    side = inSide;
}
public void postOutput() {
    System.out.println("Name: " + name);
    System.out.println("Side length: " + side);
    System.out.printf("perimeter: %.2f%n", getPerimeter());
}
public void getInput() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the Square's name: ");
    name = input.nextLine();
    
    System.out.print("Enter the Square's side length: ");
    side = input.nextDouble();
}
public void setName(String newName) {
    name = newName;
}
public void setSide(double newSide) {
    side = newSide;
}
private double getPerimeter() {
    return side * 4;
}
}