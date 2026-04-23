public class challenge1{
    public static void main(String[] args){
        String[] vertices = {"Song A", "Song B", "Song C", "Song D", "Song E"};
        int[][] edges = {{0,1},{0,2},{0,3},{0,4},{1,0},{1,2},{1,3},{1,4},{2,0},{2,1},{2,3},{2,4},{3,0},
        {3,1},{3,2},{3,4},
        {4,0},{4,1},{4,2},{4,3}};
        Graph<String> graph = new UnweightedGraph<>(vertices, edges);
      //  graph.printGraph();
        System.out.println("Graph size: " + graph.getSize());
        System.out.println("Vertex at index 2: " + graph.getVertex(2));
        System.out.println("Index of 'Song D': " + graph.getIndex("Song D"));
        graph.printEdges();
        UnweightedGraph<String>.SearchTree bfs = graph.bfs(graph.getIndex("Song A"));
        java.util.List<Integer>searchOrders = bfs.getSearchOrder();
        System.out.println(bfs.getNumberOfVerticesFound()+"vertices are searched in the BFS order: ");
        for(int i=0;i<searchOrders.size();i++){
            System.out.print(graph.getVertex(searchOrders.get(i))+" ");
        }
        System.out.print("\n");
        for(int i=0;i<searchOrders.size();i++){
            if(bfs.getParent(i)!=-1){
                System.out.println("Parent of "+graph.getVertex(i)+" is "+graph.getVertex(bfs.getParent(i)));
            }
        }

    }
}