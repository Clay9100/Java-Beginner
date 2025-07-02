//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // This is lesson if operator

        // if

       /* int age = 15;

        if (age < 18) {
            System.out.println("You are too young");
        }*/

        /*int a = 9, b = 7;

        if (a > b){
            System.out.println(true);
        }*/

        /*int password = 1234;

        if(password == 1234){
            System.out.println("Password Correct");
        }*/

        // if else

        /*int x = 8, y = 4;

        if(x > y){
            System.out.println(true);
        }else {
            System.out.println(false);
        }*/

        /*int aka = 23, uka = 14;

        if(aka > uka){
            System.out.println("Aka big");
        }else {
            System.out.println("Uka little");
        }*/

        /*int x = -8, y = 6, z = 5;
        if(x < y){
            x = y;
        }
        if(x < z){
            x = z;
        }
        System.out.println("Big number: " + x);*/

        int x = -1, y = -2, z = -3; // mid

        // big number
        int bigN = x;
        int litN = x;

        if(bigN < y){
            bigN = y;
        }
        if(bigN < z){
            bigN = z;
        }
        System.out.println("bigN = " + bigN);

        // little number
        if(litN > y){
            litN = y;
        }
        if(litN > z){
            litN = z;
        }
        System.out.println("litN = " + litN);

        int summa1 = (bigN + litN);
        int summa2 = x + y + z;

        int mid = summa2 -  summa1;
        System.out.println("mid = " + mid);



    }
}