import java.util.Scanner;

public class GuessANumber {

    //***************CONSOLE CONFIGS & VARS********************
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String WHITE_BK = "\u001B[47m";
    // Declaring some elements
    public static final String container = "*************************************************************\n";
    //********************************************************

    public static int lastTryBellow=0;                    //Cette variable sert à stocker la dernière valeur en dessous du nombre à deviner
    public static int lastTryAbove=50;                     //Cette variable sert à stocker la dernière valeur au dessus du nombre à deviner

    public static void main(String[] args) {    //gère le jeu
        boolean gameState;                      //déclaration d'une variable 'gameStat' de type booléen
        int nbToBeGuessed;                      //déclaration d'une variable 'nbToBeGuessed' de type integer
        int attemptsNb = 0;                     //déclaration d'une variable 'attemptsNb' de type integer qui va stocker le nombre d'essais du joueur 2

        do{                                             //boucle do-while
            nbToBeGuessed = askNb();                    //stocke la valeur entrée par l'utilisateur dans la console et la stocke dans nbToBeGuessed
        } while (0>nbToBeGuessed || nbToBeGuessed>50);  //tant que le nombre qui doit être deviné est plus petit que 0 et plus grand que 50.

        do {                                                        //boucle do-while
            int givenNumber = askUser(lastTryBellow,lastTryAbove);                            //variable de type integer qui récupère le nombre saisi par l'utilisateur dans la méthode askUser
            gameState = didIwin(givenNumber,nbToBeGuessed);         //Test du nombre saisi par l'utilisateur dans didIwin qui retourne true si le nb a été trouvé, false sinon
            attemptsNb = attemptsNb+1;
            System.out.println("Attempts number :" + attemptsNb);   //print dans la console "Plus grand"
        } while (!gameState);                                       //Tant que gameState est false
    }                                                               //Met fin au jeu quand gameState == true

    public static boolean didIwin(int givNumb, int theGuess){
        if (givNumb<theGuess){             //Si le nb est plus petit que 22, on affiche plus grand
            System.out.println("Upper");   //print dans la console "Plus grand"
            lastTryBellow=givNumb;
            return false;                  //sortie de la méthode didIwin qui retournera false
        } else if (givNumb>theGuess) {     //Si le nombre est plus grand que 22, on affiche plus petit
            System.out.println("lower");   //print dans la console "Plus grand"
            lastTryAbove=givNumb;
            return false;                  //sortie de la méthode didIwin qui retournera false
        } else {
            System.out.println("\n" + WHITE_BK + ANSI_GREEN + container + "Well Played, number guessed !" + "\n" + container + ANSI_RESET);      //Si le nombre est 22 on affiche Bravo !
            return true;                   //sortie de la méthode didIwin qui retournera true
        }
    }

    public static int askUser(int LTB, int lastTryAbove) {
        Scanner ScannerObj = new Scanner(System.in);    //Créé l'objet scanner
        System.out.println(ANSI_YELLOW + "\n" + container + "PLAYER 2 : Enter your guess \n "+LTB+"<?<" + lastTryAbove + "\n" + container + ANSI_RESET);  //print dans la console "Enter your guess number"
        String givenStrNumber = ScannerObj.nextLine();  //Lis l'input de l'utilisateur
        return Integer.parseInt(givenStrNumber);        //Sortie de la fonction askUser en retournant la conversion de l'input de l'utilisateur en integer
    }

    public static int askNb() {
        Scanner ScannerObj = new Scanner(System.in);            //créé un objet scanner
        System.out.println( ANSI_PURPLE + "\n" + container + "PLAYER 1 : Enter bellow the number to be guessed" + "\n" + container + ANSI_RESET);   //print dans la console "Enter the number to be guessed"
        String nbToBeGuessed = ScannerObj.nextLine();           //Lis l'input de l'utilisateur
        return Integer.parseInt(nbToBeGuessed);                 //Sortie de la fonction askNb en retournant la conversion de l'input de l'utilisateur en integer
    }
}