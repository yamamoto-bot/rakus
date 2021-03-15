public class Array {
	public static void main(String[] args) {
		int[] scores = {10,20,30};
		try {
			System.out.println(scores[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外の要素を指定しています。範囲内の要素を指定してください");
		}

	}

}
