package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      return extractedMethod(nodes, p);
   }

   
   Edge m2(List<Edge> nodeList, String p) {
      // TODO: Your answer
	   return extractedMethod(nodeList, p);
   }

   // TODO: Your answer
   private <T extends Graph> T extractedMethod(List<T> nodeList, String p) {
	   T myNode = null;
		for (T node : nodeList) {
			if (node.contains(p)) {
				System.out.println(node);
				myNode = node;
			}
		}
		// other implementation
		return myNode;
   }
}

class Graph {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }

}

class Node extends Graph {
}

class Edge extends Graph {
}