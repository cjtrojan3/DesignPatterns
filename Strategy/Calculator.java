public class Calculator {
	private MultiplicationStrategy multiplicationStrategy;

	public Calculator() {
		this.multiplicationStrategy = new GoodMultiplicationStrategy();
	}

	public int multiply(int a, int b) {
		return this.multiplicationStrategy.multiply(a, b);
	}

	public void changeStrategy(MultiplicationStrategy multiplicationStrategy) {
		this.multiplicationStrategy = multiplicationStrategy;
	}
}
