package countGreater;

public class Check {
	void Add(int a,int b,int c) throws CountGreaterException {
		try {
			if((a+b+c)>100) {
				throw new CountGreaterException("fgd");
			}
		} catch(CountGreaterException e) {
			System.out.println("Exception");
		}
		
	}
}
