public class Main {
    public static void main(String[]args){
        Graph g=new Graph(6);
        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 3);
        g.add(1, 4);
        g.add(2, 5);
        System.out.println("dfs:");
        g.dfs(0);


        }
    }

