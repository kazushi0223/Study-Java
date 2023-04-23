package bunki;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(",");
        scanner.close();
        ArrayList<String> list2 = new ArrayList<>();
        
        
        for (int i = 1; i < list.length; i++) {
            if ((i % 2 == 1) || list[i].equals(list[i - 1])) {
                list2.add(list[i]);
            }
        }
        String list3 = String.join(",", list2);
        System.out.print(list3);
    }
}
