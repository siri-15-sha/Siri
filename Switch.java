package pack2;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice:");
		int ch=obj.nextInt();
		switch (ch)
		{
		case 1: 
			System.out.println("Addition:"+(a+b));
			break;
		case 2:
			System.out.println("Subtraction:"+(a-b));
			break;
		case 3:
			System.out.println("Multiplication:"+(a*b));
			break;
		case 4:
			System.out.println("Division:"+(a/b));
			break;
			default:
			System.out.println("Invalid choice");

	}
	}

}
