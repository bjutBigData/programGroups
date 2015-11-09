/**
 * Created by mohaowen on 10/1/15.
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;


public final class AccessTextFile {
    /*
    * 将流中的文本读入一个StringBuffer中
     */
    public void readToBuffer(StringBuffer buffer, InputStream is) throws IOException{
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine();
        while( line != null){
            buffer.append(line);
            buffer.append("\n");
            line = reader.readLine();
        }
    }

    /*
     * StringBuffer to Stream
     */
    public void writeFromBuffer(StringBuffer buffer, OutputStream os) throws IOException{
        PrintStream ps = new PrintStream(os);
        ps.print(buffer.toString());
    }

    public void copyStream(InputStream is, OutputStream os) throws IOException{
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(os));
        line = reader.readLine();
        while(line != null){
            writer.println(line);
            line = reader.readLine();
        }
        writer.flush();
    }

    /*
     * call copyStream(InputStream, OutputStream) to copy text file
     */
    public void copyTextFile(String inFilename, String outFilename) throws IOException{
        InputStream is = new FileInputStream(inFilename);
        OutputStream os = new FileOutputStream(outFilename);
        copyStream(is, os);
        is.close();
        os.close();
    }

    public static void main(String[] args) throws IOException{
        int sw =1;
        AccessTextFile test = new AccessTextFile();

        switch(sw){
            case 1:
            {
                InputStream is = new FileInputStream("\\.\\test.txt");
                StringBuffer buffer = new StringBuffer();
                test.readToBuffer(buffer, is);
                System.out.println(buffer);
                is.close();
                break;
            }
            case 2:
            {
                StringBuffer buffer = new StringBuffer("Only a test");
                test.writeFromBuffer(buffer, System.out);
                break;
            }
            case 3:
            {
                test.copyTextFile("\test.txt", "\test1.txt");
            }
            break;
        }
    }
}




















