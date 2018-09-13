public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }
  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }
  public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
  }
  /* "stack" is the object reference to an object
  of CharStack. "current" is the current the character
  in the input string and it represents an operator */


  /* public boolean contains(T){

  }
  */

  while (!stack.isEmpty() &&
    precedenceOrder(stack.peek()) >= precedenceOrder(current)){
    System.out.print(stack.pop());
  }
  stack.push(current);


