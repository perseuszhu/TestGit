package test1;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class FileRead {
    public static String txt2string(File file) {
        StringBuilder result = new StringBuilder();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = br.readLine()) != null)
            {
                result.append(System.lineSeparator() + s);
            }
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return result.toString();

        }




    public static void main(String[] args) {
        File file = new File("E:/filewrite.txt");
        System.out.println(txt2string(file));





    }

}
