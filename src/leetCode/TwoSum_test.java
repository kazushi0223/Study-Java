package leetCode;

public class TwoSum_test {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum hoge = new TwoSum();
        for(int i = 0; i < 2; i++ )
            System.out.print(hoge.twoSum(nums,target)[i]);
        
    }

}
