package HelloWorld;
import java.util.Date;
import java.util.Calendar;

public class HelloWorld{

  public static java.util.Calendar EasterMonday (int nYear)
    {
      int nEasterMonth = 0;
      int nEasterDay   = 0;
      int nMonthMarch  = 2; // March
      int nMonthApril  = 3; // April

     java.util.Calendar cEasterSunday = EasterSunday(nYear);
     nEasterMonth = cEasterSunday.get(Calendar.MONTH);
     nEasterDay = cEasterSunday.get(Calendar.DAY_OF_MONTH);
     if (nEasterMonth == nMonthMarch || nEasterDay == 31){
     java.util.Calendar cal = java.util.Calendar.getInstance();
     cal.set(nYear, nMonthApril, 1);
       return cal;
  }else{
       java.util.Calendar cal = java.util.Calendar.getInstance();
       cal.set(nYear, nEasterMonth, ++nEasterDay);
       return cal;
}
}
       public static java.util.Calendar EasterSunday(int nYear)
{ 
/*  Calculate Easter Sunday

Written by Gregory N. Mirsky

Source: 2nd Edition by Peter Duffett-Smith. It was originally from
Butcher's Ecclesiastical Calendar, published in 1876. This
algorithm has also been published in the 1922 book General
Astronomy by Spencer Jones; in The Journal of the British
Astronomical Association (Vol.88, page 91, December 1977); and in
Astronomical Algorithms (1991) by Jean Meeus.

This algorithm holds for any year in the Gregorian Calendar, which
(of course) means years including and after 1583.

      a=year%19
      b=year/100
      c=year%100
      d=b/4
      e=b%4
      f=(b+8)/25
      g=(b-f+1)/3
      h=(19*a+b-d-g+15)%30
      i=c/4
      k=c%4
      l=(32+2*e+2*i-h-k)%7
      m=(a+11*h+22*l)/451
      Easter Month =(h+l-7*m+114)/31  [3=March, 4=April]
      p=(h+l-7*m+114)%31
      Easter Date=p+1     (date in Easter Month)

Note: Integer truncation is already factored into the
calculations. Using higher percision variables will cause
inaccurate calculations. 
*/

       int nA      = 0;
       int nB      = 0;
       int nC      = 0;  
       int nD      = 0;
       int nE      = 0;
       int nF      = 0;
       int nG      = 0;
       int nH      = 0;
       int nI      = 0;
       int nK      = 0;
       int nL      = 0;
       int nM      = 0;
       int nP      = 0;
       int nEasterMonth  = 0;
       int nEasterDay    = 0;

// Calculate Easter
       if (nYear < 1900) 
    { 
    // if year is in java format put it into standard
    // format for the calculation
       nYear += 1900; 
    }
       nA = nYear % 19;
       nB = nYear / 100;
       nC = nYear % 100;
       nD = nB / 4;
       nE = nB % 4;
       nF = (nB + 8) / 25;
       nG = (nB - nF + 1) / 3;
       nH = (19 * nA + nB - nD - nG + 15) % 30;
       nI = nC / 4;
       nK = nC % 4;
       nL = (32 + 2 * nE + 2 * nI - nH - nK) % 7;
       nM=  (nA + 11 * nH + 22 * nL) / 451;

//  [3=March, 4=April]
       nEasterMonth = (nH + nL - 7 * nM + 114) / 31;
       --nEasterMonth;
       nP = (nH + nL - 7 * nM + 114) % 31;

// Date in Easter Month.
       nEasterDay = nP + 1;

// Uncorrect for our earlier correction.
       nYear -= 1900;

// Populate the date object...
       java.util.Calendar cal = java.util.Calendar.getInstance();
       cal.set(nYear, nEasterMonth, nEasterDay);
       return cal;


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

	    public static EasterSunday(int d) {
	    	int d = 0;
	    	return new Date(nYear, nMonth, nDay);
	    }
	    
	    
	    }

