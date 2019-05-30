package StringLength;

public class CheckLength {
	void check(String s) {
		try {
			if(s.length()>15) {
				throw new StringLengthException("rsfgde");
			}
		
		}catch(StringLengthException e) {
			System.out.println(e);
		}
		
	}
}
