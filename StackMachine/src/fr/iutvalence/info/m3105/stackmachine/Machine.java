package fr.iutvalence.info.m3105.stackmachine;

public class Machine
{
	////////////////// Attributes //////////////////////////////////////////////////////

	private CPUAbstract cpu;
	private Memory programMemory;
	private IO ioSystem;
	private Stack expStack;
	private Stack callStack;
	

	//////////////////// Constructors ////////////////////////////////////////////////////// 

	public Machine(CPUAbstract cpu, Memory programMemory, Stack expStack, Stack callStack, IO ioSystem)
	{
		super();
		this.cpu = cpu;
		this.programMemory = programMemory;
		this.callStack = callStack;
		this.expStack = expStack;
		this.ioSystem = ioSystem;
		
		this.cpu.wireToProgramMemory(programMemory);
		this.cpu.wireToExpStack(expStack);
		this.cpu.wireToCallStack(callStack);
		this.cpu.wireToIoSubsystem(ioSystem);
	}

	
	//////////////////// Methods ////////////////////////////////////////////////////////

	public void loadProgram(Program program) throws AddressOutOfBoundsException
	{
		int currentAddress = this.programMemory.getStartAddress();

		for (int instructionNumber = 0; instructionNumber < program.getInstructionCount(); instructionNumber++)
		{
			Instruction instruction = program.getInstructionAt(instructionNumber);
			this.programMemory.write(currentAddress, instruction.getOpCode());
			currentAddress++;
			int[] instructionParams = instruction.getParams();
			if (instructionParams != null)
			{
				for (int instructionParam : instructionParams)
				{
					this.programMemory.write(currentAddress, instructionParam);
					currentAddress++;
				}
			}
		}
	}

	public void executeProgram(int address)
	{
		cpu.clearStacks();
		cpu.setPC(address);
		cpu.run();
		System.out.println("(end of program execution)");
	}

}
