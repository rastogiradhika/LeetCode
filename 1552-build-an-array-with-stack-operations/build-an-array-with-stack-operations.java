class Solution {
    public List<String> buildArray(int[] target, int n) {
        
   List<String> ans= new ArrayList<>();
   Stack<Integer> stack = new Stack<>();
   int i=0;
   for( int nums=1 ;nums<=n && i<target.length; nums++){
    stack.push(nums);
    ans.add("Push");
    if(stack.peek() != target[i]){
        stack.pop();
        ans.add("Pop");
    }
    else{
        i++;
    }
   }
   return ans;

    }
}