package calendarGCE;

import javax.swing.JOptionPane;

public class HoliHoli {
private static HoliFriend mainHoli;
private static String input;
private static int yearInput;
private static int ApprovedyearInput;

public static void main(String...args) {
	mainHoli = setHoli();
	int which = whichHoliday();
	System.out.println(which + "   TESTT");
	if (which == 0) {
		System.out.println("You picked Easter Day");
		ApprovedyearInput = getYearRequest();
		
		System.out.println(mainHoli.EasterMonday(yearInput));
	}
	if (which == 1) {
		System.out.println("You picked Christmas Day");
		ApprovedyearInput = getYearRequest();
		mainHoli.ChristmasDay(yearInput);
	}
	if (which == 2) {
		System.out.println("You picked Abraham Lincolns Birthday");
		ApprovedyearInput = getYearRequest();
		mainHoli. AbrahamLincolnsBirthday(yearInput);
	}
	if (which == 3) {
		System.out.println("You picked Columbus Day");
		ApprovedyearInput = getYearRequest();
		mainHoli.ColumbusDayObserved(yearInput);
	}
	if (which == 4) {
		System.out.println("You picked Labor Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. LaborDayObserved(yearInput);
	}
	if (which == 5) {
		System.out.println("You picked Martin Luther King");
		ApprovedyearInput = getYearRequest();
		mainHoli. MartinLutherKingObserved(yearInput);
	}
	if (which == 6) {
		System.out.println("You picked Memorial Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. MemorialDayObserved(yearInput);
	}
	if (which == 7) {
		System.out.println("You picked New Years Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. NewYearsDay(yearInput);
	}
	if (which == 8) {
		System.out.println("You picked Presidents Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. PresidentsDayObserved(yearInput);
	}
	if (which == 9) {
		System.out.println("You picked Thanksgiving Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. ThanksgivingObserved(yearInput);
	}
	if (which == 10) {
		System.out.println("You picked Veterans Day");
		ApprovedyearInput = getYearRequest();
		mainHoli.  VeteransDayObserved(yearInput);
	}
	if (which == 11) {
		System.out.println("You picked Independence Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. IndependenceDayObserved(yearInput);
	}
	if (which == 12) {
		System.out.println("You picked US Election Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. USElectionDay(yearInput);
	}
	if (which == 13) {
		System.out.println("You picked Valentines Day");
		ApprovedyearInput = getYearRequest();
		mainHoli. ValentinesDay(yearInput);
	}
	if (which == 14) {
		System.out.println("You picked Halloween");
		ApprovedyearInput = getYearRequest();
		mainHoli.  Halloween(yearInput);
	}
}
public static HoliFriend setHoli() {
	return new HoliFriend();
}
public static int whichHoliday() {
	Object[] options1 = {"Easter Day",
            "Christmas",
            "Abraham Lincolns Birthday", 
            "Columbus Day",
            "Labor Day",
            "Martin Luther King",
            "Memorial Day",
            "New Years Day",
            "Presidents Day",
            "Thanksgiving Day",
            "Veterans Day",
            "Independence Day",
            "US Election Day",
            "Valentines Day",
            "Halloween"};
	int b = JOptionPane.showOptionDialog(null,
            "Please choose a holiday day you are seeking for    ** TEST **",
            "Pick One",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            options1,
            null);
	return b;
}
public static int getYearRequest() {
	boolean statusYear= false;
	input = JOptionPane.showInputDialog("Enter the year");  //TEST
	yearInput = Integer.parseInt(input);
	statusYear = checkYear(yearInput);
	if (statusYear == true) {
		getYearRequest();
	}
	return yearInput;

	
}
public static boolean checkYear(int year) {
	boolean statusYear = false;
	if (year < 1600 || year > 2200) {
		System.out.println("Year is out of bound");
		statusYear = true;
	}
	return statusYear;
	
}
}
