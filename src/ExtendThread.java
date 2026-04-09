// Step 1: Extend the Thread class
class MyThread extends Thread {
    // Step 2: Override the run() method
    // This is the code that will execute in the new thread
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        // Step 3: Create an object of the MyThread class
        MyThread t1 = new MyThread();

        // Step 4: Call start() to begin the thread execution
        // start() tells the JVM to allocate a new thread and then call run()
        t1.start();
    }
}
