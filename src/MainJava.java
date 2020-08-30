import java.util.Scanner;

class MainJava {
    public static void main (String[] args) {
        String inputUsername;
        GuessNumberJava guessNumberJava = new GuessNumberJava();

        System.out.println("Username: ");
        Scanner input = new Scanner(System.in);
        inputUsername = input.next();
        System.out.println("Halo " +inputUsername);

    guessNumberJava.main();
    }
}
