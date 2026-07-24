import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("=== Program discount price ===");
        System.out.print("Input price :");
        double p = kb.nextDouble();
        System.out.println("=== Calculate total price ===");
        System.out.print("Total Price :");
        if (p <= 500 && p >= 1){
            System.out.println(p);
        } else if (p > 500 && p<=1000) {
            p = p-(p*0.03);
            System.out.println(p);
        }else if (p > 1000 && p<=2000) {
            p = p-(p*0.04);
            System.out.println(p);
        }else if (p > 2000 && p<=5000) {
            p = p-(p*0.07)+p;
            System.out.println(p);
        }else {
            p = p-(p*0.1);
            System.out.println(p);
        }
    }
}
