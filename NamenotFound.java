package nameNotFoud;

import java.util.Scanner;

public class NamenotFound {
	public static void main(String args[]) throws NameNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array of strings");
		String s[]=new String[5];
		for(int i=0;i<5;i++) {
			s[i]=sc.next();
		}
		String str=sc.next();
		NameNotFoundException n=new NameNotFoundException();
		n.NameMet(str,s);
	}
}
