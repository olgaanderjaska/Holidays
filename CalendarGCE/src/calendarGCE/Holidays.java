package calendarGCE;
import java.util.Calendar; 
import java.util.Date;
import java.util.Date.*;

public class Holidays {
     private String a;
	public static Date PresidentsDayObserved (int nYear)
	    {
	    // Third Monday in February
	    int nX;
	    int nMonth = 1; // February
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 1);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 16);
	        case 1 : // Monday
	        return new Date(nYear, nMonth, 15);
	        case 2 : // Tuesday
	        return new Date(nYear, nMonth, 21);
	        case 3 : // Wednesday
	        return new Date(nYear, nMonth, 20);
	        case 4 : // Thursday
	        return new Date(nYear, nMonth, 19);
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 18);
	        default : // Saturday
	        return new Date(nYear, nMonth, 17);
	        }
	    }
	
	 public static Date NewYearsDay (int nYear)
	    {
	    // January 1st
	    int nMonth = 0; // January
	    return new Date(nYear, nMonth, 1);
	    }
	    public static Date NewYearsDayObserved (int nYear)
	    {
	    int nX;
	    int nMonth = 0;         // January
	    int nMonthDecember = 11;    // December
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 1);
	    nX = dtD.getDay();
	    if (nYear > 1900)
	        {
	        nYear -= 1900;
	        }
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 2);
	        case 1 : // Monday
	        case 2 : // Tuesday
	        case 3 : // Wednesday
	        case 4 : // Thursday
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 1);
	        default :
	        // Saturday, then observe on friday of previous year
	        return new Date(--nYear, nMonthDecember, 31);
	        }
	    }
	    
	    public Date MartinLutherKingObserved (int nYear)
	    {
	    // Third Monday in January
	    int nX;
	    int nMonth = 0; // January
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 1);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 16);
	        case 1 : // Monday
	        return new Date(nYear, nMonth, 15);
	        case 2 : // Tuesday
	        return new Date(nYear, nMonth, 21);
	        case 3 : // Wednesday
	        return new Date(nYear, nMonth, 20);
	        case 4 : // Thursday
	        return new Date(nYear, nMonth, 19);
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 18);
	        default : // Saturday
	        return new Date(nYear, nMonth, 17);
	        }
	    }
	    
	    public static Date GoodFridayObserved(int nYear)
	    {
	    // Get Easter Sunday and subtract two days
	    int nEasterMonth    = 0;
	    int nEasterDay      = 0;
	    int nGoodFridayMonth    = 0;
	    int nGoodFridayDay  = 0;
	    Date dEasterSunday;
	    dEasterSunday = EasterSunday(nYear);
	    nEasterMonth = dEasterSunday.getMonth();
	    nEasterDay = dEasterSunday.getDate();
	    if (nEasterDay <= 3 && nEasterMonth == 3) // Check if <= April 3rd
	        {
	        switch(nEasterDay)
	        {
	        case 3 : 
	            nGoodFridayMonth = nEasterMonth - 1;
	            nGoodFridayDay   = nEasterDay - 2;
	            break;
	        case 2 :
	            nGoodFridayMonth = nEasterMonth - 1;
	            nGoodFridayDay   = 31;
	            break;
	        case 1 :
	            nGoodFridayMonth = nEasterMonth - 1;
	            nGoodFridayDay   = 31;
	            break;
	        default:
	            nGoodFridayMonth = nEasterMonth;
	            nGoodFridayDay   = nEasterDay - 2;
	        }
	        }
	    else
	        {
	        nGoodFridayMonth = nEasterMonth;
	        nGoodFridayDay   = nEasterDay - 2;
	        }
	    return new Date(nYear, nGoodFridayMonth, nGoodFridayDay);
	    }
     
	    public static Date MemorialDayObserved (int nYear)
	    {
	    // Last Monday in May
	    int nX;
	    int nMonth = 4; //May
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 31);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 25);
	        case 1 : // Monday
	        return new Date(nYear, nMonth, 31);
	        case 2 : // Tuesday
	        return new Date(nYear, nMonth, 30);
	        case 3 : // Wednesday
	        return new Date(nYear, nMonth, 29);
	        case 4 : // Thursday
	        return new Date(nYear, nMonth, 28);
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 27);
	        default : // Saturday
	        return new Date(nYear, nMonth, 26);
	        }
	    }
	    
	    public static Date IndependenceDayObserved (int nYear)
	    {
	    int nX;
	    int nMonth = 6; // July
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 4);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 5);
	        case 1 : // Monday
	        case 2 : // Tuesday
	        case 3 : // Wednesday
	        case 4 : // Thursday
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 4);
	        default :
	        // Saturday
	        return new Date(nYear, nMonth, 3);
	        }
	    }
	    public static Date IndependenceDay (int nYear)
	    {
	    int nMonth = 6; // July
	    // July 4th
	    return new Date(nYear, nMonth, 4);
	    }
	    
	    public static Date LaborDayObserved (int nYear)
	    {
	    // The first Monday in September
	    int nX;
	    int nMonth = 8; // September
	    Date dtD;
	    dtD = new Date(nYear, 9, 1);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 2);
	        case 1 : // Monday
	        return new Date(nYear, nMonth, 7);
	        case 2 : // Tuesday
	        return new Date(nYear, nMonth, 6);
	        case 3 : // Wednesday
	        return new Date(nYear, nMonth, 5);
	        case 4 : // Thursday
	        return new Date(nYear, nMonth, 4);
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 3);
	        default : // Saturday
	        return new Date(nYear, nMonth, 2);
	        }
	    }
	    
	    public static Date ColumbusDayObserved (int nYear)
	    {
	    // Second Monday in October
	    int nX;
	    int nMonth = 9; // October 
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 1);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 9);
	        case 1 : // Monday
	        return new Date(nYear, nMonth, 15);
	        case 2 : // Tuesday
	        return new Date(nYear, nMonth, 14);
	        case 3 : // Wednesday
	        return new Date(nYear, nMonth, 13);
	        case 4 : // Thursday
	        return new Date(nYear, nMonth, 12);
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 11);
	        default : // Saturday
	        return new Date(nYear, nMonth, 10);
	        }
	    }
	    
	    public static Date VeteransDayObserved (int nYear)
	    {
	    //November 11th
	    int nMonth = 10; // November
	    return new Date(nYear, nMonth, 11);
	    }
	    public static Date RemembranceDayObserved (int nYear)
	    {
	    // Canadian version of Veterans Day
	    return VeteransDayObserved(nYear);
	    }
	    
	    public static Date ThanksgivingObserved(int nYear)
	    {
	    int nX;
	    int nMonth = 10; // November
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 1);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 26);
	        case 1 : // Monday
	        return new Date(nYear, nMonth, 25);
	        case 2 : // Tuesday
	        return new Date(nYear, nMonth, 24);
	        case 3 : // Wednesday
	        return new Date(nYear, nMonth, 23);
	        case 4 : // Thursday
	        return new Date(nYear, nMonth, 22);
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 28);
	        default : // Saturday
	        return new Date(nYear, nMonth, 27);
	        }
	    } 
	    
	    public static Date ChristmasDayObserved (int nYear)
	    {
	    int nX;
	    int nMonth = 11; // December
	    Date dtD;
	    dtD = new Date(nYear, nMonth, 25);
	    nX = dtD.getDay();
	    switch(nX)
	        {
	        case 0 : // Sunday
	        return new Date(nYear, nMonth, 26);
	        case 1 : // Monday
	        case 2 : // Tuesday
	        case 3 : // Wednesday
	        case 4 : // Thursday
	        case 5 : // Friday
	        return new Date(nYear, nMonth, 25);
	        default :
	        // Saturday
	        return new Date(nYear, nMonth, 24);
	        }
	    }
	    public static Date ChristmasDay (int nYear)
	    {
	    int nMonth = 11; // December
	    // December 25th
	    return new Date(nYear, nMonth, 25);
	    }
	    public void EasterSunday(int d) {
	    	System.out.println("This is easter method....");
	    	/
	    }
	    
	  
	   public void runDate() {
		   new Holidays();
	   }
}

