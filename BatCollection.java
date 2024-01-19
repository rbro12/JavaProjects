
public class BatCollection {
	// batArray field is used to store bats that are added to collection class
	// numOfBats field keeps track of the total number of bats in the bag
	private BaseballBat [] batArray;
	private int numOfBats;
	
	/**
	 * This constructor initalizes the batArray to the size of the given int.
	 * It also sets the numOfBats to zero
	 * @param max This parameter sets the size of the batArray
	 */
	BatCollection(int max){
		batArray = new BaseballBat[max];
		numOfBats = 0;
	}
	
	/**\
	 * This method inserts a BaseballBat into the collection Array
	 * After the bat is inserted the method sorts the array so it is in descending order of largest key to smallest key
	 * @param bat This is the bat to be inserted 
	 * @return Method returns true if a bat is properly inserted and false if the bat is not inserted
	 */
	public boolean insert(BaseballBat bat) {
		//Checks if batArray is full and if it is another bat cannot be inserted
		if(numOfBats == batArray.length) {
			
			return false;
		}
		// After a spot for the bat is confirmed this logic inserts a bat into the array
		else {
			//adds the new bat to the end of the array
			batArray[numOfBats] = bat;
			numOfBats+=1;
			//This logic shifts the array so it becomes sorted
			for(int j =1; j< numOfBats; j++) {
				
				// temporary variable that will be used in while loop
				int k = j;
				
				// If the bat at index k-1 has a smaller key than the bat at k it will return a negative 1 thus entering the while loop
				while(k>0 && (batArray[k-1].compareTo(batArray[k])<0))
				{
					// temporary BaseballBat used for swaping postions in array
					BaseballBat temp = batArray[k];
					batArray[k] = batArray[k-1];
					batArray[k-1] = temp;
					k--;
					
					
				}
			}
			return true;
		}
		
		
		
	}
	
	
	
	/**
	 * This method checks to see if the given bat is in the collection and if it is the bat is removed
	 * After the bat is removed the number of bats is updated
	 * @param bat 
	 */
	public void delete(BaseballBat bat) {
		if(this.contains(bat)) {
			
			//save temp variable of original index of bat
			int index = this.indexOf(bat);
			
			// This logic removes the desired element by swaping the places of the elements one at a time 
			// Its hard for me to describe what is exactly happening in this code with words but I can show the logic by drawing a visual represantion of the array and how it is affected with each loop
			while(index<numOfBats-1) {
				batArray[index]=batArray[index+1];
				index++;
			}
			numOfBats-=1;
		}
		
		
	}	
	
	
	/**
	 * This method shows the current amount of bats in the batCollection
	 * @return int representation of the amount of bats in the collection
	 */
	public int size() {
		return numOfBats;
	}
	
	
	/**
	 * This method returns true if there are no bats in the collection otherwise it returns false.
	 * @return A boolean represtation showing if the collection is empty or not
	 */
	public boolean isEmpty() {
		if(numOfBats == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * This method returns the first index of the first instance of the param bat found in the collection
	 * Returns -1 if the param bat is not found in collection
	 * @param bat The bat to check the collection for
	 * @return The first index that the bat is located at
	 */
	public int indexOf(BaseballBat bat) {
		for(int i = 0; i<numOfBats;i++) {
			if(bat.equals(batArray[i])) {
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * This method is used for when the same bat is in the collection more than once
	 * This method returns the last index of the param bat location
	 * @param bat The bat that you are looking for in the collection
	 * @return the last index of the param bats location 
	 */
	
	public int lastIndexOf(BaseballBat bat) {
		//loops through the whole array of bats
		for(int i = 0; i< numOfBats;) {
			
			//Checks to see if current iteration matches param bat
			if(bat.equals(batArray[i])) {
				
				//Checks to see if the next bat is still equal and returns the index of the last equal bat
				while(bat.equals(batArray[i])&& i<numOfBats-1) {
					i++;
				}
				return i;
			}
		}
		return -1;
	}
		
	
		
	/**
	 * This method takes a bat as a param and checks the whole array of bats
	 * If a single bat is found that is equal then this method returns true otherwise false
	 * @param bat This parameter is the bat that is checked for in the collections
	 * @return returns a boolean that is true if collection has param bat and false if it dosn't
	 */

	public boolean contains(BaseballBat bat) {
		for(int i = 0;i<numOfBats;i++) {
			if(batArray[i].equals(bat)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method creates a string that represents all of the elements in the collection array
	 */
	public String toString() {
		String ret = "Bat Nickname               Bat Length               Made from Wood\n------------------------------------------------------------------\n";
		for(int i = 0; i < numOfBats; i++) {
			String bat = String.format("%-26s %-24d %b\n",batArray[i].getBatName(),batArray[i].getBatLength(),batArray[i].isWooden());
			ret+=bat;
		}
	
		return ret;
	}
	
	/**
	 * This method takes a string as param and searches the collection to see if a bat's key name matches the string
	 * If the key name matches the param string then that bat is the return otherwise returns null
	 * @param str This string is compared with bat key names
	 * @return when a bat key name and param string match that bat is returned otherwise null
	 */
		public BaseballBat find(String str) {
			for(int i = 0; i < numOfBats; i++) {
				if(batArray[i].getBatName().equals(str)) {
					return batArray[i];
				}
			}
			return null;
		}
		
		/**
		 * This method counts how many bats boolean instance variables match the param boolean
		 * @param boo the boolean that a bat needs to match
		 * @return the number of bats that match the boolean variable
		 */
		public int countOccurrences(boolean boo) {
		int ret = 0;
		for(int i = 0; i<numOfBats; i++) {
			if(batArray[i].isWooden()==boo) {
				ret+=1;
			}
		}
		
		return ret;
	}
		
		
	/**
	 * This method returns the total bat length of all the bats in the collection
	 * @return returns total length of all the bats
	 */
	public int total() {
		int ret=0;
		for(int i = 0; i<numOfBats;i++) {
			ret+=batArray[i].getBatLength();
					
		}
		return ret;
	}
	
	/**
	 * Takes the total() of all the bats and finds the average length
	 *
	 * @return average length of all the bats
	 */
	public double average() {
		double ret = this.total()/numOfBats;
		return ret;
	}
	
	/**
	 * This method uses a provided range to check all the bats with
	 * If a bat's length is within the range it is added to the total number that is returned
	 * 
	 * @param low This is the low end of the range
	 * @param high This is the high end of the range
	 * @return The total number of bats that have a length that fall in the given range
	 */
	public int countRange(int low, int high) {
		int ret = 0;
		if(low>high) {
			return ret;
		}
		
		else {
			for(int i = 0; i<numOfBats;i++) {
				if(batArray[i].getBatLength()>= low && batArray[i].getBatLength()<=high) {
					ret+=1;
				} 
			}
			return ret;
		}
		
	}
	
	




	
	
	
	
	

}
