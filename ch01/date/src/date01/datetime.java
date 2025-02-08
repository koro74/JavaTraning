package date01;

import java.util.Date;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
				
		System.out.println("dt1 >>>>>>>>>>>> " + dt);
		System.out.println("dt2 >>>>>>>>>>>> " + dt.getDate()); // The method getDate() from the type Date is deprecated 사용안함
		System.out.println("dt3 >>>>>>>>>>>> " + dt.getDay()); // The method getDate() from the type Date is deprecated 사용안함
		System.out.println("dt4 >>>>>>>>>>>> " + dt.getHours()); // The method getDate() from the type Date is deprecated 사용안함
		System.out.println("dt5 >>>>>>>>>>>> " + dt.getMinutes()); // The method getDate() from the type Date is deprecated 사용안함
		System.out.println("dt6 >>>>>>>>>>>> " + dt.getMonth()); // The method getDate() from the type Date is deprecated 사용안함
		System.out.println("dt7 >>>>>>>>>>>> " + dt.getSeconds()); // The method getDate() from the type Date is deprecated 사용안함
		System.out.println("dt8 >>>>>>>>>>>> " + dt.getTime());
		System.out.println("dt9 >>>>>>>>>>>> " + dt.getTimezoneOffset()); // The method getDate() from the type Date is deprecated 사용안함 
		System.out.println("dt10 >>>>>>>>>>>> " + dt.getYear()); // The method getDate() from the type Date is deprecated 사용안함

	}

}
