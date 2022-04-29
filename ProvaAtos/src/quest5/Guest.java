package quest5;

public class Guest implements User {

	public static void main(String[] args) {
		Guest guest = new Guest();

		if(guest.isAuthorized("WeAreAtos")) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Try Again");
		}
	}

	@Override
	public boolean isAuthorized(String word) {
		boolean status = false;
		if (word.equals("WeAreAtos")) {
			status = true;
		}
		return status;

	}
	


}
