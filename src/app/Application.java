package app;

import java.util.ArrayList;
import models.Personne;

public class Application {

    public static void main(String[] args) {

        ArrayList<Personne> personnes = new ArrayList<>();

        Personne personne1 = new Personne("Kaeser", "Patrick", "Rue de Laussane", "Fribourg", 1700);
        Personne personne2 = new Personne("Terrier", "Rafael", "Rte de Perolle", "Fribourg", 1700);
        Personne personne3 = new Personne("Thevoz", "Boris", "là-bas", "Fribourg", 1700);
        personnes.add(personne1);
        personnes.add(personne2);
        personnes.add(personne3);

        for (Personne personne : personnes) {
            System.out.println(personne.getNom());
        }

    }

}
