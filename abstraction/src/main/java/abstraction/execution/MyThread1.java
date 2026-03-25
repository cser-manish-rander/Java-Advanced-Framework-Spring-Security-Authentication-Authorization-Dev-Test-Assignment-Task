//package abstraction.execution;
//
//public class MyThread1 extends Thread {
//	public static Object thread;
//
//	@Override
//	public void run() {
//		
//	}
//
//}

package abstraction.execution;

public class MyThread1 {

    public static final Runnable RUNNABLE = () -> {
        System.out.println("Thread1 Created");
    };

    public static final Thread thread = new Thread(RUNNABLE);
}