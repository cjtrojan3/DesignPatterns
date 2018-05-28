public class SingletonDriver {
	public static void main(String[] args) {
		Options instance = Options.getInstance();
		System.out.println(instance.getVolume());
		instance.setVolume(60);

		Options instance2 = Options.getInstance();
		System.out.println(instance2.getVolume());
		instance2.setVolume(30);
		System.out.println(instance2.getVolume());
	}
}
