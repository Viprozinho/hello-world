import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is my first file in my git repository!");
        boolean git = true;

        System.out.print("Isso é um repositório git sim ou não? ");
        String gitFinal = scanner.nextLine();

        if (gitFinal.equals("sim")) {
            System.out.println("Resposta Correta!");
        } else {
            System.out.println("Resposta Errada!");
        }

        System.out.println("New git hub changes! ");
    }
}
