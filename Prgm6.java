import java.util.*;
class InputException extends Exception 
{ 
    public InputException(String s) 
    { 
        
        super(s); 
    } 
} 
public class Prgm6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
			System.out.println("enter a number");
			int n = scanner.nextInt();
			try {
				if(n > 100) {
					throw new InputException("please enter a number not grater than 100");
				}
				
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		
	}
}
