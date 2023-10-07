package client;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			/*Création de l'objet socket coté client*/
			Socket socket = new Socket("localhost",1234);
			System.out.println("Je suis connecté");
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			int nb;
			System.out.println("Donner un nombre");
			Scanner scanner = new Scanner(System.in);
			nb = scanner.nextInt();
			os.write(nb);
			System.out.println(nb+" * 5 = "+is.read());
			System.out.println(nb+" + 5 = "+is.read());
			/*Fermeture de la connexion*/
			socket.close();
			scanner.close();
			System.out.println("Fermeture de la connexion");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
