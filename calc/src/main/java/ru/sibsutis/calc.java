import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        Double answer = 0.;
        String act = null;
        Scanner inp = new Scanner(System.in);
        Double first = inp.nextDouble();
        act = inp.next();
        Double second = inp.nextDouble();
        switch (act) {
            case "+":
                answer = first + second;
                break;
            case "-":
                answer = first - second;
                break;
            case "*":
                answer = first * second;
                break;
            case "/":
                if(second != 0) {
                    answer = first / second;
                }
                else {
                    System.out.println("Deviding by zero");
                }
                break;
            default:
                System.out.println("Bad action");
                break;
        }
        System.out.println(answer);
    }
} 
