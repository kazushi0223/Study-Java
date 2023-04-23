package bunki;

import java.math.BigDecimal;

public class チームラボ2 {

	public static void main(String[] args) {
        
		//1の4乗、2の4乗、・・・100の4乗までの総和
		double hoge = 0;
        for(int n = 1; n < 101; n++ ) {
        System.out.print(n + "  :  ");
        System.out.print(Math.pow(n, 4) + "  :  ");
        hoge = hoge + Math.pow(n, 4);
        System.out.println(BigDecimal.valueOf(hoge).toPlainString());
        }
	}
		
}
