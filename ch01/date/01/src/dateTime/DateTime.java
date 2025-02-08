package dateTime;

import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		
		
		System.out.println("dt1 >>>>>>>>>>>> " + dt);
		System.out.println("dt2 >>>>>>>>>>>> " + dt.getDate());
		System.out.println("dt3 >>>>>>>>>>>> " + dt.getDay());
		System.out.println("dt4 >>>>>>>>>>>> " + dt.getHours());
		System.out.println("dt5 >>>>>>>>>>>> " + dt.getMinutes());
		System.out.println("dt6 >>>>>>>>>>>> " + dt.getMonth());
		System.out.println("dt7 >>>>>>>>>>>> " + dt.getSeconds());
		System.out.println("dt8 >>>>>>>>>>>> " + dt.getTime());
		System.out.println("dt9 >>>>>>>>>>>> " + dt.getTimezoneOffset());
		System.out.println("dt10 >>>>>>>>>>>> " + dt.getYear());

	}

}
