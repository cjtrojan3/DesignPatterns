public class DoorContext {

	private State state;

	public DoorContext(State state) {
		this.state = state;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void openDoor() {
		this.state.openDoor(this);
	}

	public void closeDoor() {
		this.state.closeDoor(this);
	}

	public void lockDoor() {
		this.state.lock(this);
	}

	public void unlockDoor() {
		this.state.unlock(this);
	}
}
