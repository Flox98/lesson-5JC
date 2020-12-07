package lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVwtite {
    public static void main(String[]args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("test1.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("id");
        sb.append(',');
        sb.append("Name");
        sb.append('\n');

        sb.append("1");
        sb.append(',');
        sb.append("John");
        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
        System.out.println("файл создан");
    }
}
