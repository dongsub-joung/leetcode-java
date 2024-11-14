// https://leetcode.com/problems/two-sum/description/

public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<1; i++){
            for(int j=0; j<nums.length; j++){
                if (target == nums[i] + nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
    
    public static void main(String[] args) {
        Q1 q1= new Q1();
        int[] inputed= new int[]{2,7,11,15};
        var result= q1.twoSum(inputed, 9);
        // [0,1]
        System.out.println(result);


        int[] inputed2= new int[]{3,2,4};
        var result2= q1.twoSum(inputed, 6);
        // [1,2]
        System.out.println(result2);

    }
}