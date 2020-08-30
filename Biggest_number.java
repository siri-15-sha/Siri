package pack2;
import java.util.*;

public class Biggest_number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter 5 numbers:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		int d=obj.nextInt();
		int e=obj.nextInt();
		if(a>b && a>c && a>d && a>e)
		System.out.println("Biggest number:"+a);
		else if(b>c && b>d &&b>e)
			System.out.println("Biggest number:"+b);
		else if(c>d && c>e)
			System.out.println("Biggest number:"+c);
		else if(d>e)
			System.out.println("Biggest number:"+d);
		else
			System.out.println("Biggest number:"+e);
		

	}

}
