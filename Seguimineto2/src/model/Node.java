package model;

public class Node {
	
	private int value;
	private int next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node(int value) {
		this.value = value;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Node{" +
				"value=" + value +
				", next=" + next +
				'}';
	}
}
