import java.util.ArrayList;
public class List {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("青");
		colors.add("赤");
		colors.add("緑");
		colors.add("白");
		colors.add("黒");

		for(String i : colors) {
			System.out.println(i);
		}
	}
}