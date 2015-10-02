package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	////////////////// Attributes //////////////////////////////////////////////////////
	
	private int startAdress;
	private int endAdress;
	private int board[];
	
	
	//////////////////// Constructors ////////////////////////////////////////////////////// 

	public Memory(int startAdress, int endAdress) 
	{	
		this.startAdress = startAdress;
		this.endAdress = endAdress;
		this.board = new int [endAdress - startAdress];
	}
	
	////////////////// Getters //////////////////////////////////////////////////////

	public int getStartAddress()
	{	
		return this.startAdress;
	}
	
	
	//////////////////// Methods ////////////////////////////////////////////////////////

	public void write(int currentAddress, int instructionParam)
	{
			this.board[currentAddress] = instructionParam ;
	}

	public int read(int currentAddress)
	{
			return this.board[currentAddress];
	}
}
