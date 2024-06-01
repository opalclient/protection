package wtf.opal;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Opal-1.0-SNAPSHOT.jar");
        Prot.encrypt(file);
        
        return 0;
    }

}