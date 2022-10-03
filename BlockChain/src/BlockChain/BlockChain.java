package BlockChain;
import java.util.*;

public class BlockChain {

	public static void main(String[] args) {
		

		LinkedList<String> transaction_Names = new LinkedList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String newTransactionName = input.nextLine();
		
		
		transaction_Names.add(newTransactionName);
	
		
		for(int i = 0; i < transaction_Names.size(); i++) {
			
			int hashValue = transaction_Names.get(i).hashCode();
			System.out.println("The hash value for " + transaction_Names.get(i) + " is " + hashValue);
		
		}
		
		// demonstrating a serires of blocks in a chain
		
	}

}


