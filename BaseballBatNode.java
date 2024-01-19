
public class BaseballBatNode {
	private BaseballBat data;
	private BaseballBatNode link;
	
	public BaseballBatNode(BaseballBat bat, BaseballBatNode batNode) {
		data = bat;
		link = batNode;
	}
	
	public BaseballBat getData() {
		return data;
	}
	
	public BaseballBatNode	getLink() {
		return link;
	}
	
	public void setData(BaseballBat bat) {
		data = bat;
	}
	
	public void setLink(BaseballBatNode node) {
		link = node;
	}

}
