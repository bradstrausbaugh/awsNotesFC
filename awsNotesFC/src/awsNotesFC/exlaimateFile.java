
/*
 * 2019-09-15-su
 * 
 * I wrote this program for my AWS-CDA notes
 * 
 * For any lines in that file that contain the sub-string "~fc" (for flashcard),
 * this program inserts a "!" at the beginning of that line, just to make that line
 * more conspicuous.
 *  
 */


package awsNotesFC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.nio.file.Files;

public class exlaimateFile {

	public static void main(String[] args) {
		
		 try
		  {
			int recordsRead = 0;
			int recordsWritten = 0;
			int recordsExclaimated = 0;
			String infilename = "/home/brad/Dropbox/BradsStuff/_CoreStudies/AWS/CertificationDeveloperAssociate.txt";
		    BufferedReader reader = new BufferedReader(new FileReader(infilename));
		    String line;
			String outfilename = "/home/brad/Dropbox/BradsStuff/_CoreStudies/AWS/ExclaimatedFile.txt";
		    BufferedWriter writer = new BufferedWriter(new FileWriter(outfilename));
		    while ((line = reader.readLine()) != null)
		    {
		      recordsRead++;
		      // System.out.println(line);
		      if (line.indexOf("~fc") >= 0) {
		    	  line = "!" + line.substring(1,line.length());
		    	  recordsExclaimated++;
		      }
	    	writer.write(line + "\r\n");
	    	recordsWritten++;
		    }
		    reader.close();
		    writer.close();
		    System.out.println("       recordsRead: " + recordsRead);
		    System.out.println("    recordsWritten: " + recordsWritten);
		    System.out.println("recordsExclaimated: " + recordsExclaimated);
		    return;
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred");
		    e.printStackTrace();
		    return;
		  }
	}

}
