package time;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);

        // Initialisation du système Timelog
        Timelog system = new Timelog();

        // Création de trois projets
        Projet project1 = new Projet("projet1");
        Projet project2 = new Projet("projet2");
        Projet project3 = new Projet("projet3");

        Projet project = new Projet("projet");

        // Création de trois employés, chacun assigné à un projet différent
        Employé empl1 = new Employé("user", 1, project1);
        Employé empl2 = new Employé("user", 2, project2);
        Employé empl3 = new Employé("user", 3, project3);

        // Création d'un compte administrateur assigné à un projet quelconque
        Employé adm = new Employé("admin", 0, project);

        // savoir s'il veut débuter ou terminer une activité
        String initialQuestion = "Voulez-vous 1-debuter ou 2-terminer une activité ?";
        writeToFile(jsonOutput("Message", initialQuestion)); // Enregistre la question sous format JSON
        System.out.println(initialQuestion);
        int choixP = keyboard.nextInt(); //choix de l'utilisateur du projet
        writeToTextFile(String.valueOf(choixP)); // Enregistrement du choix dans un fichier texte

        // Connexion de l'utilisateur au système
        String connectMessage = system.seConnecter();
        writeToFile(jsonOutput("Message", connectMessage)); // Enregistre le message de connexion sous format JSON
        System.out.println(connectMessage);
        String credential = keyboard.next(); // Saisie des identifiants de l'utilisateur
        writeToTextFile(credential); // Enregistrement des identifiants dans un fichier texte

        // Vérifier les utilisateurs et afficher leur projet auquel ils sont assignés
        if (credential.equals(empl1.getEmployé())) {
            String projectMessage = "Veuillez choisir une discipline (1-5) de: " + project1.getProjet();
            writeToFile(jsonOutput("Message", projectMessage)); // Enregistre le message du projet sous format JSON
            System.out.println(projectMessage);
        } else if (credential.equals(empl2.getEmployé())) {
            String projectMessage = "Veuillez choisir une discipline (1-5) du projet: " + project2.getProjet();
            writeToFile(jsonOutput("Message", projectMessage)); // Enregistre le message du projet sous format JSON
            System.out.println(projectMessage);
        } else if (credential.equals(empl3.getEmployé())) {
            String projectMessage = "Veuillez choisir une discipline (1-5) du projet: " + project3.getProjet();
            writeToFile(jsonOutput("Message", projectMessage)); // Enregistre le message du projet sous format JSON
            System.out.println(projectMessage);
        } else {
            // Gestion des cas où les identifiants ne correspondent à aucun employé connu
            String errorMessage = "Votre compte existe pas. Demandez à admin de se connecter et de vous créer un compte.";
            writeToFile(jsonOutput("Erreur", errorMessage)); // Enregistre le message d'erreur sous format JSON
            System.err.println(errorMessage);
            System.exit(1); //Arret du programme
        }

        // Affichage des activités du projet
        for (Activité s : project1.activité) {  //On utilise project1 vu que tous les projets ont les memes disciplines)
            String activityMessage = s.getActivité();
            writeToFile(jsonOutput("Activité", activityMessage)); // Enregistre chaque activité sous format JSON
            System.out.println(activityMessage);
        }

        int choixA = 0; //pour choisir quelle activité

        // Si l'utilisateur a choisi de débuter une activité
        if (choixP == 1) {
            choixA = keyboard.nextInt(); // Saisie de l'activité choisie
            writeToTextFile(String.valueOf(choixA)); // Enregistrement de l'activité choisie dans un fichier texte

            // Lancement de l'activité en fonction du choix de l'utilisateur
            switch (choixA) {
                case 1:
                    project1.activité.get(0).debuter(); // Début de la première activité
                    String beginMessage1 = system.enregistrerDebutActivité(project1.activité.get(0));
                    writeToFile(jsonOutput("Message", beginMessage1)); // Enregistrement du début de l'activité sous format JSON
                    break;
                case 2:
                    project1.activité.get(1).debuter(); // Début de la deuxième activité
                    String beginMessage2 = system.enregistrerDebutActivité(project1.activité.get(1));
                    writeToFile(jsonOutput("Message", beginMessage2)); // Enregistrement du début de l'activité sous format JSON
                    break;
                case 3:
                    project1.activité.get(2).debuter(); // Début de la troisième activité
                    String beginMessage3 = system.enregistrerDebutActivité(project1.activité.get(2));
                    writeToFile(jsonOutput("Message", beginMessage3)); // Enregistrement du début de l'activité sous format JSON
                    break;
                case 4:
                    project1.activité.get(3).debuter(); // Début de la quatrième activité
                    String beginMessage4 = system.enregistrerDebutActivité(project1.activité.get(3));
                    writeToFile(jsonOutput("Message", beginMessage4)); // Enregistrement du début de l'activité sous format JSON
                    break;
                case 5:
                    project1.activité.get(4).debuter(); // Début de la cinquième activité
                    String beginMessage5 = system.enregistrerDebutActivité(project1.activité.get(4));
                    writeToFile(jsonOutput("Message", beginMessage5)); // Enregistrement du début de l'activité sous format JSON
                    break;
            }

        } else if (choixP == 2) { // Si l'utilisateur a choisi de terminer une activité
            choixA = keyboard.nextInt(); // Saisie de l'activité choisie
            writeToTextFile(String.valueOf(choixA)); // Enregistrement de l'activité choisie dans un fichier texte

            // Terminaison de l'activité en fonction du choix de l'utilisateur
            switch (choixA) {
                case 1:
                    project1.activité.get(0).terminer(); // Terminaison de la première activité
                    String endMessage1 = system.enregistreFinActivité(project1.activité.get(0));
                    writeToFile(jsonOutput("Message", endMessage1)); // Enregistrement de la fin de l'activité sous format JSON
                    break;
                case 2:
                    project1.activité.get(1).terminer(); // Terminaison de la deuxième activité
                    String endMessage2 = system.enregistreFinActivité(project1.activité.get(1));
                    writeToFile(jsonOutput("Message", endMessage2)); // Enregistrement de la fin de l'activité sous format JSON
                    break;
                case 3:
                    project1.activité.get(2).terminer(); // Terminaison de la troisième activité
                    String endMessage3 = system.enregistreFinActivité(project1.activité.get(2));
                    writeToFile(jsonOutput("Message", endMessage3)); // Enregistrement de la fin de l'activité sous format JSON
                    break;
                case 4:
                    project1.activité.get(3).terminer(); // Terminaison de la quatrième activité
                    String endMessage4 = system.enregistreFinActivité(project1.activité.get(3));
                    writeToFile(jsonOutput("Message", endMessage4)); // Enregistrement de la fin de l'activité sous format JSON
                    break;
                case 5:
                    project1.activité.get(4).terminer(); // Terminaison de la cinquième activité
                    String endMessage5 = system.enregistreFinActivité(project1.activité.get(4));
                    writeToFile(jsonOutput("Message", endMessage5)); // Enregistrement de la fin de l'activité sous format JSON
                    break;
            }
        }
    }

    // Méthode pour générer une sortie JSON formatée
    private static String jsonOutput(String key, String value) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(new JsonMessage(key, value));
    }

    // Méthode pour écrire du contenu JSON dans un fichier
    private static void writeToFile(String json) {
        try (FileWriter writer = new FileWriter("output.json", true)) {
            writer.write(json + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour écrire du contenu texte dans un fichier
    private static void writeToTextFile(String text) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(text + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Classe interne pour structurer les messages en JSON
    static class JsonMessage {
        private String key;
        private String value;

        public JsonMessage(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
