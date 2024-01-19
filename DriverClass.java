
public class DriverClass {

	public static void main(String[] args) {
		
		// Creation of my BaseballBat objects that are used in testing below
		BaseballBat bat1 = new BaseballBat("Big Slugger", 32, true);
		BaseballBat bat2 = new BaseballBat("Big Bertha", 36, false);
		BaseballBat bat3 = new BaseballBat("Old Hickory", 34, true);
		BaseballBat bat4 = new BaseballBat("Thor's Hammer", 32, true);
		BaseballBat bat5 = new BaseballBat("Boomstick", 32, true);
		
		

		
		
		LinkedBaseballBat list1 = new LinkedBaseballBat();
		
		list1.insert(bat1);
		list1.insert(bat2);
		list1.insert(bat3);
		list1.insert(bat4);
		list1.insert(bat5);
		
		System.out.println(list1.toString());
		
		
		list1.delete(bat5);
		list1.delete(bat2);
		
		System.out.println(list1.toString());
		System.out.println("list1 size is " + list1.size());
		System.out.println("It is " + list1.isEmpty() + " that list1 is empty.");
		
		
		list1.delete(bat1);
		list1.delete(bat4);
		list1.delete(bat3);
		System.out.println();
		System.out.println(list1.toString());
		System.out.println("list1 size is " + list1.size());
		System.out.println("It is " + list1.isEmpty() + " that list1 is empty.");
		
		
		list1.insert(bat1);
		list1.insert(bat1);
		list1.insert(bat1);
		list1.insert(bat5);
		list1.insert(bat2);
		list1.insert(bat3);
		list1.insert(bat4);
		
		
		System.out.println(list1.toString());
		
		System.out.println("The first index of Big Slugger is " + list1.indexOf(bat1));
		System.out.println("The last index of Big Sluggger is " + list1.lastIndexOf(bat1));
		
		System.out.println("Index 1 contains " +list1.grab(1).getBatName());
		System.out.println("Index 3 contains " + list1.grab(3).getBatName());
		
		
		System.out.println("It is " +list1.contains(bat4) + " that list1 contains Thor's Hammer");
		list1.delete(bat4);
		System.out.println("It is " +list1.contains(bat4) + " that list1 contains Thor's Hammer");
		
		
		System.out.println("list1 has " + list1.countOccurrences(bat1)+ " Big Sluggers in it");
		
		System.out.println(list1.toString());
		
		
		
		BaseballBat custom = new CustomBat("Cool Bat", 32, true, "HOMERUN");
		
		System.out.println(custom.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
