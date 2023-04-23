package leetCode;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int[] sums = new int[2];
        Loop:for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] != nums[j]){
                    int sum = nums[i] + nums[j];
                    if(sum == target){
                        sums[0] = i;
                        sums[1] = j;
                        break Loop;
                    }
                }
            }
        }
        return sums;
    }
}

//public int[] twoSum(int[] nums, int target){
//
//    int n = nums.length;
//    int[] result = new int[2];
//
//    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//    for(int i=0;i<n;i++){
//         if(map.containsKey(nums[i])){
//             result[0] = map.get(nums[i]);
//             result[1] = i;
//             break;
//         }
//         else{
//            map.put(target - nums[i], i);
//         }
//   }
//   
// return result;
//}