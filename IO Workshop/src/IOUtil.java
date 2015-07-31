

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class IOUtil {
	/*
	 * This method shall open a field that the user chooses
	 * then it is passed through a StringBuffer 
	 */
	public static StringBuffer openFile(){
		StringBuffer fileContents = new StringBuffer();	//declares a StringBuffer to hold the text in the file
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter ("TEXT FILES", "txt", "text");
		
		chooser.setFileFilter(filter);
		chooser.showOpenDialog(null);
		
		File targetFile = chooser.getSelectedFile();
		
		try{
			Scanner scanner = new Scanner(targetFile);
			while (scanner.hasNextLine()){
				fileContents.append(scanner.nextLine() + "\r\n"); 			
				
				
			}
			scanner.close();
		}catch(FileNotFoundException e){
			System.out.println("We've encountered a file not found Exception! :");
			e.printStackTrace();
		}
			
		return new StringBuffer(fileContents);
	}
				//this method takes the StringBuffer object to hold  the text in the file
				//then we return a new StringBuffer item which contains the text from the file
	

	
	public static void saveFile(String targetData){
		JFileChooser chooser = new JFileChooser(); //Declares the JFileChooser, which will help us in the output process
		chooser.showSaveDialog(null);	//displays a save dialog window
		
		String fileName = chooser.getSelectedFile().toString();	//Creates 
		if(!fileName.endsWith(".txt")){
				fileName += ".txt";
		}
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(targetData);
			writer.close();
		}catch{IOException e;
		
		}
		
		public static void main(String[] args){
			//string sb = IOUtil.openFile();
			//System.out.println(sb);
			IOUtil.saveFile("Test Save String"); 				//for playing around, you should create a GUI, with open, save & clear buttons for save file.
		}
			
	}

}