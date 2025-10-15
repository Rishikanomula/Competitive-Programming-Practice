import java.util.*;

public class DirectedGraphWithLetters {
    // Add a directed edge from 'from' to 'to'
    public static void addEdge(Map<Character, List<Character>> adj, char from, char to) {
        adj.get(from).add(to);
    }

    // Display the adjacency list
    public static void displayAdjList(Map<Character, List<Character>> adj) {
        for (char vertex : adj.keySet()) {
            System.out.print(vertex + ": ");
            for (char neighbor : adj.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Define vertices
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F'};

        // Initialize adjacency list
        Map<Character, List<Character>> adj = new HashMap<>();
        for (char v : vertices) {
            adj.put(v, new ArrayList<>());
        }

        // Add directed edges
        addEdge(adj, 'A', 'B');
        addEdge(adj, 'A', 'C');
        addEdge(adj, 'B', 'C');
        addEdge(adj, 'C', 'D');
        addEdge(adj, 'C', 'E');
        addEdge(adj, 'C', 'F');
        addEdge(adj, 'E', 'F');
        addEdge(adj, 'F', 'D');

        // Display the graph
        System.out.println("Adjacency List Representation:");
        displayAdjList(adj);
    }
}