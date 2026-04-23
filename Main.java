class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    java.util.List<String> vertices = new java.util.ArrayList<>();
    vertices.add("Liberal Arts");
    vertices.add("Student Services");
    vertices.add("Health Careers & Sciences");
    vertices.add("Health Technologies Center");
    vertices.add("Recreation Center");
    vertices.add("Technology Learning Center");
    vertices.add("Business & Technology");
    vertices.add("Theatre");
    // 2. Define Edges
    java.util.List<Edge> edges = new java.util.ArrayList<>();
    edges.add(new Edge(0, 7));
    edges.add(new Edge(0,1));
    edges.add(new Edge(7, 6));
    edges.add(new Edge(6, 1));
    edges.add(new Edge(1, 2));
    edges.add(new Edge(1, 5));
    edges.add(new Edge(2, 4));
    edges.add(new Edge(2, 3));
    edges.add(new Edge(2, 1));
    edges.add(new Edge(1, 4));
    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs =
    graph.dfs(graph.getIndex("Business & Technology"));
    // 5. Retrieve and print the search order of the DFS traversal
    java.util.List<Integer> searchOrderIndices = dfs.getSearchOrder();
    java.util.List<String> searchOrder = new java.util.ArrayList<>();
    for (int index : searchOrderIndices) {
      searchOrder.add(graph.getVertex(index));
    }
    System.out.println("DFS Search Order: " + searchOrder);
    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("Parent-Child Relationships:");
    for (String vertex : searchOrder) {
      int vertexIndex = graph.getIndex(vertex); // Convert String to index
      int parentIndex = dfs.getParent(vertexIndex);
      String parentName = (parentIndex == -1) ? "null" : graph.getVertex(parentIndex);
      System.out.println(vertex + " -> Parent: " + parentName);
    }

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    System.out.println("Path from Business & Technology to Recreation Center:");
    int targetIndex = graph.getIndex("Recreation Center");
    java.util.List<String> path = dfs.getPath(targetIndex);
    System.out.println(path);

    // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    System.out.println("DFS Tree:");
    dfs.printTree();
  }
}