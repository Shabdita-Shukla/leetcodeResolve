package Array.medium;

public class ContainerWithMostWater_TwoPointer {
        public static void main(String args[]) {
            int height[]={1,8,6,2,5,4,8,3,7};
            int left=0,right=height.length-1;
            int max=0;
            while(left<right){
                int min=Math.min(height[left],height[right]);
                int r=right-left;
                max=Math.max(max,r*min);
                if(height[left]<height[right])
                    left++;
                else
                    right--;
            }
            System.out.println( max);
    }
}
