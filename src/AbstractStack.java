
public abstract class AbstractStack implements InterfaceStack {

	protected Integer[] stack;
	protected int size;
	protected int lastElemIndex;
	
	
	public AbstractStack() {
		stack = new Integer[100];
		size = 0;
		lastElemIndex = -1;
	}

	@Override
	public void push(Integer element) {
		stack[size]=element;
		size ++;
		lastElemIndex++;
	}

	@Override
	public int getSize() {
		return size;
		
	}
	
}
