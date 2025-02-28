
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int recurs(int a, int b) {
        if (b == 0)
            return a;
        if (b > 0) {
            return recurs(a + 1, b - 1);
        } else return recurs(a - 1, b + 1);
    }

    public static void main(String[] args) {


        System.out.println(recurs(25, 13));


    }
}