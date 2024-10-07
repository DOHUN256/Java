import java.util.Random;

public class ArrayTest1 {
   
   public static void main(String args[]) {      
      ArrayTest1 obj = new ArrayTest1();
      //obj.ex01();
      //int arr[][] = new int[3][4];
      //obj.ex02(arr);
      obj.ex03();
      
   }
   
   public void ex01() {
      
      //1. 1~100까지의 수 중 5의 배수이면서 3의 배수가 아닌 수를
      //찾으면 1차원 배열에 저장하여 전체 합과 해당 값을 출력하시오.

      int arr[] = new int[100];
      int arrIndex = 0;
      for (int i = 1; i <= 100; i++) {
         if ((i % 5 == 0) && (i % 3 != 0)) {
            arr[arrIndex++] = i;
         }
      }
      
      int sum = 0;
      for (int i = 0; i < arrIndex; i++) {
         System.out.print(arr[i] + ", ");
         sum = sum + arr[i];
      }
      System.out.print(" 합은: " + sum);
      
   }
   
   public void ex02(int arr[][]) {
      
      //2. 0~100까지의 정수 난수를 생성하여 4 x 3 배열을 채우고 출력하시오.
      // 난수 처리 : Random rnd = new Random(); int n = rnd.nextInt();
      Random rnd = new Random();
      
      for (int j = 0; j < 3; j++) {
         for (int i = 0; i < 4; i++) {
            arr[j][i] = Math.abs(rnd.nextInt() % 101);
         }         
      }   
      
      for (int j = 0; j < 3; j++) {
         for (int i = 0; i < 4; i++) {
            System.out.print(arr[j][i] + ", ");            
         }         
         System.out.println();
      }      
   }
   
   public void ex03() {
      
      // 2번 배열의 각 행의 평균을 구하고, 전체 최대값을 구하시오.
      int arr1[][] = new int[3][4];
      ArrayTest1 obj1 = new ArrayTest1();
      obj1.ex02(arr1);
      
      double avg[] = new double[3];
      int sum[] = new int[3];
      int max = 0;

      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 4; j++) {
            sum[i] += arr1[i][j];
            if (arr1[i][j] > max)
               max = arr1[i][j];
         }
         avg[i] = sum[i] / 4.0;
      }
      
      for (int i = 0; i < 3; i++)
         System.out.println(i + "행의 평균은: " + avg[i]);
      System.out.println("배열의 최대값은 " + max);
      
   }

}