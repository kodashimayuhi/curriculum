package check;

import constants.Constants;

public class Check {	
	
	 private static String firstName = "佑飛";
	 private static String lastName = "小田島";
	
	public static void main(String[] args) {
	
	System.out.println("printNameメソッド→" + printName(lastName, firstName));
	
	Pet human = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	human.introduce();
	
	Pet robot = new Pet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	robot.introduce();
			
	}
	
	public static String printName(String x, String y) {
		String printName = x + y;
		return printName;
	}
		
	}
