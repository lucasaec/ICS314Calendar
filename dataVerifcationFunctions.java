/**
 * Methods that check if input given by user is valid
 * @author Lucas
 *
 */
public class dataVerifcationFunctions {
  
  /**
   * Checks if the year entered is actually an integer and if it is between a
   * reasonable time period
   * @param year the entered year as a String
   * @return true if valid, false otherwise
   */
   public boolean verifyYear(String year) {
	   try{		  
		   int year2 = Integer.parseInt(year);
	      if( 2000 <= year2 && year2 <= 2100) {
	         return true;
	      }
	   }
	   catch(Exception e) {
		   return false;
	   }
	   return false;
   }
   /**
    * Checks for valid months and days for those months
    * @param year the entered year as a String
    * @param response the month and day
    * @return true if valid, false otherwise
    */
   public boolean verifyDayAndMonth(int year,String response) {
	   try {
		   
		   int month2 = Integer.parseInt(response.substring(0,2) );
		   int day2 = Integer.parseInt(response.substring(2) );
			   
			   switch(month2) {
			    case 1:
			    	if(day2 <= 31 && day2 >= 1) {
			    		return true;
			    	}
			        break;
			    case 2:
			    	if(day2 == 29 && year % 4 != 0) {
						   return false;
					 }
			    	if(day2 <= 29 && day2 >= 1) {
			    		return true;
			    	}
			        break;
			    case 3:
			    	if(day2 <= 31 && day2 >= 1) {
			    		return true;
			    	} 
			        break;
			    case 4:
			    	if(day2 <= 30 && day2 >= 1) {
			    		return true;
			    	}  
			        break;
			    case 5:
			    	if(day2 <= 31 && day2 >= 1) {
			    		return true;
			    	}
			        break;
			    case 6:
			    	if(day2 <= 30 && day2 >= 1) {
			    		return true;
			    	}
			        break;
			    case 7:
			    	if(day2 <= 31 && day2 >= 1) {
			    		return true;
			    	} 
			        break;
			    case 8:
			    	if(day2 <= 31 && day2 >= 1) {
			    		return true;
			    	}   
			        break;
			    case 9:
			    	if(day2 <= 30 && day2 >= 1) {
			    		return true;
			    	} 
			        break;
			    case 10:
			    	if(day2 <= 31 && day2 >= 1) {
			    		return true;
			    	}  
			        break;
			    case 11:
			    	if(day2 <= 30 && day2 >= 1) {
			    		return true;
			    	} 
			        break;
			    case 12:
			    	if(day2 <= 31 && day2 >= 1) {
			    		return true;
			    	} 
			        break;
			    default:
			        return false;
			} 
				  
	   }
	   //TODO nbn
	   catch(Exception e1) {
		   return false;
	   }
	return false;
   }
   /**
    * Verifies if the time entered was an integer, and if it is a valid time.
    * It splits hours and minutes. The String entered should contain 4 characters.
    * @param time
    * @return
    */
   public boolean verifyTime(String time){ 
	   try{
		   int hours = Integer.parseInt(time.substring(0,2));
		   int minutes = Integer.parseInt(time.substring(2));
		   if(hours >= 0 && hours < 25) {
		       if(minutes <= 60 && minutes >= 0) {
		    	   return true;		    	   
		       }
		   }
	   }
	   catch (Exception e) {
	       return false;
	   }
	   return false;
   }
   
   /**
    * Make sure to use other methods to verify the parameters first.
    * This checks if the end time is after the start time.
    * @param year1
    * @param year2
    * @param monthAndDay1
    * @param monthAndDay2
    * @param time1
    * @param time2
    * @return
    */
   public boolean verifyFuture(String year1, String year2, String monthAndDay1, String monthAndDay2, String time1,
		   String time2) {
	   int year2int = Integer.parseInt(year2);
	   int year1int = Integer.parseInt(year1);
	   
	   int monthAndDay2int = Integer.parseInt(monthAndDay2);
	   int monthAndDay1int = Integer.parseInt(monthAndDay1);
	   
	   int time2int = Integer.parseInt(time2);
	   int time1int = Integer.parseInt(time1);
	   
	   if(year2int < year1int) {
		   return false;
	   }
	   if(year2int > year1int) {
		   return true;
	   }
       //when the years are equal
	   if(monthAndDay2int < monthAndDay1int) {
		   return false;
	   }
	   if(monthAndDay2int > monthAndDay1int) {
		   return true;
	   }
	   //when month and day are equal
	   if(time2int < time1int) { //currently accepts cases where start times and end times are equal
		   return false;
	   }
	   if(time2int >= time1int) { 
		   return true;
	   }
       return false;
   }
   
}

