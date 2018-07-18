package test1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main (String[] args) throws IOException {
        File file = null;
        FileWriter fw = null;
        file = new File("E://filewrite.txt");
        try
        {
            if (!file.exists())
            {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            for( int i = 0; i<3000; i++)
            {
                fw.write("abcdefgh"+i+", ");
                fw.write("ssssssss"+i+",/r/n");
                fw.flush();
            }
            System.out.println("Success");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fw != null)
            {
                try
                {
                    fw.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
