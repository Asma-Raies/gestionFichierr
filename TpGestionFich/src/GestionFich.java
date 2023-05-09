import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GestionFich {

	public static void main(String[] args) {
		

		
			File fichier = new File ("fichier.txt");
			PrintWriter writer = null;
				        try {
				            writer = new PrintWriter(new BufferedWriter(new FileWriter(fichier)));
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
		
				       
				        writer.println("bonjour tout le monde ");
				        writer.println("bonjour dsi23");
				        writer.println("good bye ");
		
				       
				        writer.close();
		
				       
				        BufferedReader reader = null;
				        try {
				            reader = new BufferedReader(new FileReader(fichier));
				        } catch (FileNotFoundException e) {
				            e.printStackTrace();
				        }
		
				       
				        int nbLignes = 0;
				        int nbMots = 0;
				        String ligne = null;
				        try {
				            while ((ligne = reader.readLine()) != null) {
				                nbLignes++;
				                StringTokenizer st = new StringTokenizer(ligne);
				                nbMots += st.countTokens();
				            }
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
		
				       
				        try {
				            reader.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
		
				       
				        System.out.println("Nombre de lignes ajoutées : " + nbLignes);
				        System.out.println("Nombre de mots ajoutés : " + nbMots);
		
				        
				        Scanner scanner = new Scanner(System.in);
				        System.out.print("Entrez un mot à rechercher dans le fichier : ");
				        String motRecherche = scanner.next();
				        try {
				            reader = new BufferedReader(new FileReader(fichier));
				            while ((ligne = reader.readLine()) != null) {
				                if (ligne.contains(motRecherche)) {
				                    System.out.println("Le mot a été trouvé dans la ligne : " + ligne);
				                    break;
				                }
				            }
				            if (ligne == null) {
				                System.out.println("Le mot n'a pas été trouvé dans le fichier.");
				            }
				        } catch (IOException e) {
				            e.printStackTrace();
				        } finally {
				            try {
				                reader.close();
				            } catch (IOException e) {
				                e.printStackTrace();
				            }
				        }
					}
		
	}
	
			

       
        

	


