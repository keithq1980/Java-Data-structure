import java.io.*;
import java.util.Scanner;
public class FileReaderClass {

		private static Scanner input;
		//private static String notFoundMessage ="Return String Empty or No brackets found??";

		public static  char getBrackets() {

			input = new Scanner(System.in);
			System.out.print("Enter the file name with extention : ");
			
			//FileInputStream inputStream = new FileInputStream("");
			
			// create file path and pass into new bufferReader
			try (BufferedReader br = new BufferedReader(new FileReader("Keith/"+ input.nextLine()))) {
				char sCurrentChar;
				// read lines until null check for { or }
				while ((sCurrentChar = (char)br.read()) != '\0') {//
					if(sCurrentChar == '{') {						
						return sCurrentChar;
					}					
				}//while
			} catch (IOException e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
			}
			return  '\0'; 
		}//end method	
	}
	
