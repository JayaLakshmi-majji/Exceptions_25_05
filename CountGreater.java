package countGreater;

import java.util.Scanner;

public class CountGreater {
	public static void main(String args[]) throws CountGreaterException {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Check obj=new Check();
		obj.Add(a,b,c);
	}
}


