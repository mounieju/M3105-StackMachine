package fr.iutvalence.info.m3105.stackmachine;

public class Instruction 
{
	////////////////// Attributes //////////////////////////////////////////////////////

	private int opCode;
	private int[] instruc;

	////////////////// Constructor //////////////////////////////////////////////////////

	public Instruction(int opCode, int[] instruc) {
		super();
		this.opCode = opCode;
		this.setInstruc(instruc);
	}

	////////////////// Getters & setters //////////////////////////////////////////////////////

	private void setInstruc(int[] instruc2) 
	{
		// TODO Auto-generated method stub
		
	}

	public int getOpCode()
	{
		return this.opCode;
	}

	public int[] getParams()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int[] getInstruc() 
	{
		return instruc;
	}


}
