package binarySearch;

//コピペしたプログラム
//public class binarySearch {
//    public static boolean execute(int[] data, int target) {
//        int low = 0;
//        int high = data.length - 1;
//        while (low <= high) {
//            int middle = (low + high) / 2;
//            System.out.println(middle);
//            if (data[middle] == target) {
//                return true;
//            } else if (data[middle] < target) {
//                low = middle + 1;
//            } else {
//                high = middle - 1;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] data = {23, 25, 53, 444, 5466, 12646};
//        boolean result;
//        
//        result = binarySearch.execute(data, 25);
//        if (result){
//            System.out.println("Found!");
//        }
//        else {
//            System.out.println("Not Found.");
//        }
//    }
//
//}

// コピペしたプログラムだと配列の何番目にtargetが存在していたのかわからないので、
// targetが存在していたindexを返すように修正。
public class binarySearch{
    public static int execute(int[] data,int target) {
        int notFound = -1; 
        int low = 0;
        int high = data.length - 1;
        while(low <= high) {
            int middle = (low + high) / 2;
            if(data[middle] == target) {
                return middle;
            }else if(data[middle] < target) {
                low = middle + 1;
            }else {
                high = middle - 1;
            }            
        }
        return notFound;
        
    }
    public static void main (String[] args ) {
        int[] data = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int result = binarySearch.execute(data, target);
        
        if(result != -1) {
            System.out.println("target data found, index number is " + "「" + result + "」");
        }else {
            System.out.println("target data not found");
        }           
    }
}