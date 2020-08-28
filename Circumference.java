package pack1;
import java.util.*;

public class Circumference {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter radius(r): ");
		float r=obj.nextFloat();
		float a=2*3.14f*r;
		System.out.println("Circumference of circle: "+a);
		System.out.printf("%1.2f",a);

	}

}
