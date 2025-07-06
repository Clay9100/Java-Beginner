import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // this is lesson Scanner class

        byte n;

        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        n = input.nextByte();
        System.out.println("Your input n = " + n);

        short s;
        s = input.nextShort();
        System.out.println("Your input s = " + s);


    }
}