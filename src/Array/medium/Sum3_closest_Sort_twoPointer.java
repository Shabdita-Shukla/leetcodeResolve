package Array.medium;

import java.util.*;

public class Sum3_closest_Sort_twoPointer {
    public static void main(String args[]) {
        int nums[]={-1,2,1,-4};
        int target=1;
        int sum=0;
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-closest))
                    closest=sum;
                if(sum<target)
                    left++;
                else if(sum>target)
                    right--;
                else {
                    System.out.println(sum);
                    return;
                }
            }
        }
        System.out.println( closest);
    }
}
