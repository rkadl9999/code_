package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_Ver2 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());

        for(int i=1; i<=TC; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A+B;

            bw.write("Case #" + i + ": " + sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
