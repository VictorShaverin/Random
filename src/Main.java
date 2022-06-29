import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
       game(a);
    }

    public static void game(int a) {
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();
        if (yourNumber < a)
        {
            System.out.println("bolshe");
        }
        if (yourNumber > a)
        {
            System.out.println("menshe");
        }
        if (yourNumber == a)
        {
            System.out.println("pobeda");
        }
        game(a);
    }

}

