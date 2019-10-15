package firstIS;

import java.util.Comparator;


public class CompareNode implements Comparator<NodeDetail> {

	@Override
	public int compare(NodeDetail node1, NodeDetail node2) {
		// method stub
		if (node1.priority > node2.priority){
			return 1;
		}
		if (node1.priority < node2.priority){
			return -1;
		}
		return 0;
	}

	

}