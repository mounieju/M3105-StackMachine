package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;


public abstract class CPU 
{
	////////////////// Attributes //////////////////////////////////////////////////////
	
	protected IO ioSystem;
	protected Memory memoryProgram;
	protected Stack callStack;
	protected Stack expStack;
	private int programCounter;

	public void run()
	{
		try
		{
			while (true)
			{
				int opCode = this.memoryProgram.read(programCounter);
				decodeAndExecute(opCode);
			}
		}
		catch (AddressOutOfBoundsException e)
		{
			// TODO something is missing here...
		}
		catch (IOException e)
		{
			// TODO something is missing here...
		}
		catch (StackOverflowException e)
		{
			// TODO something is missing here...
		}
		catch (StackUnderflowException e)
		{
			// TODO something is missing here...
		}		
	}

	
	protected abstract void decodeAndExecute(int opCode);


	public void wireToProgramMemory(Memory programMemory) 
	{
		// TODO Auto-generated method stub	
	}

	public void wireToExpStack(Stack expStack) 
	{
		// TODO Auto-generated method stub
		
	}

	public void wireToCallStack(Stack callStack)
	{
		// TODO Auto-generated method stub
		
	}

	public void wireToIoSubsystem(IO ioSystem) 
	{
		// TODO Auto-generated method stub
		
	}

	public void clearStacks() 
	{
		// TODO Auto-generated method stub
		
	}

	public void setPC(int address)  
	{
		this.programCounter = address;
	}



	// TODO something is missing here...
}
