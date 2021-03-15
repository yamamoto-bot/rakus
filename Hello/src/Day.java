import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Day {
	public static void main(String[] args) {
		LocalDateTime D1 = LocalDateTime.now();
		DateTimeFormatter dtformat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS E");
		String now1 = dtformat1.format(D1);
		System.out.println("現在の時刻は"+now1+"です。");
		D1 = D1.plusYears (3);
		DayOfWeek dayWeek = D1.getDayOfWeek();
		String str_dayWeek = dayWeek.getDisplayName(TextStyle.FULL, Locale.JAPAN);
		System.out.println("3年後の今日は"+str_dayWeek+"です。");
	}
}