public class Validator {

	public static boolean ifValidMenuChoice(String menuChoice) {
		boolean flag = false;
		if (menuChoice.equals("1") || menuChoice.equals("2") || menuChoice.equals("3")) {
			flag = true;
		}
		return flag;
	}
	
}
