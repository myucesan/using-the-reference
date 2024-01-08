import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MainTest {

    @Test
    public void testGraph1() {
        Graph g1 = UsingWhatYouGet.graph1();
        Assertions.assertEquals(5, g1.getNodes().size());
        Assertions.assertEquals(7, MaxFlow.maximizeFlow(g1));
    }

    @Test
    public void testGraph2() {
        int n = 10;
        int[][] edges = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                edges[i][j] = Math.max(0, j * j - i * i + 4 * i * j + 7 - 9 * i - 3 * j);
            }
        }
        Graph g1 = UsingWhatYouGet.graph2(n, edges);
        Assertions.assertEquals(10, g1.getNodes().size());
        Assertions.assertEquals(411, MaxFlow.maximizeFlow(g1));
    }
}
