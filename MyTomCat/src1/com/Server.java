package com;

import resource.Application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Application application = new Application();

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(new SocketNode(accept)).start();
        }
    }

    public static Application getApplication() {
        return application;
    }
}
