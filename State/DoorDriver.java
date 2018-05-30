public class DoorDriver {
	public static void main(String[] args) {
		DoorContext context = new DoorContext(new DoorLockedState());
		context.openDoor();
		context.unlockDoor();
		context.openDoor();
		context.lockDoor();
		context.closeDoor();
		context.lockDoor();
	}
}
