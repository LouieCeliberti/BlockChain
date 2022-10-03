package BlockChain;

import java.util.*;

public class Block {

	public Block(LinkedList<String> transactions, int previousBlockHash) {
		super();
		this.transactions = transactions;
		this.previousBlockHash = previousBlockHash;
		//this.blockHash = List.of(,this.previousBlockHash)
	}
	
	
	LinkedList<String> transactions = new LinkedList<String>();
	private int blockHash;
	private int previousBlockHash;
	
	
	public LinkedList<String> getTransactions() {
		return transactions;
	}
	public void setTransactions(LinkedList<String> transactions) {
		this.transactions = transactions;
	}
	public int getBlockHash() {
		return blockHash;
	}
	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	public int getPreviousBlockHash() {
		return previousBlockHash;
	}
	public void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}
	
	
}
