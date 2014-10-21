package main;

import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import domain.BehandelCode;

public class Client implements Runnable {

	private Socket clientSocket;
	
	public static void main(String[] args) {
		(new Thread(new Client("localhost", 9999))).start();
	}

	public Client(String host, int port) {
		try {
			this.clientSocket = new Socket(host, port);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void run()
	{
		try
		{
			/*********************************************************
			** Send values
			*********************************************************/			
			// Create output stream
			ObjectOutputStream outputStream = new ObjectOutputStream(
				new BufferedOutputStream(this.clientSocket.getOutputStream()));
			
			// Create object to send
			outputStream.writeObject(new String("1"));
			
			// Send the output
			outputStream.flush();
			
			// Create input stream
			ObjectInputStream inputStream = new ObjectInputStream(
					this.clientSocket.getInputStream());
			
			/*********************************************************
			** Return values
			*********************************************************/
			// Define returned object | Try to cast object to BehandelCode
			Object object = (BehandelCode) inputStream.readObject();
			
			if(object != null)
			{
				BehandelCode tmp = (BehandelCode) object;
				System.out.println(tmp.toString());
			}
			else
			{
				System.out.println("Kaas");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
