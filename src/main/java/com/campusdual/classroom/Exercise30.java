package com.campusdual.classroom;

public class Exercise30 {

  public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException{
    if(divisor == 0){
      throw new DivisionByZeroException("Excepción personalizada");
    }else{
      return dividend / divisor;
    }
  }

  public static void main(String[] args) {
    try {
      System.out.println(divisionWithCustomException(1, 0));
    } catch (Exception e) {
      System.out.println(e);;
    }
  }
}
