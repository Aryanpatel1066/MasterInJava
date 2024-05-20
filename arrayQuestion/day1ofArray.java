package arrayQuestion;
import java.util.Scanner;
public class day1ofArray {
//    public static void findAvg(int[] arr, int size){
//        Scanner sc = new Scanner(System.in);
//                int sum = 0;
//        double avg = 0;
//       System.out.println("enter array element: ");
//       for(int i=0;i<size;i++){
//           arr[i]=sc.nextInt();
//       }
//       System.out.println("calculate average:");
//       for(int i =0;i<size;i++){
//           sum = sum + arr[i];
//
//       }
//       avg=sum/size;
//       System.out.println(avg);
//
//    }
   public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
//       System.out.println("enter the size of array: ");
//       int size = sc.nextInt();
//       int arr []=new int[size];
//
//       System.out.println("enter array element: ");
//        for(int i=0;i<size;i++){
//            arr[i]=sc.nextInt();
//       }
//       System.out.println("the array element is: ");
//        for(int i=0;i<size;i++){
//            System.out.print(arr[i]);
//        }

       //question1) take a array from user input and calculate average
//
//       System.out.println("enter the size of array: ");
//       int size = sc.nextInt();
//       int arr[]=new int[size];
//       findAvg(arr,size);

       //queston2) take a array from user input and find maximum element

       System.out.println("enter the size of array");
       int size = sc.nextInt();
       int arr[] = new int[size];
       int maximum = arr[0];
       System.out.println("enter "+size+"element");
       for(int i =0;i<size;i++){
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<size;i++){
           if(arr[i]>arr[i++]){
               System.out.println(arr[i]);
           }
        else{

           }
       }
       System.out.println(maximum);
   }
}
