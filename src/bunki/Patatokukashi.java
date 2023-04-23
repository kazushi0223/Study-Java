package bunki;

import java.util.*;

public class Patatokukashi {
    public static void main(String[] args) throws Exception {
        
        List<String> list = Arrays.asList("パタトクカシーー".split(""));

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            if(i%2 == 0){
                sb.append(list.get(i));
            }
        }
        System.out.println(sb.toString());
    }
}
