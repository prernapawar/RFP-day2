package javapractice;

public class Sum {
   public static void main(String[] args) {
	int N = 5;
	System.out.println("First" + N + "Numbers = ");
	for (int i = 1; i <= N; i++) {
		System.out.println(i + "");
	}
	System.out.println();
	System.out.println("sum of first" + N + " Natural Numbers = " + (N*(N+1))/2);
}
}
