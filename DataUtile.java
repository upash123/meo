
package meotow;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataUtile {
	
	public static String getTimeString() {
		Calendar cal = new GregorianCalendar();
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);

		return h + "點" + min + "分";
	}

	public static String getDateString() {
		Calendar cal = new GregorianCalendar();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);

		return y + "年" + m + "月" + d + "日";
	}
}
