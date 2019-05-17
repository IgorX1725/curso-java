package testeDateHour;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHour {

	public static void main(String[] args) {
		Date dateHour = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(dateHour));
		

	}

}
