import java.util.HashMap;
import java.util.Map;
public class Pair {
	public static void main(String[] args) {
		Map<String, Integer> food = new HashMap<String, Integer>();
		food.put("ごはん", 100);
		food.put("パン", 120);
		food.put("カレー", 400);
		int rice = food.get("ごはん");
		System.out.println("ごはんの値段は"+rice+"円です。");
 }
}