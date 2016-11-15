public class Queue extends AbstractStack {

	@Override
	public Integer pop() {
		if (size <= 0) {
			throw new IllegalStateException();
		}
		
		size--;
		
		int i = lastElemIndex- size;
		return stack[i];
	}

	@Override
	public Integer peek() {
		if (size <= 0) {
			throw new IllegalStateException();
		}
		
		int i = lastElemIndex - (size-1);
		return stack[i];
	}

	@Override
	public String toString() {

		String result = "Queue [";
		for (int i = (lastElemIndex - size) + 1; i <= lastElemIndex; i++) {
			if (i != lastElemIndex) {
				result += stack[i] + ", ";
			} else {
				result += stack[i];
			}
		}
		return result + "]";
	
	}
	
	
	
	
	
}
