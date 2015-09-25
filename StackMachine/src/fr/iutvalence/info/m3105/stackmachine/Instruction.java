package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {
	
	private int opCode;
	private int[] instruc;

	public Instruction(int opCode, int[] instruc) {
		super();
		this.opCode = opCode;
		this.setInstruc(instruc);
	}

	private void setInstruc(int[] instruc2) 
	{
		// TODO Auto-generated method stub
		
	}

	public int getOpCode()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int[] getParams()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int[] getInstruc() {
		return instruc;
	}


}
