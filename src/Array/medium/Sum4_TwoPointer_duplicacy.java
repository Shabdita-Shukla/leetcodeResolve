package Array.medium;

import java.util.*;

public class Sum4_TwoPointer_duplicacy {
    public static void main(String args[]) {
        int nums[]={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> list=new ArrayList<>();
        if(nums==null || nums.length<4 ) {
            System.out.println(list);
            return;
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])//check duplicacy
                continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])
                    continue;
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }
                    else if(sum<target)
                        left++;
                    else
                        right--;
                }
            }
        }
        System.out.println( list);
    }
}
