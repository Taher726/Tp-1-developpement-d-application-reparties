package server;
import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		try {
			/*Creation de l'objet socket*/
			ServerSocket server = new ServerSocket(1234);
			System.out.println("Le serveur attend la connection d'un client");
			/*Attendre la connexion d'un client. Creation de l'objet socket cote serveur suite à la connexion du client*/
			Socket socket = server.accept();
			System.out.println("Un client est connecté");
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			int nb = is.read();
			int rep1 = nb * 5;
			os.write(rep1);
			int rep2 = nb + 5;
			os.write(rep2);
			/*Fermeture de la connexion*/
			socket.close();
			server.close();
			System.out.println("Fermeture de la connexion");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
