package firstIS;

import java.util.ArrayList;

public class MovePosition {
	public NodeDetail Right(NodeDetail nodeTrack) {
		// method stub
		int space = nodeTrack.nodeState.indexOf(0);
		ArrayList<Integer> childState;
		int temp;
		NodeDetail childNode = new NodeDetail();

		if (space != 2 && space != 5 && space != 8) {
			childState = (ArrayList<Integer>) nodeTrack.nodeState.clone();
			temp = childState.get(space + 1);
			childState.set(space + 1, 0);
			childState.set(space, temp);
			childNode.nodeState = childState;
			childNode.parent = nodeTrack;
			childNode.dist = nodeTrack.dist + 1;
			childNode.move = "RIGHT";
			return childNode;
		} else {
			return null;
		}
	}

	public NodeDetail Left(NodeDetail nodeTrack) {
		//method stub
		int space = nodeTrack.nodeState.indexOf(0);
		ArrayList<Integer> childState;
		int temp;
		NodeDetail childNode = new NodeDetail();

		if (space != 0 && space != 3 && space != 6) {
			childState = (ArrayList<Integer>) nodeTrack.nodeState.clone();
			temp = childState.get(space - 1);
			childState.set(space - 1, 0);
			childState.set(space, temp);
			childNode.nodeState = childState;
			childNode.parent = nodeTrack;
			childNode.dist = nodeTrack.dist + 1;
			childNode.move = "LEFT";
			return childNode;
		} else {
			return null;
		}
	}

	public NodeDetail Down(NodeDetail nodeTrack) {
		//method stub
		int space = nodeTrack.nodeState.indexOf(0);
		ArrayList<Integer> childState;
		int temp;
		NodeDetail childNode = new NodeDetail();

		if (space <= 5) {
			childState = (ArrayList<Integer>) nodeTrack.nodeState.clone();
			temp = childState.get(space + 3);
			childState.set(space + 3, 0);
			childState.set(space, temp);
			childNode.nodeState = childState;
			childNode.parent = nodeTrack;
			childNode.dist = nodeTrack.dist + 1;
			childNode.move = "DOWN";
			return childNode;
		} else {
			return null;
		}
	}

	public NodeDetail Up(NodeDetail node) {
		//method stub
		int space = node.nodeState.indexOf(0);
		ArrayList<Integer> childState;
		int temp;
		NodeDetail childNode = new NodeDetail();

		if (space > 2) {
			childState = (ArrayList<Integer>) node.nodeState.clone();
			temp = childState.get(space - 3);
			childState.set(space - 3, 0);
			childState.set(space, temp);
			childNode.nodeState = childState;
			childNode.parent = node;
			childNode.dist = node.dist + 1;
			childNode.move = "UP";
			return childNode;
		} else {
			return null;
		}
	}

}
