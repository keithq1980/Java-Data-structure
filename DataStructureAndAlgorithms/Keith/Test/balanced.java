package Test;

public class balanced {

	/**
	 * 
	 */
	public balanced() {
		// TODO Auto-generated constructor stub
	}
	public static String getTheString(String str) {
		
		return new StringBuffer(str.replaceAll("", "BTI")).reverse().toString();
	}

}}
