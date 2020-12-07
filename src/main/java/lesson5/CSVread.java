package lesson5;
import java.io.*;

public class CSVread {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("test1.csv"))
        {

            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
