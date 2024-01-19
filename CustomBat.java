
public class CustomBat extends BaseballBat{
	
	private String engraving;
	
	
	public CustomBat(String name, int length, boolean wood, String engrave) {
		super(name, length, wood);
		engraving = engrave;
	}
	
	
	public void setEngraving(String engrave){
		engraving = engrave;
	}
	
	
	public String getEngraving() {
		String ret = engraving;
		return ret;
	}
	
	public String toString() {
		String ret = super.getBatName() + "\t" + super.getBatLength() + "\t" + super.isWooden() + "\t" + this.getEngraving();
		return ret;
	}
	
	
	
	

}
  