import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");//



        /*EXO 7
        Scanner sc = new Scanner(System.in);

        int i = 0;
        float note = 0;
        float somme = 0;

        while (note >= 0) {
            somme = somme + note;
            System.out.println("Saisir  note " + (i + 1) + ": ");
            note = sc.nextFloat();
            i = i + 1;
        }

        float m = somme / (i - 1);

        System.out.println("Vocic la moyenne : " + m);*/

        //EXO 8//
        
        Scanner sc = new Scanner(System.in);
        int aleatoire = (int) (Math.random() * 100);
        int tentative = 1;
        int i = 10;

        while (i > 0) {
            System.out.println("Il vous reste " + i + " tentative(s)");
            System.out.println("Choisissiez un nombre :");
            System.out.println(aleatoire);
            int choix = sc.nextInt();

            if (choix > aleatoire) {
                System.out.println("Trop grand !");
                i = i - 1;
                tentative = tentative + 1;
            }

            else if (choix < aleatoire) {
                System.out.println("Trop petit !");
                i = i - 1;
                tentative = tentative + 1;
            }

            else if (choix == aleatoire) {

                if (tentative == 1) {
                    System.out.println("Vous êtes un tricheur ou alors vous avez des pouvoirs de clairvoyance! Je vous conseille de jouer au loto.");
                }

                else if (tentative >= 2 && tentative <= 5) {
                    System.out.println("Bravo ! Vous avez trouvé la bonne réponse !");
                }

                else if (tentative >= 6 && tentative <= 9) {
                    System.out.println("Pas mal, vous avez trouvé le nombre.");
                }

                else {
                    System.out.println("C'était tout juste!");
                }

                i = 0;
            }
        
        }

        if (tentative > 10) {
            System.out.println("Vous n'avez pas trouve le nombre! Vous êtes un gros nul!");
            System.out.println("La réponse était : " + aleatoire);
        }

    }

}
