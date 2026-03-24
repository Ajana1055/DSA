class Solution {
  boolean check(String s,Stack<Character> st,char i){
    if(st.empty()) return false;
    if(st.peek()=='(' && i==')'){
        st.pop();
        return true;
    }
    else if(st.peek()=='{' && i=='}'){
        st.pop();
        return true;
    }
    else if(st.peek()=='[' && i==']'){
        st.pop();
        return true;
    }
   else return false;
  }

    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            st.push(s.charAt(i));
            else{
                if(!check(s,st,s.charAt(i))) return false;
            }
        }
     if(st.size()>=1) return false;
        return true;
        
    }
}