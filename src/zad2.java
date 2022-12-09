import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        String litera;
        String a="t";
        String b="n";

        System.out.println("Podaj literę T,t,N lub n");
        litera = klawiatura.next();
        klawiatura.nextLine();

        while (!(litera.equalsIgnoreCase(a)||(litera.equalsIgnoreCase(b)))){
            System.out.println("Litera nie z zakresu, wpisz poprawną:");
            litera = klawiatura.next();
        }

        System.out.println("Git litera: "+litera);
    }
}
