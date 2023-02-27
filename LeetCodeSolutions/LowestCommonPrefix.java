class Solution {
    public String longestCommonPrefix(String[] strs) {
     String demo = "";
     int number = findMax(strs);
     for(int i = 0; i < number;i++){
         boolean flag = true;
         for(int j = 0;j<strs.length-1;j++ ){
             if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                 flag = false;
             }
         }
         if(flag){
                 demo += strs[0].charAt(i);
             }
             else{
                 return demo;
             }
     } 
     return demo;
    }
    public int findMax(String[] strs){
        int min = strs[0].length();
        for(int i = 0;i<strs.length;i++){
            if(strs[i].length()<= min){
                min = strs[i].length();
            }
        }
        return min;
    }
}