package nameNotFoud;

import java.util.InputMismatchException;

public class NameNotFoundException extends Exception{
	void NameMet(String s,String []str) throws NameNotFoundException, InputMismatchException{
		int cT=0,cF=0,i=0;
		for( i=0;i<str.length;i++) {
				if(str[i].equals(s)) {
					cT++;
				} else {
					cF++;
				}	
		}		
				try {
					if(cF==s.length())
						throw new NameNotFoundException();
			}catch (NameNotFoundException e ) {
				System.out.println("You are not Enrolled for the clas ");
			}
			catch(InputMismatchException e) {
				System.out.println("enter only name ");
			}
		}
}
