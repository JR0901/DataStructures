import java.util.*;
public class GraphCreate {

	public static void main(String[] args) {
		Graph<Integer> g = new Graph<Integer>();
		
		//add edges, and if bidirectional
		//True = bidirectional/ False = Not bidirectional
		g.addEdge(0, 1, true);
		g.addEdge(0, 4, true);
		g.addEdge(1, 2, true);
		g.addEdge(1, 3, true);
		g.addEdge(1, 4, true);
		g.addEdge(2, 3, true);
		g.addEdge(4, 3, true);
		
		//Output graph
		System.out.println("Graph:\n" + g.toString());
		
		//Number of vertices in the graph
		g.getVertexCount();
		
		//Number of edges in the graph
		g.getEdgesCount(true);
		
		//Is there an edge between nodes?
		g.hasEdge(3,  4);
		
		// outputs whether vertex/node is present or not 
        g.hasVertex(5); 
		

	}

}
