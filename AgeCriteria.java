package AgeGreaterException;

public class AgeCriteria extends Exception{
	
	void AgeCriteriamet(int age )throws AgeCriteria{
		try {
		if(age<18) {
			throw new AgeCriteria();
		}else {
			System.out.println("Successfulll!");
		}
		}catch(AgeCriteria e) {
		System.out.println("Access denied - You must be at least 18 years old.");
		}
	}
}
