
public class Stack extends AbstractStack {

	public Integer pop() {
		if (size <= 0) {
			throw new IllegalStateException();
		}
		size--;
		return stack[size];
	}

	public Integer peek() {
		if (size <= 0) {
			throw new IllegalStateException();
		}
		return stack[size - 1];

	}

	@Override
	public String toString() {
		String result = "Stack [";
		for (int i = 0; i < size; i++) {
			if (i != size - 1) {
				result += stack[i] + ", ";
			} else {
				result += stack[i];
			}
		}
		return result + "]";
	}
}
