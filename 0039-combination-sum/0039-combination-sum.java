class Solution {
public void check(int[] can,int t,int s,List<List<Integer>> res,List<Integer> adj,int start)
{
    if(s>t) return;
    if(s==t){
        res.add(new ArrayList<>(adj));
        return;
    }

    for(int i=start;i<can.length && can[i] <= t - s;i++){
      
      adj.add(can[i]);
        check(can,t,s+can[i],res,adj,i);

      adj.remove(adj.size()-1);
           
  
    }
}
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> adj=new ArrayList<>();
        check(candidates,target,0,res,adj,0);
       // System.out.print(res);
        return res;
    }
}