package com.revature.case_study;


class InvalidCodeException extends Exception{
	 public  InvalidCodeException(String msg){
		super( msg);
	}
}


class Repository{
	static String getCountryName(String countryCode) throws InvalidCodeException{ 

//70 to 99  -India
//908 = US

//011      -Dial somewhere outside of USA 

// No country with given code found
		String Country_code;
		int code=Integer.parseInt(countryCode);
		if(code>=70 && code<=99)
		{
			Country_code="India";
		}
		else if(code==908)
		{
			Country_code="US";
		}
		else if(countryCode.equals("011"))
		{
			 throw new InvalidCodeException("Dial somewhere outside of USA");
		}
		else
		{
			throw new InvalidCodeException("No country with given code found");
		}
		
		return Country_code;
	
 }
	
}

public class RepositoryImplementation {

	public static void main(String[] args) {

		
		Repository r=new Repository();
		try {
			System.out.println(r.getCountryName("011"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
