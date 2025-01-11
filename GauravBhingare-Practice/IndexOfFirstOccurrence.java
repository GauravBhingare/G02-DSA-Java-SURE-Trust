public class IndexOfFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        int needleIndex = 0,ans=0;
        if(haystack.contains(needle)) {
            ans=haystack.indexOf(needle);
        }else{
            ans=-1;
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        strStr(haystack,needle);
    }
}
