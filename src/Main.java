import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> cisla = new ArrayList<>();
        SeznamNabytku seznamNabytku;
        for (int i = 0; i<10; i++) {
            Random random = new Random();
            int cislo = random.nextInt();
            cisla.add(cislo);
        }
        System.out.println(cisla);
        for (int j : cisla) {
            if (j>6) {
                System.out.println("číslo: "+j);
            }
        }
    }
}
