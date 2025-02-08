package strintoken;

//import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StringTokenizer sT = new StringTokenizer("Hello, World! of koro's");
		 * 
		 * 
		 * while(sT.hasMoreTokens()) { System.out.println("sT.hasMoreTokens(1) : " +
		 * sT.hasMoreTokens()); System.out.println("Token > : " + sT.nextToken());
		 * System.out.println("sT.hasMoreTokens(2) : " + sT.hasMoreTokens()); }
		 */
		
		String blogUri = "https://dbaschool.tistory.com/entry/352-v-model-%EB%94%94%EB%A0%89%ED%8B%B0%EB%B8%8C%EB%A1%9C-%ED%8F%BC-%EC%9A%94%EC%86%8C-%EB%8B%A4%EB%A3%A8%EA%B8%B0-3-1-checkbox";
		boolean url = isUrlValid(blogUri);
		
		System.out.println("URL >>>>>>>>>>>>>>> " + url);
	}
	
	public static boolean isUrlValid(String url) {
		boolean isUrlvalid = false;
		
		String regex = "^(https?):\\/\\/([^:\\/\\s]+)(:([^\\/]*))?((\\/[^\\s/\\/]+)*)?\\/?([^#\\s\\?]*)(\\?([^#\\s]*))?(#(\\w*))?$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(url);
		
		isUrlvalid = m.matches();
		System.out.println("url >>>>>>>>>>>> " + url);
		
		if (m.matches()) {
			for (int i = 0; i < m.groupCount(); i++) {
				System.out.println("MATCHES >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> group(" + i + ") >>>>>>>>>> " + m.group(i));
				if (m.group(i).contains("tistory")) {
					System.out.println("MATCHES >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> OK);
				}
			}				
		}
		
		return isUrlvalid;
	}

}
