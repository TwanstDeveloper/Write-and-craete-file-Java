package write.file;

import java.io.FileReader;

public class WriteFile {

        public static void main(String[] args) {

                try {
                        FileReader f = new FileReader("C:\\Users\\Kakon Soft\\Desktop\\koya.txt");
                            int x=0;
                            while((x=f.read()) !=-1){
                            System.out.print((char)x);
                            
                            }
                     
                } catch (Exception ex) {
                        System.out.println("Error");
                }
        }

}
