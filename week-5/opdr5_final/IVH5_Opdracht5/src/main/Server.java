package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import dataStorage.BehandelCodeDAO;
import domain.BehandelCode;

public class Server {

	private ServerSocket serverSocket;
	private ArrayList<BehandelCode> behandelCodes;
	
	public static void main(String[] args)
	{
		Server server = new Server(9999);
		server.run();
	}
	
	public Server(int port)
	{
		this.behandelCodes = BehandelCodeDAO.getBehandelCodes();
		
		try
		{
			this.serverSocket = new ServerSocket(port);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Waiting for requests..");
				Socket clientSocket = this.serverSocket.accept();
				System.out.println("Processing request..");
				
				// Create input stream
				ObjectInputStream inputStream = new ObjectInputStream(
						new BufferedInputStream(clientSocket.getInputStream()));
				
				// Create output stream
				ObjectOutputStream outputStream = new ObjectOutputStream(
						new BufferedOutputStream(clientSocket.getOutputStream()));
				
				// Get the id
				int codeId = -1;
				String temp = (String) inputStream.readObject();
				codeId = Integer.parseInt(temp);
				
				if(codeId != -1)
				{
					System.out.println("Searching for requested code..");
					for(BehandelCode bc : this.behandelCodes)
					{
						if(bc.getCode() == codeId)
						{
			                outputStream.writeObject(bc);
			                outputStream.flush();
			                System.out.println("Reponse has been sent..");
						}
					}
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			} 
		}
	}

}
