import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson do while

       /* int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
*/
       /* int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i<10);*/

       /* int i = 20;
        do {
            System.out.println(i);
            i++;
        }while(i<10);*/

        int n;

        int summa = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter n: ");
            n = input.nextInt();
            summa = summa + n;
        }while (n !=0);

        System.out.println("Summa: " + summa);

    }
}