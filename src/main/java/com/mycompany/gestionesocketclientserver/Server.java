package com.mycompany.gestionesocketclientserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TaddiaL
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1789);
            Socket client = server.accept();
            
            //qui avviene lo scambio di dati
            System.out.println("connessione stabilita");
            
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
