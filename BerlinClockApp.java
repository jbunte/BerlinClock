import java.util.Scanner;

public class BerlinClockApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BerlinClockValidation bcv = new BerlinClockValidation();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out
					.println("What time is it?  Enter in the format HH:MM:SS (for example, 2:15PM would be 14:15:00):");
			String enteredTime = sc.next();
			// bcv.checkTime(sc, enteredTime); <---- this needs to be corrected
			StringBuilder time = new StringBuilder(enteredTime);
			String hoursString = time.substring(0, 2);
			int hours = Integer.parseInt(hoursString);
			String minutesString = time.substring(3, 5);
			int minutes = Integer.parseInt(minutesString);
			String secondsString = time.substring(6);
			int seconds = Integer.parseInt(secondsString);

			getSecondsRow(seconds);
			getHoursRow1(hours);
			getHoursRow2(hours);
			getMinutesRow1(minutes);
			getMinutesRow2(minutes);
			System.out.print("\nWould you like to enter another time? (y/n):");
			choice = sc.next();
		}
		System.out.println("Thanks for using the Berlin Clock Application!");
		sc.close();

	}

	private static void getMinutesRow2(int minutes) {
		int minutesSecondRow = minutes % 5;
		for (int i = 0; i < minutesSecondRow; i++)
			System.out.print("[Y]");
		if (minutesSecondRow == 3)
			System.out.print("[O]");
		else if (minutesSecondRow == 2)
			System.out.print("[O][O]");
		else if (minutesSecondRow == 1)
			System.out.print("[O][O][O]");
		else if (minutesSecondRow == 0)
			System.out.print("[O][O][O][O]");
		System.out.println();
	}

	private static void getMinutesRow1(int minutes) {
		int minutesFirstRow = minutes / 5;
		for (int k = 1; k <= minutesFirstRow; k++) {
			if (k % 3 == 0)
				System.out.print("[R]");
			else
				System.out.print("[Y]");
		}
		if (minutes < 55)
			for (int n = 0; n < 11 - minutesFirstRow; n++)
				System.out.print("[O]");
		System.out.println();
	}

	private static void getHoursRow2(int hours) {
		if (hours % 5 != 0)
			for (int j = 0; j < hours % 5; j++)
				System.out.print("[R]");
		if (hours % 5 == 3)
			System.out.print("[O]");
		else if (hours % 5 == 2)
			System.out.print("[O][O]");
		else if (hours % 5 == 1)
			System.out.print("[O][O][O]");
		System.out.println();
	}

	private static void getHoursRow1(int hours) {
		for (int i = 0; i < hours / 5; i++)
			System.out.print("[R]");
		if (hours < 5)
			System.out.print("[O][O][O][O]");
		else if (hours >= 5 && hours < 10)
			System.out.print("[O][O][O]");
		else if (hours >= 10 && hours < 15)
			System.out.print("[O][O]");
		else if (hours >= 15 && hours < 20)
			System.out.print("[O]");
		System.out.println();
	}

	private static void getSecondsRow(int seconds) {
		System.out.println("\nBerlin Clock:");
		for (int i = 0; i < seconds / 2; i++)
			System.out.print("x ");
		System.out.println();
	}

}
