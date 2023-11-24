
import java.io.*;
public class TestExceptions{
    public static void main(String[] args) throws FileNotFoundException {

        //Open the Input file
        File inputFile = new File("Sample.jpg");
        //Open the Output file
        File outputFile1 = new File("Output1.jpg");

        //Get file handlers in Byte Stream format
        FileInputStream in1 = new FileInputStream(inputFile);
        FileOutputStream out1 = new FileOutputStream(outputFile1);

        int c1;

        while (true){
            try {
                if (!((c1 = in1.read()) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }   //Until end of file
            try {
                out1.write(c1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //Close the files
        try {
            in1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            out1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


