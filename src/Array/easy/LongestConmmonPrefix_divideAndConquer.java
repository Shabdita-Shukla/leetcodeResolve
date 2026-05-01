package Array.easy;

public class LongestConmmonPrefix_divideAndConquer {
    public static void main(String args[]) {
        String[] strs = {"flower", "flow", "flight"};
            System.out.println( commonPrefix(strs, 0, strs.length - 1));
        }

    static String commonPrefix(String[] strs, int l, int r){
        if(l==r)
            return strs[l];
        while(l<r){
            int mid= l+(r-l)/2;
            String s1= commonPrefix(strs,l,mid);
            String s2= commonPrefix(strs,mid+1,r);
            return commonpPrefixUtil(s1,s2);
        }
        return "";
    }

    static String commonpPrefixUtil(String s1,String s2){
        StringBuilder sb=new StringBuilder();
        int n1=s1.length();
        int n2=s2.length();
        for(int i =0;i<n1 && i<n2;i++){
            if(s1.charAt(i)!=s2.charAt(i))
                break;
            sb.append(s1.charAt(i));
        }
        return sb.toString();

    }

}