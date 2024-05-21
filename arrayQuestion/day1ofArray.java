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

    public static  void searchElement(int arr[],int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("the element "+key+" is present at index no: "+i);
                break;
            }
        }
    }
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

//       System.out.println("enter the size of array");
//       int size = sc.nextInt();
//       int arr[] = new int[size];
//       int max = arr[0];
//        System.out.println("enter "+size+"element");
//       for(int i =0;i<size;i++){
//           arr[i]=sc.nextInt();
//       }
//       for(int i=0;i<size;i++) {
//           if(arr[i]>max){
//               max=arr[i];
//           }
//        }
//       System.out.println(max);
//

//question3) write a program for search element in array
       int arr[]=new int[5];
       int key ;
       System.out.println("enter the array element size is 5 :");
       for(int i = 0; i<arr.length;i++){
          arr[i]=sc.nextInt();
       }
       System.out.println("enter a key value to find wheather element is present or not: ");
       key=sc.nextInt();
       searchElement(arr,key);
    }
}
