

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Tests {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.push(3);
		q.push(6);
		q.push(4);
		q.push(5);
		q.push(1);
		q.push(9);

		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q);
	}
	
	//Stack tests
	
	@Test
	public void newStackHasZeroElements() {
		Stack stack = new Stack();
		int s = stack.getSize();
		assertThat(s, is(0));

	}

	@Test
	public void pushIncreasedStackSize() {
		Stack stack = new Stack();
		stack.push(2);
		int sSize = stack.getSize();
		assertThat(sSize, is(1));

	}

	@Test
	public void popDecreasedStackSize() {
		Stack stack = new Stack();
		stack.push(6);
		int beforePop = stack.getSize();
		stack.pop();
		int afterPop = stack.getSize();
		assertThat(beforePop, is(1));
		assertThat(afterPop, is(0));
	}

	@Test
	public void pushIncreasedAndPopDecreasedStackSize() {
		Stack stack = new Stack();
		stack.push(2);
		stack.pop();

		assertThat(stack.getSize(), is(0));
	}
	
	@Test
	public void peekElementSameSize() {
		Stack stack = new Stack();
		stack.push(6);
		stack.push(3);
		stack.peek();
		assertThat(stack.getSize(), is(2));
	}
	
	@Test
	public void isPeekElementSame() {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(7);
		stack.peek();
		assertThat(stack.peek(), is(7));
	}
	
	@Test(expected = IllegalStateException.class)
	public void popEmptyStack(){
		Stack stack = new Stack();
		stack.pop();
	}
	
	@Test(expected = IllegalStateException.class)
	public void peekEmptyStack(){
		Stack stack = new Stack();
		stack.peek();
	}
	@Test
	public void sameSizeAfterPeek() {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(7);
		stack.peek();
		assertThat(stack.getSize(), is(2));
	}
	
	
	//Queue tests
	
	@Test
	public void pushIncreasedQueueSize() {
		Queue queue = new Queue();
		queue.push(2);
		int qSize = queue.getSize();
		assertThat(qSize, is(1));

	}
	
	@Test
	public void popGetsRightNumber() {
		Queue queue = new Queue();
		queue.push(2);
		queue.push(4);
		
		assertThat(queue.pop(), is(2));
		assertThat(queue.pop(), is(4));
	}

	@Test
	public void popDecreasedQueueSize() {
		Queue queue = new Queue();
		queue.push(6);
		int beforePop = queue.getSize();
		queue.pop();
		int afterPop = queue.getSize();
		assertThat(beforePop, is(1));
		assertThat(afterPop, is(0));
	}

	@Test
	public void pushIncreasedAndPopDecreasedQueueSize() {
		Queue queue = new Queue();
		queue.push(2);
		queue.pop();

		assertThat(queue.getSize(), is(0));
	}
	
	@Test
	public void peekElementSameSizeQueue() {
		Queue queue = new Queue();
		queue.push(6);
		queue.push(3);
		queue.peek();
		
		assertThat(queue.getSize(), is(2));
	}
	
	@Test
	public void isPeekElementSameQueue() {
		Queue queue = new Queue();
		queue.push(5);
		queue.push(7);
		assertThat(queue.peek(), is(5));
	}
	
	@Test(expected = IllegalStateException.class)
	public void popEmptyQueue(){
		Queue queue = new Queue();
		queue.pop();
	}
	
	@Test(expected = IllegalStateException.class)
	public void peekEmptyQueue(){
		Queue queue = new Queue();
		queue.peek();
	}
	
}
