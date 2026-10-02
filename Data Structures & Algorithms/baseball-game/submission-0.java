class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        for(String operation : operations){
            if(operation.equals("+")){
                stack.push(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
            }else if(operation.equals("D")){
                stack.push(stack.get(stack.size() - 1) * 2);
            }else if(operation.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(operation));
            }
        }
        for(int num : stack){
            score += num;
        }
        return score;
    }
}