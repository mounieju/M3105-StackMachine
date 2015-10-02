package fr.iutvalence.info.m3105.stackmachine;

public class Stack 
{
	////////////////// Attributes //////////////////////////////////////////////////////

	private int size;
	
	////////////////// Constructor //////////////////////////////////////////////////////

	public Stack(int size) throws InvalidParametersException
	{
		this.setSize(size);
	}

	////////////////// Getters & Setters ////////////////////////////////////////////////

	public int getSize() 
	{
		return size;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}
}
