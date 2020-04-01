import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            var fr = new FileReader("/home/death/Docs/BSP_java/test_project_java/developers_table.csv");
            var scn = new Scanner(fr);
            scn.nextLine();
            for(int i = 0; i < 1_000; i++) {
                var str = scn.nextLine();
                var dev = new developer_class();
                dev.fromCSV(str);
                System.out.println(dev);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.out.println("\n");
        }
        try {
            var fr = new FileReader("/home/death/Docs/BSP_java/test_project_java/managers_table.csv");
            var scn = new Scanner(fr);
            scn.nextLine();
            for(int i = 0; i < 1_000; i++) {
                var str = scn.nextLine();
                var dev = new manager_class();
                dev.fromCSV(str);
                System.out.println(dev);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found[1]");
        }
    }
}
