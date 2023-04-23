package bunki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunki2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > y) {
			System.out.println("X");
		}
		else {
			System.out.println("Y");
		}

	}

}
