package etudiants;


import java.util.Scanner;

class Etudiant {
    protected String nom;
    private String matricule;
   
    public Etudiant(String nom, String matricule) {
        nom = nom;
        matricule = matricule;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nouveauNom) {
        nom = nouveauNom;
    }

    
}

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Jean", "12345");
        System.out.println("Nom de l'étudiant : " + etudiant1.getNom());

        etudiant1.setNom("Paul");
        System.out.println("Nouveau nom de l'étudiant : " + etudiant1.getNom());

       
    }
}