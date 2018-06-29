package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahern
 */
public class MyServer extends Thread {

    //atributos
    private int socketPortNumber;
    private Socket socket;

    //constructor
    public MyServer(Socket socket, int socketPortNumber) {
        super("Server Thread");
        this.socketPortNumber = socketPortNumber;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //instancia de un servidor
            ServerSocket serverSocket = new ServerSocket(this.socketPortNumber);
            
            /*--------------------------------------------------*/
            /*       variables para leer y escribir en red     */
            //para enviar datos
            PrintStream send = new PrintStream(socket.getOutputStream());

            //para recibir/leer datos
            BufferedReader receive = new BufferedReader(
                    new InputStreamReader(
                    socket.getInputStream()));
            /*--------------------------------------------------*/
                
                
                
        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
