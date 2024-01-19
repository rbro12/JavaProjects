
public class BatTree {
	private BTNode root;

	
	
	public BatTree() {
		root = null;
	}
	
	private void inOrder(BTNode current) 
	{
		if(current!=null) {
			inOrder(current.getLeftChild());
			System.out.println(current.getData().toString());
			inOrder(current.getRightChild());
		}
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	private void preOrder(BTNode current) {
		
		if(current!=null) {
			System.out.println(current.getData().toString());
			preOrder(current.getLeftChild());
			preOrder(current.getRightChild());
		}
		
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	
	private void postOrder(BTNode current) {
		if(current !=null) {
			postOrder(current.getLeftChild());
			postOrder(current.getRightChild());
			System.out.println(current.getData().toString());
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	
	
}
