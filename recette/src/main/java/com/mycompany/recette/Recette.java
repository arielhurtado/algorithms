package com.mycompany.recette;
/**
 *
 * @author Julio Ariel Hurtado Alegría
 */
public class Recette {
    
    private String nom;
    private double cout;
    private int calories;

    public Recette(String nom, double cout, int calories) {
        this.nom = nom;
        this.cout = cout;
        this.calories = calories;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cout
     */
    public double getCout() {
        return cout;
    }

    /**
     * @param cout the cout to set
     */
    public void setCout(double cout) {
        this.cout = cout;
    }

    /**
     * @return the calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }
}
