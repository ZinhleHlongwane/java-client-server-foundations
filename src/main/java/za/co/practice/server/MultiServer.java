package za.co.practice.server;

import java.io.IOException; //Jva forces us to handle networking errors
import java.net.ServerSocket; // Creates the listening server
import java.net.Socket; // Represents one connected client

public class MultiServer {
    public void start() {

        try {
            // Open server on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server started on port 5000.");

            // Wait for one client
            Socket clientSocket = serverSocket.accept();

            System.out.println("Client connected!");
        } catch (IOException e) {
            System.out.println("Server error occured.");
        }
    }

}

// Opens the port and waits for clients
// The server must open a port
// Wait for a client ClientConnection
// Accept that client connection
