class Solution {
    public int longestBeautifulSubstring(String word) {
        int l=1;
        int count=1;
        int n=word.length();
        int max_length=0;
        for(int i=0;i<n-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                l++;
            }
            else if(word.charAt(i)<word.charAt(i+1)){
                l++;
                count++;
            }
            else{
                count=1;
                l=1;
            }
            if(count==5){
                max_length=Math.max(max_length,l);
            }

        }
        return max_length;
    }
}
