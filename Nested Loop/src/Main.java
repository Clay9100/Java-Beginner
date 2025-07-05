//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson Nested loop

        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }*/

       /* for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j < 5) {
                System.out.print(" " + j);
                j++;
            }
            System.out.println();

        }*/

       /* for (int i = 0; i < 5; i++) {
            int k = 5;
            do {
                System.out.print(" " + k);
                k--;
            }while (k > 0);
            System.out.println();

        }*/

        // while

        /*int i = 0;
        while (i < 5) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + i);
            }
            System.out.println();

            i++;
        }*/

        // crate hour
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
                }
            }
        }





    }
}