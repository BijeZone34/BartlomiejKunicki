import java.util.Scanner;

public class zad27 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double predkosc;

        System.out.println("Podaj predkość: ");
        predkosc = klawiatura.nextInt();
        klawiatura.nextLine();

        double godziny;

        System.out.println("Podaj czas podróży (h): ");
        godziny = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("----------------------");

        for(int i=1; i<=godziny ;i++){
            System.out.print(i + ": ");
            System.out.print(i*predkosc);
            System.out.println();
        }
    }
}
