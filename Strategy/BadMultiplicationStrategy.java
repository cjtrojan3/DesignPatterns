public class BadMultiplicationStrategy implements MultiplicationStrategy {
	public int multiply(int a, int b) {
		int sum = 0;
		for(int i = 0; i <= a; i++) {
			sum += b;
		}
		return sum;
	}
}
