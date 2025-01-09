package com.mycompany.recette;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author ahurtado
 */
public class RecetteApp {

  public static void main(String[] args) throws UnsupportedEncodingException {
        
        Scanner scanner = new Scanner(System.in); 
        PrintStream out = new PrintStream(System.out, true, "UTF-8"); // Permet de garantir l'affichage des caractères spéciaux (comme les accents) en UTF-8
        
        // **Données initiales** : tableau de recettes avec nom, coût et calories
        Recette[] recettes = {
        new Recette("Salade", 2.50, 150), // Recette 1 : Salade (2,50€ et 150 calories)
        new Recette("Pâtes", 4.00, 600),  // Recette 2 : Pâtes (4,00€ et 600 calories)
        new Recette("Sandwich", 3.00, 400) // Recette 3 : Sandwich (3,00€ et 400 calories)
        };

        // **Entrée utilisateur** : l'utilisateur doit entrer le poids qu'il souhaite accorder au coût (entre 0 et 100)
        out.print("Entrez le poids pour le coût (0 à 100) : ");
        double poidsCout = scanner.nextDouble() / 100.0; // Convertit le pourcentage en un nombre décimal (par exemple, 70 devient 0,7)
        double poidsCalories = 1 - poidsCout; // Complémente le poids du coût (par exemple, si coût = 0,7, alors calories = 0,3)

        Recette meilleureRecette = null; // Variable qui stockera la meilleure recette trouvée
        double meilleurScore = Double.MIN_VALUE; // Initialise le meilleur score à la plus petite valeur possible

            // **Boucle de sélection** : on parcourt chaque recette et on calcule son "score" en fonction du coût et des calories
            for (Recette recette : recettes) {
            // Calcul du score de la recette : on pondère le coût et les calories selon les préférences de l'utilisateur
            double score = (poidsCout * (1 / recette.getCout())) + (poidsCalories * (1 / recette.getCalories()));
        
            // Si le score de la recette actuelle est supérieur au score maximal enregistré, on met à jour la meilleure recette
            if (score > meilleurScore) {
                meilleurScore = score; // Met à jour le meilleur score
                meilleureRecette = recette; // Enregistre la recette comme la meilleure recette
            }
        }

        // **Affichage du résultat** : on affiche le nom de la meilleure recette trouvée
     out.println("La meilleure recette est : " + meilleureRecette.getNom());
    }                 
}
