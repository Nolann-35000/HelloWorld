import java.util.Scanner;
public class tp03 {

    /*public static int carre(int x) {
        return x * x;
    }

    public static int cube(int x) {
        return x * x * x;
    }*/

    public static boolean estPair(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) throws Exception {

        /*Exo 1

        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez un nombre :");
        a = sc.nextInt();

        System.out.println("Voulez-vous mettre au carré (appuyer sur la touche 1) ou mettre au cube (appuyer sur la touche 2) ce nombre ?");
        b = sc.nextInt();

        if (b == 1) {
            int nbCarre = carre(a);

            System.out.println("Voici votre nombre élevé au carré : " + nbCarre);
        }

        else if (b == 2) {
            int nbCube = cube(a);

            System.out.println("Voici votre nombre élevé au cube : " + nbCube);
        }

        else {
            System.out.println("Mauvaise valeur");
        }*/

        // EXO 4//

        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez un nombre :");
        int nb = sc.nextInt();

        boolean nbPair = estPair(nb);

        if (nbPair) {
            System.out.println("Le nombre est pair.");
        } 

        else {
            System.out.println("Le nombre est impair.");
        }
    }
}
