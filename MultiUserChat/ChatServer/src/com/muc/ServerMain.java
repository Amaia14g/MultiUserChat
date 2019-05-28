package com.muc;


/** _
 * created by Amaia G
 * opens the port
 */
public class ServerMain {
    public static void main(String[] args) {
        int port = 8818;
        Server server = new Server(port);
        server.start();

    }


}




