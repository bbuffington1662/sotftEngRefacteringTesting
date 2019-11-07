package q1.extract_method.org;

import java.util.List;

public class A {
	Node m1(List<Node> nodes, String p) {
		Node myNode = null;
		for (Node node : nodes) {
			if (node.contains(p)) {
				System.out.println(node);
				myNode = node;
			}
		}
		// other implementation
		return myNode;
	}

	Edge m2(List<Edge> edgeList, String p) {
		Edge myEdge = null;
		for (Edge edge : edgeList) {
			if (edge.contains(p)) {
				System.out.println(edge);
				myEdge = edge;
			}
		}
		// other implementation
		return myEdge;
	}

}

class Node {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Edge {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}