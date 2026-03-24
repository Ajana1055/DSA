class Solution {

 void check(int[] arr, List<String>res){
       String[] mp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


    Queue<String> q=new LinkedList<>();

    q.add("");


    while(!q.isEmpty()){
  
    String pre=q.poll();

    if(pre.length()==arr.length){
         res.add(pre);
    }

    else{
        int d=arr[pre.length()];
        if(d<2 || d>10) continue;


        for( char x : mp[d].toCharArray()){
            q.add(pre+x);
        }
    }

    }


 }


    public List<String> letterCombinations(String digits) {
        
  List<String> res=new ArrayList<>();
  if(digits.length()==0) return res;
  int[] num=new int[digits.length()];

  for(int i=0;i<digits.length();i++){
    num[i]=digits.charAt(i) - '0';
  }

  check(num,res);

return res;

    }
}