package firstIS;
import java.util.ArrayList;


public class NodeDetail {
	String name;
	ArrayList<Integer> nodeState;
	NodeDetail parent;
	int dist;
	String move;
	public int priority;
	public NodeDetail(String name){
		this.name = name;
	}
	
	public NodeDetail(){
		
	}
	
	
	public String getName(){
		return this.name;
	}
}