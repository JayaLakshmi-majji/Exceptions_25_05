package StringLength;

import java.util.Scanner;

public class MainCheck {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.nextLine();
		CheckLength obj=new CheckLength();
		obj.check(s);
	}
	
}
