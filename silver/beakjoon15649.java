import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon15649 {
    private static StringBuilder sb = new StringBuilder();
    private static int[] res;
    private static boolean[] visited;

    private static final char NEW_LINE = '\n';
    private static final char SPACE = ' ';

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        res = new int[N];
        visited = new boolean[N];

        dfs(N, M, 0);
        System.out.print(sb);
    }

    private static void dfs(int n, int m, int depth) {
        if(depth == m) {
            for(int i = 0; i < m; i++) {
                sb.append(res[i]).append(SPACE);
            }
            sb.append(NEW_LINE);

            return;
        }

        for(int i = 0; i < n; i++) {
            if(visited[i]) continue;
            visited[i] = true;

            res[depth] = i + 1;
            dfs(n, m, depth + 1);
            visited[i] = false;
        }
    }
}
