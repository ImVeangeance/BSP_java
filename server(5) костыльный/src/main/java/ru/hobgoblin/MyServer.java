package ru.hobgoblin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3228);
        Socket client;
        int i = 0;
        do {
            client = server.accept();
            new Thread(new MySingleClientHandler(client)).start();
        } while (true);
    }
}