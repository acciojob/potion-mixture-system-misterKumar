package com.driver;

import java.util.Scanner;

public class PotionMixerSystem {

    public static class Potion {
        private final String potionName;
        private final String mainIngredient;
        private final String additiveIngredient;
        private double power;

        public Potion(String potionName, String mainIngredient, String additiveIngredient) {
            this.potionName = potionName;
            this.mainIngredient = mainIngredient;
            this.additiveIngredient = additiveIngredient;
            this.calculatePower();
        }

        public void calculatePower() {
        	//your code goes here
        }

        public String getPotionName() {
        	//your code goes here
            return potionName;
        }

        public String getMainIngredient() {
        	//your code goes here
            return mainIngredient;
        }

        public String getAdditiveIngredient() {
        	//your code goes here
            return additiveIngredient;
        }

        public double getPower() {
        	//your code goes here
            return power;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter potion name: ");
        String potionName = scanner.nextLine();

        System.out.print("Enter main ingredient (Rose, Lavender, Mint): ");
        String mainIngredient = scanner.nextLine();

        System.out.print("Enter additive ingredient (Honey, Ginger, Lemon): ");
        String additiveIngredient = scanner.nextLine();

        Potion potion = new Potion(potionName, mainIngredient, additiveIngredient);

        System.out.println("Potion Details:");
        System.out.println("Name: " + potion.getPotionName());
        System.out.println("Main Ingredient: " + potion.getMainIngredient());
        System.out.println("Additive Ingredient: " + potion.getAdditiveIngredient());
        System.out.println("Power: " + potion.getPower());
    }
}
