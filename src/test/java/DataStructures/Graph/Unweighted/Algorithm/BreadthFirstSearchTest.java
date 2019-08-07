package DataStructures.Graph.Unweighted.Algorithm;

import DataStructures.Graph.Unweighted.Graph;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BreadthFirstSearchTest {

    @Test
    public void run() {
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Graph graph = new Graph();
        graph.addVertex("A"); // 0 (исходная вершина)
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3
        graph.addVertex("E"); // 4
        graph.addEdge(0, 1); // AB
        graph.addEdge(1, 2); // BC
        graph.addEdge(0, 3); // AD
        graph.addEdge(3, 4); // DE
        new BreadthFirstSearch(graph).bfs();
        assertThat(outputStream.toString().trim(), is("ABDCE"));
    }
}