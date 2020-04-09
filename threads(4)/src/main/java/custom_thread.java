import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.Scanner;

public class custom_thread implements Runnable {
    private Thread $thread;
    private String thread_name;

    public custom_thread(String $name) {
        thread_name = $name;
        System.out.println("Creating " +  thread_name );
    }

    public void run( ) {
        System.out.println("Running " +  thread_name );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + thread_name + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  thread_name + " interrupted.");
        }
        System.out.println("Thread " +  thread_name + " exiting.");
    }

    public void ads(Collection<developer_class> dev) {
        try {
            FileReader fr = new FileReader("/home/death/Docs/BSP_java/test_project_java/developers_table.csv");
            Scanner scn = new Scanner(fr);
            scn.nextLine();
            for (int i = 0; i < 1_000_000; i++) {
                developer_class temp = new developer_class();
                temp.fromCSV(scn.nextLine());
                dev.add(temp);
            }
            System.out.println(dev.size());//dev.size();
        } catch (FileNotFoundException e) {
            System.err.println("No file founded!");
        }
    }

    public void start (Collection <developer_class> dev) {
        System.out.println("Starting " +  thread_name );
        if ($thread == null) {
            $thread = new Thread (this, thread_name);
            $thread.start ();
            ads(dev);
        }
    }
}
