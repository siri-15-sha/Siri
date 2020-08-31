package pack2;
import java.util.*;

public class Loop_A {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		for (char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
