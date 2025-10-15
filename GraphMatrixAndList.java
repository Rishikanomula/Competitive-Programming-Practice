import java.util.*;

public class GraphMatrixAndList {
    public static void main(String[] args) {
        int V = 4; 

        int[][] adjMatrix = new int[V][V];

        Map<Integer, List<Edge>> adjList = new HashMap<>();
        for (int i = 0; i < V; i++) {
            adjList.put(i, new ArrayList<>());
        }

        addEdge(adjMatrix, adjList, 0, 1, 5); // 0 → 1 with weight 5
        addEdge(adjMatrix, adjList, 0, 2, 3); 
        addEdge(adjMatrix, adjList, 1, 2, 2); 
        addEdge(adjMatrix, adjList, 2, 3, 4); 

        // Display adjacency matrix
        System.out.println("Adjacency Matrix:");
        displayMatrix(adjMatrix);

        // Display adjacency list
        System.out.println("\nAdjacency List:");
        displayList(adjList);
    }

    public static void addEdge(int[][] matrix, Map<Integer, List<Edge>> list, int from, int to, int weight) {
        matrix[from][to] = weight;
        list.get(from).add(new Edge(to, weight));
    }

    public static void displayMatrix(int[][] matrix) {
        System.out.print("  ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayList(Map<Integer, List<Edge>> adjList) {
        for (int v : adjList.keySet()) {
            System.out.print(v + ": ");
            for (Edge e : adjList.get(v)) {
                System.out.print("(" + e.to + ", " + e.weight + ") ");
            }
            System.out.println();
        }
    }

    static class Edge {
        int to;
        int weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}