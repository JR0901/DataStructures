import java.util.*;

public class Graph<T> {
	//Use a hash map to store the edges
	private Map<T, List<T> > map = new HashMap<>();
	
	//add new vertex too graph
	public void addVertex (T s) {
		map.put(s,  new LinkedList<T>());
	}
	
	//Add edge between 2 nodes
	public void addEdge(T source, T destination, boolean bidirectional) {
		if (!map.containsKey(source)) {
			addVertex(source);
		}
		
		if (!map.containsKey(destination)) {
			addVertex(destination);
		}
		
		map.get(source).add(destination);
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
	}
	
	//This function gives the count of vertices
	public void getVertexCount() {
		System.out.println(map.keySet().size() + " verticies");
	}
	
	//Number of edges
	public void getEdgesCount(boolean bidirection) {
		int count = 0;
		for (T v: map.keySet()) {
			count += map.get(v).size();
		}
		if (bidirection == true) {
			count = count/2;
		}
		System.out.println(count + " edges");
	}
	
	//Checks if it has any vertices/nodes
	public void hasVertex(T s) {
		if (map.containsKey(s)) {
			System.out.println(s + " verticies");
		}
		
		else {
			System.out.println("No verticies");
		}
	}
	
	//Checks for edges
	public void hasEdge (T s, T d) {
		if (map.get(s).contains(d)) {
			System.out.println("Edge present between"+s+" and "+d);
		}
		else {
			System.out.println("No edge present between\"+s+\" and \"+d");
		}
	}
	
	//Outputs the adjacency list of each vertex
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for (T v:map.keySet()) {
			builder.append(v.toString() + ": ");
			for (T w : map.get(v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}
		
		return (builder.toString());
	}
}
