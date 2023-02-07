package no.ntnu.idata2305.group10;

public class Main {

    private static boolean singleThreadMode = true;
    private static int serverPort = 8080;

    public static void main(String[] args) {
        System.out.println("\n");
        if (singleThreadMode) new SingleThreadedServer(serverPort).run();
        else new MultiThreadedServer(serverPort).run(); 
    }
}
