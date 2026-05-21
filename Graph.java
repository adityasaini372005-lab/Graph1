import java.util.*;

public class Graph{
   public static void dfs(List<List<Integer>>graph , int node,boolean visited[]){
    System.out.println(node);
    visited[node]=true;
    for(int ele : graph.get(node)){
        if(! visited[ele]){
            dfs(graph,ele,visited);
        }
    }
    }
    public static void bfs(List<List<Integer>>graph,int node){
              boolean[] visited=new  boolean[graph.size()];

              Queue<Integer> q=new LinkedList<>();
              q.add(node);
              visited[node]=true;
              while(!q.isEmpty()){
                int ele=q.poll();
                System.out.println(ele + " ");
                for(int e: graph.get(ele)){
                    if(!visited[e]){
                        q.add(e);
                        visited[e]=true;
                    }
                }
              }
    }
    public static void main(String[] args) {
        int V=4;
        List<List<Integer>>graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<> ());
        }
        graph.get(0).add(1);
         graph.get(0).add(3);
          graph.get(1).add(0);
           graph.get(1).add(2);
            graph.get(2).add(1);
             graph.get(2).add(3);
              graph.get(3).add(0);
               graph.get(3).add(2);
             //  dfs(graph,0,new boolean[V]);
               bfs(graph,0);
    }
}