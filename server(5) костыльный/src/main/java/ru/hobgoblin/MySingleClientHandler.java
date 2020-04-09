package ru.hobgoblin;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MySingleClientHandler implements Runnable {
    private String tmp = "HTTP/1.1 200 OK\r\n" +
            "Content-Type: text/html\r\n" +
            "\r\n" +
            "<html><body><h1>" +
            "Hello" +
            "</h1></body></html>";
    Socket client;
    MySingleClientHandler(Socket client) {
        this.client = client;
    }
    @Override
    public void run() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print(tmp);
        out.flush();
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}