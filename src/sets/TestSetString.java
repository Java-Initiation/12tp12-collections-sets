package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {

    public static void main(String[] args) {
        HashSet<String> pays = new HashSet<>(
                Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde")
        );
        System.out.println("Taille du HashSet : " + pays.size());
        System.out.println("Affichage du HashSet de pays avant traitement : " + pays);
        String maxCharPays = "";
        for (String aPays : pays) {
            maxCharPays = aPays.length() > maxCharPays.length() ? aPays : maxCharPays;
        }
        pays.remove(maxCharPays);
        System.out.println("\nPays avec le plus de caracteres : " + maxCharPays);
        System.out.println("Affichage du HashSet de pays apres traitement : " + pays);
        System.out.println("Taille du HashSet : " + pays.size());
    }

}
