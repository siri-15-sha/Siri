package pack1;
import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter b:");
		System.out.println("Enter h:");
		float b=obj.nextFloat();
		float h=obj.nextFloat();
		float a=(b*h)/2;
		System.out.println("Area of Triangle: "+a);
		System.out.printf("%1.3f", a);
		

	}

}
