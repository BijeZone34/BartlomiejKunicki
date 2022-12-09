
import java.io.PrintWriter;
import java.io.IOException;


public class zad12 {
    public static void main(String[] args) throws IOException {
        double a = 0;
        for (double i=1, k=30; i<=30; i++, k--) {
            a += (i / k);
        }
        System.out.println(a);
    }
}
