package exceptionstests;

public class Itest {
	
	public int getIntValue10() {
		return 10;
	}
	
	public String getStringValueITEST() {
		return "ITEST";
	}
	
	public String getIllegalArgumentException() {
		boolean exception = true;
		if(exception) {
			throw new IllegalArgumentException("exception message");
		}
		return "Exception doesn't work";
	}
}
