package bunki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunki8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if((x >= 60 && x >= 80) || (x + y >= 130) || (x + y >= 100 || (x >= 90 || y >= 90))) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
		
	}

}
