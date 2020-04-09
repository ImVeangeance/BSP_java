import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class main {
    public static void ads(Collection <developer_class> dev) {
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

    static void r_list(Collection <developer_class> collection) {
        var tmp = new ArrayList <>(collection);
        for (var dev : tmp) {
            collection.remove(dev);
        }
    }

    public static void main(String[] args) {
        Integer thread_counts = 2;
        Long start = System.nanoTime();
        Collection <developer_class> dev = new LinkedList<>();
        for(int i = 0; i < thread_counts; ++i)
        {
            custom_thread thr = new custom_thread(Integer.toString(i));
            thr.start(dev);
        }
        Long end = System.nanoTime();
        System.out.println("Arr List - ADD time from .csv file for" + thread_counts.toString() + "threads -> " + (end - start) / 1_000_000 + "ms");
        //
        System.out.println(dev.size());
        System.out.println(dev);
        start = System.nanoTime();
        Collection <developer_class> dev1 = new LinkedList<>();
        ads(dev1);
        end = System.nanoTime();
        System.out.println("Arr List - ADD time from .csv file for -> " + (end - start) / 1_000_000 + "ms");
        //
    }
}