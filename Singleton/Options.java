public class Options {
	private static Options instance;
	private int volume;

	private Options() {
		this.volume = 50;
	}
	public static Options getInstance() {
		if (instance != null) {
			return instance;
		}
		else {
			instance = new Options();
			return instance;
		}
	}
	public int getVolume() {
		return this.volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
