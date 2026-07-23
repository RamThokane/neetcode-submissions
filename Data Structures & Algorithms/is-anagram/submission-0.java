class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[]r=s.toCharArray();
        char[]a=t.toCharArray();

        Arrays.sort(r);
        Arrays.sort(a);

        return Arrays.equals(r,a);




    }
    
}
