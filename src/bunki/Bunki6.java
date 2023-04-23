package bunki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunki6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt(br.readLine());
		String str = "";
		str = (x % 2 == 1 || x % 2 == -1 ) ? "奇数" : "偶数";
		if(x >= 0) {
			System.out.println("正の" + str);
		}
		else {
			System.out.println("負の" + str);
		}
	}
}
