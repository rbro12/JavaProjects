
public class BaseballBat {
	private String batName;
	private int batLength;
	private boolean isWooden;
	
	
	
	/**
	 * Constructor for baseballBat class
	 * @param name Brand name for the bat
	 * @param length Length of the bat
	 * @param wood determines if the bat is wooden or not
	 */
	public BaseballBat (String name, int length, boolean wood){
		batName = name;
		batLength = length;
		isWooden = wood;
		
	}
	
	// Returns the brand name of the bat
	public String getBatName() {
		return batName;
	}
	
	// Returns the length of the bat
	public int getBatLength() {
		return batLength;
	}
	
	
	// Returns a boolean that is true if the bat is wooden
	public boolean isWooden() {
		return isWooden;
	}
	
	
	// Sets the brand name of the bat
	public void setBatName(String name) {
		batName = name;
	}
	
	
	//Sets the length of the bat
	public void setBatLength( int length) {
		batLength = length;
	} 
	
	//Changes the bat from wood to non-wood or vice versa
	public void setWooden(boolean wood) {
		isWooden = wood;
	}
	
	public String toString() {
		
		
		String ret = String.format("%-20s %-18d %b\n",this.getBatName(),this.getBatLength(),this.isWooden());
		return ret;
		
	}
	
	
	// This method checks between to bats to see if the name is the same. If the name is the same this function returns true
	public boolean equals(BaseballBat otherBat) {
		if((this.getBatName().equalsIgnoreCase(otherBat.getBatName()))) {
			return true;
		}
		
		else{
			return false;
		}
		
	}
		
	public int compareTo(BaseballBat otherBat) {
		int len;
		if(this.batName.length()>otherBat.batName.length()) {
			 len = otherBat.batName.length();
		}
		
		else {
			len = otherBat.batName.length();
		}
		
		String thisBat = this.getBatName().toLowerCase();
		String compareBat = otherBat.getBatName().toLowerCase();
		
		for(int i = 0; i< len; i++) {
			if(thisBat.charAt(i)>compareBat.charAt(i)) {
				return 1;
			}
			else if (compareBat.charAt(i)>thisBat.charAt(i)) {
				return -1;
			}
		}
		
		return 0;
	}
	}

	
	
	


	


