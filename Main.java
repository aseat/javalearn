public static void Main(String args[]){
  disp(10, 7, 8);
}

private static void disp(int... num){
  for (int i = 0; i < num.length; i++){
    System.out.println(num[i]);
  }
}
