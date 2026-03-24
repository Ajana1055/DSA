class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];

        int min =Math.min(f.length(),l.length());

        StringBuilder st=new StringBuilder();
        for(int i=0;i<min;i++){
            if(f.charAt(i)==l.charAt(i)) st.append(f.charAt(i));
            else break;
        }


        return st.toString();
    
    }
}