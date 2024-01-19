
public class BTNode {
	private BaseballBat data;
	private BTNode leftC;
	private BTNode rightC;

	
	
	public BTNode(BaseballBat d, BTNode l, BTNode r) {
		data = d;
		leftC = l;
		rightC = r;
	}
	
	
	public BaseballBat getData() {
		return data;
	}
	
	public BTNode getLeftChild() {
		return leftC;
	}
	
	public BTNode getRightChild() {
		return rightC;
	}
	
	public void setData(BaseballBat b) {
		data = b;
	}
	
	public void setLeftChild(BTNode l) {
		leftC = l;
	}
	
	public void setRightChild(BTNode r) {
		rightC = r;
	}
}
