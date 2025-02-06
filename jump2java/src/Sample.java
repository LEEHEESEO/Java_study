import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader BR = new BufferedReader(new FileReader("out.txt"));
        while(true){
            String n = BR.readLine(); //readLine()은 읽기 모드로 열린 파일을 줄 단위로 읽는 메서드
            if (n == null) break; //readLine()은 더 이상 읽을 줄이 없으면 null을 리턴, 다 읽었으면 break().
            else System.out.println(n);
        }
        BR.close();
    }
}