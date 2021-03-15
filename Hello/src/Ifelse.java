public class Ifelse {
	public static void main(String[] args) {
		output(0);
		output(1);
	}
	public static void output(int a) {
		System.out.println(a);
	if(a==1) {
		System.out.println("偽");
	}else if(a==0){
		System.out.println("真");
	}
	}
}