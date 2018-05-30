public class DoorOpenState implements State {

	public void lock(DoorContext context) {
		System.out.println("Door cannot be locked. It is open");
	}

	public void unlock(DoorContext context) {
		System.out.println("Door cannot be unlocked. It is already open.");
	}

	public void openDoor(DoorContext context) {
		System.out.println("Door cannot be opened. It is already open.");
	}

	public void closeDoor(DoorContext context) {
		System.out.println("Door is now closed.");
		context.setState(new DoorUnlockedState());
	}
}
