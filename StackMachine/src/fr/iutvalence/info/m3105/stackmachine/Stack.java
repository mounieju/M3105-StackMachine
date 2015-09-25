package fr.iutvalence.info.m3105.stackmachine;

public class Stack 
{
	private int size;

	public Stack(int size) throws InvalidParametersException
	{
		this.setSize(size);
	}

	public int getSize() 
	{
		return size;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}
}
