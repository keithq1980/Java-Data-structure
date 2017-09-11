
public class ListStackInterface implements StackInterface {
	
	private Node top;
	private int numOfItems;
	
	public ListStackInterface() {
		top = null;
		numOfItems = 0;
	}
	
	private Node find(int index) {
		Node curr = top;
		for(int i = 1; i < index ; i++)
		{
			curr = curr.getNext();
		}
		return curr;
	 } // end find
	
	@Override
	public boolean isEmpty() {
		return (numOfItems == 0);
	}
	
	public int size () {
		return numOfItems;
	}

	@Override
	public void popAll() {
		top = null;
		numOfItems = 0;
	}

	public void push(int index, Object item) throws StackException {
		Node newNode = new Node(item);
		if(index > numOfItems +1){
			throw new StackException("Out of bounds - cannot push onto stack");
		}
		else {
			newNode.setNext(top);
			top = newNode;
			numOfItems++;
		}
		
	}
	
	public void pop(int index) throws StackException {
		Node curr = find(index);
		if(top == null) {
			throw new StackException("Cannot POP from an empty STACK!");
		}
		else {
			top = curr.getNext();
			numOfItems--;
		}
	}
	
	@Override
	public Object top() throws StackException {
		// peek method
		if(isEmpty()) {
			throw new StackException("Stack Size = " + size() + "\n Balanced - The stack is empty");
		}
		else if(!isEmpty()) {
			throw new StackException("Stack Size = " + size() + "\n Unbalanced - The stack contains Items");
		}
		return find(1).getItem();
	}
}
