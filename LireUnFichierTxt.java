import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LireUnFichierTxt {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/home/elodie/LearningJava/LireUnFichierTxt/myTest.txt"));

        String textFromFile1 = scanner.nextLine();
        String textFromFile2 = scanner.nextLine();
        System.out.println(textFromFile1);
        System.out.println(textFromFile2);
        scanner.close();

    }
}
