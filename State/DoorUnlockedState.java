public class DoorUnlockedState implements State {

	public void lock(DoorContext context) {
		System.out.println("Door is now locked");
		context.setState(new DoorLockedState());
	}

	public void unlock(DoorContext context) {
		System.out.println("Door is already unlocked");
	}

	public void openDoor(DoorContext context) {
		System.out.println("Door is now open");
		context.setState(new DoorOpenState());
	}

	public void closeDoor(DoorContext context) {
		System.out.println("Door is already closed");
	}
}
