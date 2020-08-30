import java.util.Random;
import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class GuessNumberJava {

    public static void main() {
        int[] arrayRandom = new int[]{0,1,2,3,4,5,6,7,8,9};
        int attempts = 0;
        int scorePemain = 0;
        int scoreComp = 0;
        int score = +1;
        Scanner input = new Scanner(System.in);

        for (int i=1; i<=3; i++) {
            int computer = arrayRandom[new Random().nextInt(arrayRandom.length)];
            int random = arrayRandom [new Random().nextInt(arrayRandom.length)];

            System.out.println();
            System.out.println("Permainan ke-" + i);
            System.out.println("Pilih angkamu dari 0-9: ");
            attempts = input.nextInt();
            System.out.println("Pilihan komputer: " + computer);
            System.out.println();
            System.out.println("Angka Random: " + random);
            System.out.println();

            if ((Math.abs(random - attempts) < Math.abs(random - computer)) || (attempts == random)) {
                scorePemain += score;
                System.out.print("kamu menang");
            } else if ((Math.abs(random - computer) < Math.abs(random - attempts)) || (computer == random)) {
                scoreComp += score;
                System.out.print("komputer menang");
            }
            System.out.println();
        }

        System.out.println();
        if (scorePemain == scoreComp) {
            System.out.print("Hasil akhir : DRAW");
        }
        else if(scorePemain > scoreComp) {
            System.out.print("Hasil akhir: Kamu Menang!");
        }
        else {
            System.out.print("Hasil akhir: Komputer Menang!");
        }
    }
}
