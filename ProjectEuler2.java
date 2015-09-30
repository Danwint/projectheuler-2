public class ProjectEuler2 {
	public static void main(String[] args) {
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo3 = 3;
		int fibosum = 0;
		for (int i = 0; fibo3 < 4000000; i++) {
			
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			
			if(fibo3 % 2 == 0){
				
				fibosum = fibosum + fibo3;
				System.out.println(fibosum);
			}
		}
	}
}