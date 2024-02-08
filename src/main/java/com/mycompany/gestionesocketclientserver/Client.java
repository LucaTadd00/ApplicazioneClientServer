package com.mycompany.gestionesocketclientserver;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TaddiaL
 */
public class Client {
    
     public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 1789);
            
            //qui avviene lo scambio di dati
           socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
