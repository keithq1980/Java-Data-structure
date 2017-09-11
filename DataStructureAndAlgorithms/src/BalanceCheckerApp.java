import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 
 * @author keith_000
 * This program reads a (.java) file from a users input.
 * The program checks for open curly brackets { in
 * the form of a character and pushes it onto a list(Stack),
 * the open bracket is popped from the stack when a matching
 * closed } bracket is found. The result is returned as a 
 * balanced or unbalanced stack.
 *
 */
public class BalanceCheckerApp {
	
	public static void main(String[] args) throws Exception {
		ListStackInterface myStack = new ListStackInterface();
		//#### user enters file name ####
		System.out.print("Enter the file name with extention .java:  ");
		Scanner input = new Scanner(System.in);
		File fr = null; 
		FileInputStream fis = null;
	
	try {
		//#### pass the users filename into File & create a file stream
		fr = new File("Keith/Test/"+input.nextLine());
		fis = new FileInputStream(fr);
		
		char currentChar;
		/*
		 * loop through the file until the end " > 0"
		 * and cast results into chars.
		 * push onto the stack when encounter { open.
		 * pop from the stack when encounter } closed
		 */
		while (fis.available() > 0) {
			currentChar = (char)fis.read();
			if(currentChar == '{') {
				myStack.push(1, currentChar);	
			}				
			else if(currentChar == '}') {
				myStack.pop(1);
			}
					
		}//EndWhile
		//#### call the exception thrown if top has items after loop finishes #### 
		if (myStack.top() != null) {	
		}
		
	}//try
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		if(input !=null) {
			input.close();
		}	
	}	
	
	}//main
}
