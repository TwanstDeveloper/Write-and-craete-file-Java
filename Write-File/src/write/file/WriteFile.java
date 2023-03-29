package write.file;

import java.io.File;

public class WriteFile {

        public static void main(String[] args) {

                try {
                        File f = new File("C:\\Users\\Kakon Soft\\Desktop\\Twanst.txt");
                           f.createNewFile();
                        if (f.exists()) {
                                System.out.println("This is File Name: " + f.getName());
                                System.out.println("This is File Path: " + f.getAbsolutePath());
                                System.out.println("This is File Read: " + f.canRead());
                                System.out.println("This is File Write: " + f.canWrite());
                                System.out.println("This is File Length: " + f.length());
                        }
                } catch (Exception ex) {
                        System.out.println("Error");
                }
        }

}
