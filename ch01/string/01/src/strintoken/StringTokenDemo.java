package strintoken;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer sT = new StringTokenizer("Hello, World! of koro's");

		
		  while(sT.hasMoreTokens()) { 
			  System.out.println("sT.hasMoreTokens(1) : " + sT.hasMoreTokens());
			  System.out.println("Token : " + sT.nextToken());
			  System.out.println("sT.hasMoreTokens(2) : " + sT.hasMoreTokens());
		  }
	}

}
