package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetPays {

    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>(
                Arrays.asList(
                        new Pays("USA", 330_252_859, 65_298),
                        new Pays("France", 67_422_241, 40_494),
                        new Pays("Allemagne", 83_042_235, 48_196),
                        new Pays("UK", 66_465_641,42_491),
                        new Pays("Italie", 60_494_785, 34_318),
                        new Pays("Japon", 126_330_302, 39_287),
                        new Pays("Chine", 1_401_501_343, 9771),
                        new Pays("Russie", 146_238_185, 11_585),
                        new Pays("Inde",1_372_943_539, 2016)
                )
        );
        System.out.println("Taille du HashSet : " + pays.size());
        System.out.println("Affichage du HashSet de pays avant traitement : " + pays);
        Pays firstPays = pays.iterator().next();
        Pays paysPibMax = firstPays;
        Pays paysPibTotalMax = firstPays;
        Pays paysPibTotalMin = firstPays;
        for (Pays aPays : pays) {
            aPays.setNom(aPays.nom.toLowerCase());
            paysPibMax = aPays.getPibParHabitants() > paysPibMax.getPibParHabitants() ? aPays : paysPibMax;
            paysPibTotalMax = aPays.getPibTotal() > paysPibTotalMax.getPibTotal() ? aPays : paysPibTotalMax;
            paysPibTotalMin = aPays.getPibTotal() < paysPibTotalMin.getPibTotal() ? aPays : paysPibTotalMin;
        }
        paysPibMax.setNom(paysPibMax.nom.toUpperCase());
        pays.remove(paysPibTotalMin);
        System.out.println("\nPays avec le pib/habitants le plus haut : " + paysPibMax);
        System.out.println("Pays avec le pib total le plus haut : " + paysPibTotalMax);
        System.out.println("Pays avec le pib total le plus petit : " + paysPibTotalMin);
        System.out.println("Affichage du HashSet de pays apres traitement : " + pays);
        System.out.println("Taille du HashSet : " + pays.size());
        System.out.println("La liste contient le pays ayant le pib total le plus bas ? " + pays.contains(paysPibTotalMin));
    }

}
