import java.util.Scanner;

public class BerlinClockValidation {

	public boolean checkTime(Scanner sc, String enteredTime) {
		StringBuilder checkValues = new StringBuilder(enteredTime);
		boolean isValid = false;
		while (isValid == false) {
			if (checkValues.charAt(2) == ':')
				if (checkValues.charAt(5) == ':')
					if (checkValues.charAt(0) == 0 || checkValues.charAt(0) == 1 || checkValues.charAt(0) == 2)
						if (Character.isDigit(1))
							if (Character.isDigit(3))
								if (Character.isDigit(4))
									if (Character.isDigit(6))
										if (Character.isDigit(7))
											isValid = true;
										else
											System.out
													.println("Error! Please enter a valid time in the format HH:MM:SS");
		}
		return isValid;

	}

}
