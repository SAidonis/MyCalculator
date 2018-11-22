import java.util.Scanner;

public class MyCalculator {

  private static double add(double num1, double num2){
    return num1+num2;
  }
  private static double sub(double num1, double num2){
    return num1-num2;
  }
  private static double div(double num1, double num2){
    return num1/num2;
  }
  private static double mult(double num1, double num2){
    return num1*num2;
  }

  private static double enterDouble(){
   Scanner scan = new Scanner (System.in);
   double num;
   while(true){
     try{
       num = scan.nextDouble();
       break;
     } catch (Exception e) {
       String str = scan.nextLine();
       System.out.println(str + " is not a number!");
     }
   }
   return num;
 }

    public static void main(String[] args){

    }
}
