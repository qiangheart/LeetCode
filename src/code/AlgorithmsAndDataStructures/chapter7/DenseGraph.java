package code.AlgorithmsAndDataStructures.chapter7;


import java.util.Vector;

//稠密图 - 邻接矩阵
public class DenseGraph {
    private int n;//节点数
    private int m;//边数
    private boolean directed;//是否为有向图
    private boolean[][] g;//图的具体数据

    public DenseGraph(int n, boolean directed){
        assert n >= 0;
        this.n = n;
        this.directed = directed;
        // g初始化为n*n的布尔矩阵, 每一个g[i][j]均为false, 表示没有任和边
        // false为boolean型变量的默认值
        g = new boolean[n][n];
    }

    public int v(){ //返回节点个数
        return n;
    }
    public int E(){ //返回边的个数
        return m;
    }

    //向图中添加一个边
    public void addEdge(int v, int w){
        assert v >= 0 && v < n ;
        assert w >= 0 && w < n ;
        if(hasEdge(v,w))
            return;
        g[v][w] = true;
        if(!directed)
            g[w][v] = true;
        m++;
    }

    // 验证图中是否有从v到w的边
    boolean hasEdge( int v , int w ){
        assert v >= 0 && v < n ;
        assert w >= 0 && w < n ;
        return g[v][w];
    }

    // 返回图中一个顶点的所有邻边
    public Iterable<Integer> adj(int v){
        assert v >= 0 && v < n;
        Vector<Integer> adjV = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            if(g[v][i])
                adjV.add(i);
        }
        return adjV;
    }

}
