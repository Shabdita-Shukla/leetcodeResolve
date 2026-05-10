package Array.medium;

import java.util.*;

public class Sum3_hashMap {
    public static void main(String args[]) {
        int nums[]={-1,0,1,2,-1,-4};
        HashSet<List<Integer>> hs=new HashSet<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int res=-nums[i]-nums[j];
                if(hm.containsKey(res) && hm.get(res)!=i && hm.get(res)!=j){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], res);
                    Collections.sort(triplet);
                    hs.add(triplet);
                }
            }
        }
        System.out.println( new ArrayList<>(hs));
    }
}
