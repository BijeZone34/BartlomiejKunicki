import java.io.IOException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) throws IOException{

        Scanner klawiatura = new Scanner(System.in);

        int liczba;
        System.out.println("Podaj liczbę z przedziału 10-24: ");
        liczba = klawiatura.nextInt();
        klawiatura.nextLine();

        while (!(liczba>=10 && liczba<=24)) {
            System.out.println("Liczba nie z zakresu, wpisz poprawną:");
            liczba = klawiatura.nextInt();
        }
        System.out.println("Git00wa B)");
}}
