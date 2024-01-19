
public class LinkedBaseballBat {
	private BaseballBatNode head;
	
	public LinkedBaseballBat() {
		head = null;
	}
	
	
	public void insert(BaseballBat bat) {
		//If the linked list is empty this adds the new bat as a BatNode at the head of list
		if(this.isEmpty()) {
			head = new BaseballBatNode(bat,head);
		}
		
		//If the new bat's key is greater than the head node bat's key the new bat will be put into a node and become the new head of list
		
		else if(bat.compareTo(head.getData())>=0) {
			head = new BaseballBatNode(bat,head);
			
		}
		
		else {
			// Create a cursor to traverse the linked list
			BaseballBatNode cursor = head;
			while(cursor!=null) {
				//If the cursor is the last node it will create a new node for the bat and insert at the end of the list
				//The cursor's link is then changed to the new batnode that is created
				if(cursor.getLink()==null) {
					BaseballBatNode addBat = new BaseballBatNode(bat,cursor.getLink());
					cursor.setLink(addBat);
					break;
				}
				//If the next node after cursor contains data that is smaller than the inserted bat this will create a node from the inserted bat and
				// it will insert the node in between cursor and its next link
				// It then sets the cursor's link to the inserted bat node. 
				else if(bat.compareTo(cursor.getLink().getData())>=0) {
					BaseballBatNode addBat = new BaseballBatNode(bat,cursor.getLink());
					cursor.setLink(addBat);
					break;
				}
				
				
				cursor= cursor.getLink();
			}
		}
	}
	
	//How do we signal that the item was not found so it wasn't deleted because instructions say "don't print anything"
	public void delete(BaseballBat bat) {
		//If list is empty this exits method and does nothing
		if(this.isEmpty()) {
			return;
		}
		//This code will exicute if the head node is supposed to be deleted
		else if (head.getData().equals(bat)) {
			head = head.getLink();
		}
		
		else {
			//Create a cursor to traverse list
			BaseballBatNode cursor = head;
			while(cursor.getLink()!=null) {
				 if(cursor.getLink().getData().equals(bat)) {
					cursor.setLink(cursor.getLink().getLink());
					break;
				}
				 cursor = cursor.getLink();
			}
		}
	}
	
	// Gets how many elements/nodes are in the list
	public int size() {
		int ret = 0;
		BaseballBatNode cursor = head;
		while(cursor!=null) {
			ret+=1;
			cursor = cursor.getLink();
		}
		return ret;
	}
	
	
	//Returns true if list is empty otherwise false
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Gets the first index at which the parameter bat appears in the linked list
	public int indexOf(BaseballBat bat) {
		int currIndex = 1;
		BaseballBatNode cursor = head;
		while(cursor!=null) {
			
			//If the cursors data equals param bat it will return the curent index
			if(cursor.getData().equals(bat)) {
				return currIndex;
			}
			currIndex+=1;
			cursor = cursor.getLink();
		}
		return -1;
	}
	
	//Returns the last index at which the parameter bat appears in the linked list
	/**
	 * Code needs some adjustments with the 2nd while loop
	 * @param bat
	 * @return
	 */
	public int lastIndexOf(BaseballBat bat) {
		int currIndex = 1;
		BaseballBatNode cursor = head;
		while(cursor!=null) {
			
			//If the cursor's data equals param bat it enters another while loop to see if the next bat is still equal
			if(cursor.getData().equals(bat)) {
				
				//If the current bat is the last bat in the list or if the next bat does not equal the parameter bat it will return the current index
				if((cursor.getLink()==null) || !(cursor.getLink().getData().equals(bat))) {
					return currIndex;
				}
				
			}
			currIndex+=1;
			cursor = cursor.getLink();
		}
		return -1;
	}
	
	
	public BaseballBat grab(int index) {
		if(this.isEmpty()) {
			return null;
		}
		
		else {
			int count =1;
			BaseballBatNode cursor = head;
			while(cursor!=null) {
				if(count==index) {
					return cursor.getData();
				}
				count+=1;
				cursor =cursor.getLink();
			}
		}
		return null;
	}
	
	public boolean contains(BaseballBat bat) {
		if(this.isEmpty()) {
			return false;
		}
		else {
			BaseballBatNode cursor = head;
			while(cursor!=null) {
				if(cursor.getData().equals(bat)) {
					return true;
				}
				cursor = cursor.getLink();
			}
			return false;
		}
		
		
	}
	
	
	
	public String toString() {
		String ret = "Bat Name\t     Bat Length\t\tWooden\n";
		ret+= "------------------------------------------------------\n";
		BaseballBatNode cursor = head;
		while(cursor!=null) {
			ret+=cursor.getData().toString() ;
			cursor = cursor.getLink();
		}
		ret+= "------------------------------------------------------\n";
		ret+= "TOTAL BAT LENGTH =   " + this.total() + "\n";
		ret+= "AVERAGE BAT LENGTH = " + this.average() + "\n";
		ret+= "------------------------------------------------------\n";
		return ret;
	}
	

	public int countOccurrences(BaseballBat bat) {
		int ret = 0;
		BaseballBatNode cursor = head;
		while(cursor!=null) {
			if(cursor.getData().equals(bat)) {
				ret+=1;
			}
			cursor = cursor.getLink();
		}	
		return ret;
	}
	
	public int total() {
		int total = 0;
		if(this.isEmpty()) {
			return total;
		}
		
		else {
			BaseballBatNode cursor = head;
			while(cursor!=null) {
				total+=cursor.getData().getBatLength();
				cursor = cursor.getLink();
			}
			return total;
		}
	}
	
	public BaseballBat find(String key) {
		if(this.isEmpty()) {
			return null;
		}
		
		else {
			BaseballBatNode cursor = head;
			while(cursor!=null) {
				if(cursor.getData().getBatName().equals(key)) {
					return cursor.getData();
				}
			}
			return null;
		}
	}
	
	public double average() {
		double total = 0;
		double count = 1;
		if(this.isEmpty()) {
			return total;
		}
		
		else {
			BaseballBatNode cursor = head;
			while(cursor!=null) {
				
				total+=cursor.getData().getBatLength();
				
				if(cursor!=head) {
					count++;
				}
				
				cursor = cursor.getLink();
			}
			
			double avg = total/count;
			return avg;
		}
		
	}
	
	public int countRange(int low, int high) {
		
		if(this.isEmpty() || low>high) {
			return 0;
		}
		
		
		else {
			int ret = 0;
			BaseballBatNode cursor = head;
			while(cursor!=null) {
				if(cursor.getData().getBatLength()>=low && cursor.getData().getBatLength()<=high) {
					ret+=1;
				}
			}
			return ret;
		}
	}
	
	
	
	
	

	
	
	
	
	
}
