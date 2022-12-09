package com.pulando;

// 19	- Help the frog to find a way to freedom

  public class FrogJumping {

    public static int solution(int[] a) {
      int total = 0;
      for (int i : a ){
        if(i != i+1){
          total += 1;
        }
      }
      return total;
    }
}
