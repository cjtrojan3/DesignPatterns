public class StrategyDriver {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("5 * 6 = " + calc.multiply(5, 6));
		calc.changeStrategy(new BadMultiplicationStrategy());
		System.out.println("5 * 6 = " + calc.multiply(5, 6));
	}
}
