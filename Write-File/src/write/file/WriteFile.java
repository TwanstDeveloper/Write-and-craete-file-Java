package write.file;

import java.io.FileWriter;

public class WriteFile {

        public static void main(String[] args) {

                try {
                        FileWriter f = new FileWriter ("C:\\Users\\Kakon Soft\\Desktop\\Twanst.txt");
                           
                        f.write("Hello World IM Twanst Developer");
                        f.close();
             
                } catch (Exception ex) {
                        System.out.println("Error");
                }
        }

}
