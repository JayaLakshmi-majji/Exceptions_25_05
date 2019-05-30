package AgeGreaterException;

import java.util.Scanner;

public class AgeGreaterException {
	public static void main(String args[]) throws AgeCriteria {
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		AgeCriteria ag=new AgeCriteria();
		ag.AgeCriteriamet(age);
	}
}
