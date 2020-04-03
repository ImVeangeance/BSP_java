import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class main {
    public static void arrlist(FileReader fr,Collection <developer_class> dev) {
        Scanner scn = new Scanner(fr);
        scn.nextLine();
        for(int i = 0; i < 1_00/*0_000*/; i++) {
            developer_class temp = new developer_class();
            temp.fromCSV(scn.nextLine());
            dev.add(temp);
        }
        System.out.println(dev);
    }
    public static void out_dev() {
        try {
            FileReader fr = new FileReader("/home/death/Docs/BSP_java/test_project_java/developers_table.csv");
            Scanner scn = new Scanner(fr);
            scn.nextLine();
            for(int i = 0; i < 1_000_000; i++) {
                String str = scn.nextLine();
                developer_class dev = new developer_class();
                dev.fromCSV(str);
                System.out.println(dev);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }

    public static void out_man() {
        try {
            FileReader fr = new FileReader("/home/death/Docs/BSP_java/test_project_java/managers_table.csv");
            Scanner scn = new Scanner(fr);
            scn.nextLine();
            for(int i = 0; i < 1_000_000; i++) {
                String str = scn.nextLine();
                manager_class dev = new manager_class();
                dev.fromCSV(str);
                System.out.println(dev);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found[1]");
        }
    }

    public static void template() {
        try {
            FileReader fr = new FileReader("/home/death/Docs/BSP_java/test_project_java/developers_table.csv");
            Collection<developer_class> dev = new ArrayList<>();
            arrlist(fr, dev);
            System.out.println(dev.size());//dev.size();
        } catch (FileNotFoundException e) {
            System.err.println("No file founded!");
        }
    }
    public static void main(String[] args) {
        template();
    }
}