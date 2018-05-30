public class DoorLockedState implements State {
	
	public void lock(DoorContext context) {
		System.out.println("Door is already locked");
	}

	public void unlock(DoorContext context) {
		System.out.println("Door unlocking");
		context.setState(new DoorUnlockedState());
	}

	public void openDoor(DoorContext context) {
		System.out.println("Door is locked. Cannot open");
	}

	public void closeDoor(DoorContext context) {
		System.out.println("Door cannot be closed. It is already closed and locked.");
	}
}
