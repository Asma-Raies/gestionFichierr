import java.io.File;
import java.io.IOException;

public class MethodFichier {
	
	public static void main (String []args) {
		
		try {
			File f = new File ("fichier.txt");
			if (f.exists()) {
				System.out.println("le fichier existe ");
				System.out.println("nom de fichier :"+f.getName());
				System.out.println("chemin du fichier "+f.getPath());
				
				System.out.println("chemin absolu : "+f.getAbsolutePath());
			}
			else 
			{
				if (f.createNewFile()) System.out.println("creation reussie ");
				else
					System.out.println("echec de creation");
				
			}}
			catch (IOException exc) {
				System.out.println("erruer dans le fichier "+exc.getMessage());
			}
		
	}

}


	