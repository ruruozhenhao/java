package Lock2;

public class DeadLockDemo {

	public static void main(String[] args) {
		DeadLock dead = new DeadLock();
		Thread t1 = new Thread(dead);
		Thread t2 = new Thread(dead);
		
		t1.start();
		t2.start();

	}

}
