import java.util.LinkedList;

public class graph {
    private int v;
    private LinkedList<Integer>[] list;


    public graph(int v) {
        this.v = v;
        list = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new LinkedList<>();

        }
    }
    public void add(int sourse, int point) {
        list[sourse].add(point);
        list[point].add(sourse);
    }

    public void dfstest(int node, boolean[] visited) {
        visited[node] = true;
        System.out.println(node + "");
        for (int i = 0; i < list[node].size(); i++) {
            int nbr = list[node].get(i);
            if (!visited[nbr]) {
                dfstest(nbr, visited);
            }
        }
    }

    public void dfs(int start) {
        boolean[] visiter = new boolean[v];
        dfstest(start, visiter);

    }
}

