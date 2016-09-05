
/**
 * Write a description of class ReverseIt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class ReverseIt
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter input filename: ");
        String inFilename = myScanner.nextLine();
        System.out.print("Enter output filename: ");
        String outFilename = myScanner.nextLine();
        FileReader inReader = new FileReader(inFilename);
        PrintWriter outWriter = new PrintWriter(outFilename);
        Scanner inputFile = new Scanner(inReader);
        while (inputFile.hasNext())
        {
            String inString = inputFile.nextLine();
            String outString = "";
            for (int i = 0; i < inString.length(); i++)
                outString = inString.charAt(i) + outString;
            outWriter.println(outString);
        }
        inReader.close();
        outWriter.close();
        System.out.println("Goodbye!");
    }
}
