import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // this is lesson break continue

        /*for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }*/

       /* int n = 0;

        while (n < 100){
            System.out.println("n: " + n);

            if (n == 27){
                break;
            }
            n++;

        }*/

        /*int n;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter n: ");
            n = input.nextInt();
            if (n > 10){
                break;
            }
            System.out.println(n);
        }while (true);*/

        // continue

       /* for (int i = 0; i < 10; i++) {

            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }*/

        int i = 1;

        while (i <= 100) {

            if(i % 3 == 0 || i % 5 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }


    }
}