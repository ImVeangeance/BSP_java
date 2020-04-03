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
        Long start = System.nanoTime();
        Collection<developer_class> dev = new LinkedList<>();
        ads(dev);
        Long end = System.nanoTime();
        System.out.println("Arr List - ADD time from .csv file for -> " + (end - start) / 1_000_000 + "ms");

        start = System.nanoTime();
        r_list(dev);
        end = System.nanoTime();
        System.out.println("Arr List - FREE time from .csv file for -> " + (end - start) / 1_000_000 + "ms");
        //

        start = System.nanoTime();
        Collection<developer_class> dev1 = new LinkedList<>();
        ads(dev1);
        end = System.nanoTime();
        System.out.println("Linked List - ADD time from .csv file for -> " + (end - start) / 1_000_000 + "ms");

        start = System.nanoTime();
        r_list(dev1);
        end = System.nanoTime();
        System.out.println("Linked List - FREE time from .csv file for -> " + (end - start) / 1_000_000 + "ms");
        //

        start = System.nanoTime();
        TreeSet <developer_class> dev2 = new TreeSet<>();
        ads(dev2);
        end = System.nanoTime();
        System.out.println("Tree set - ADD time from .csv file for -> " + (end - start) / 1_000_000 + "ms");

        start = System.nanoTime();
        r_list(dev2);
        end = System.nanoTime();
        System.out.println("Tree set - FREE time from .csv file for -> " + (end - start) / 1_000_000 + "ms");
    }
}