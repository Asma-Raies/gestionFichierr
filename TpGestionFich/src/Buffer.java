import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {

	
	public static void main (String []args) {
		
		try {
			FileReader f = new FileReader ("document.txt");
			BufferedReader br = new BufferedReader (f);
			
			String ligne = br.readLine() ; 
			
		while (ligne!=null) {
			System.out.println(ligne);
		ligne = br.readLine();
		
			
		}
		f.close();
		br.close();
		
	}catch (FileNotFoundException exc)

{ System.out.println("le fichier n'existe pas");}

catch (IOException exc) {

System.out.println("lecture avec erreur"+exc.getMessage());}



	}}

