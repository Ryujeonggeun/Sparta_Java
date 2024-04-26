import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str;

        while (true) {
           str = br.readLine();
            if (str != null || str.equals("\n\r")) {
                st = new StringTokenizer(str);
                int number = Integer.parseInt(st.nextToken());
                int number2 = Integer.parseInt(st.nextToken());

                bw.write(number + number2 + "\n");
                bw.flush();  // write 버퍼안에 한번에 값을 빼냄
            } else {
                bw.close(); // write 버퍼안에 값을 한번에 빼내고 끝내버림
                break;
            }






        }


    }
}
