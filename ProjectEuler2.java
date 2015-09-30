public class ProjectEuler2 {
	public static void main(String[] args) {
		int fibo1 = 1;
		int fibo2 = 2;
		int fibo3 = 3;
		for (int i = 0; fibo3 < 4000000; i++) {
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			System.out.println(fibo3);
		}
		
	}
}