package bunki;

import java.util.ArrayList;

public class チームラボ {

	public static void main(String[] args) {

        ArrayList<Integer> hoge = new ArrayList<>();
        hoge.add(1);
        hoge.add(0);
        hoge.add(5);
        
        for(int n = 0; n < 30; n++ ) {
        int hogehoge = hoge.get(n) + hoge.get(n + 1) + hoge.get(n + 2);
        hoge.add(hogehoge); 
        System.out.println(n + 4 +  ":" + hogehoge);
        }  
	}
}
