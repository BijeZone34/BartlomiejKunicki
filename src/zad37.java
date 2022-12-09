
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class zad27 {
    public static void main(String[] args) throws IOException{

        Scanner klawiatura = new Scanner(System.in);

        double predkosc;

        System.out.println("Podaj predkość: ");
        predkosc = klawiatura.nextInt();
        klawiatura.nextLine();

        double godziny;

        System.out.println("Podaj czas podróży (h): ");
        godziny = klawiatura.nextInt();
        klawiatura.nextLine();

        PrintWriter pw = new PrintWriter("predkosc.txt");
        pw.println("----------------------");

        for(int i=1; i<=godziny ;i++){

            pw.print(i+": ");
            pw.print(i*predkosc);
            pw.println();
        }
    }
}
