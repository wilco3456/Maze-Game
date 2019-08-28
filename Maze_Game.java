//CHANGE MAZE FILE DIRECTORY BEFORE RUNNING PROGRAM

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Maze_Game {
	//Maze game
	public static char[][] main(String fileName) {
		
		BufferedReader br = null;
		FileReader fr = null;
		char[][] mazeArray = null;
		
		try {   //try and catch block used because a file is being read and an exception needs to be thrown if it doesn't exist
	
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
	
			String theCurrentLine;
			int noOfChars = 0;
			int noOfLines = 0;
			while ((theCurrentLine = br.readLine()) != null) {	//Used to find out how many lines there are and how many characters there are on each line in the file
				noOfChars = theCurrentLine.length();
				noOfLines++;
			}
			
			mazeArray = new char[noOfLines][noOfChars] ;	//Array needs to be initialised with the size, which is what the previous for-loop is used for	
			br = new BufferedReader(new FileReader(fileName));
			
			int i = 0;
			while ((theCurrentLine = br.readLine()) != null) {		//Iterate through the text as long as the current line being read is not null
				for (int j = 0; j < theCurrentLine.length(); j++){
					if (i == 1 && j == 1) mazeArray[i][j] = '\u0031';   //Inserts number 1 which will be a blue ball into the top left corner for the player
					else if (i == (noOfLines - 2) && j == (noOfChars - 2)) mazeArray[i][j] = '\u0032';		//Inserts number 2 which will be a red ball into the bottom right corner to show the end point
					else mazeArray[i][j] = theCurrentLine.charAt(j);	//Reads in the rest of the file contents normally and initialises the values into the array
				}
				i++;	
			}
			
			for (int x = 0; x < noOfLines; x++){	//prints the maze to the terminal
				for (int j = 0; j < noOfChars; j++){
					System.out.print(mazeArray[x][j]);
				}
				System.out.println();
			}
			
			} catch (IOException e) {
	
			e.printStackTrace();
	
		} 
		
		finally {
	
			try {	//If the buffer reader and file reader are not empty, close both of the streams
	
				if (br != null)
					br.close();
	
				if (fr != null)
					fr.close();

			} 
			catch (IOException ex) {	//If an error occurs while closing the streams, throw an exception.

			ex.printStackTrace();

			}
		}
		
		
		return mazeArray;
	}
	
	public static char[][] testmain(){
		while(true) {
			System.out.println("### Main");
			System.out.println("Please input the filename of the maze you wish to find, else input quit (to exit)");
			Scanner input = new Scanner(System.in);
			String maze_file_name = input.nextLine();

			if (!maze_file_name.equals("quit")) {
				File maze_file = new File(maze_file_name);
				if (maze_file.isFile()) {
					String file = maze_file_name;        //Needs to be changed to the directory of the maze file
					char[][] array = main(file);
					return array;
				}
				else {
					continue;
				}
			} else {
				System.exit(0);
			}
		}
	}

	
}