package arrayQuestion;

import java.util.Scanner;

public class day7ofArray {
    static int[] reverseAnArray(int arr[]){
        int n = arr.length;
        int arr1 []= new int[n];
        int j =0;
        for(int i = n-1;i>=0;i--){
            arr1[j++]=arr[i];
        }
        return arr1;
    }
    static void reverseInPlaceArr(int arr[]){
        int n = arr.length;
        int i =0,j= arr.length-1;
        int temp;
        for(int k = 0;k<arr.length;k++){
            if(i<j){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
              }
        }

           }
    public static void main (String args[]){
        // swap the value without temp
//        int a = 2;
//        int b = 3;
//         a = a +b;//5
//         b= a-b;//1
//         a=a-b;
//        System.out.println("a : "+a);
//        System.out.println("b : "+b);
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array element: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //question1) reverse the array
//        int ans[]= reverseAnArray(arr);
//        for(int i =0;i<ans.length;i++){
//            System.out.println(ans[i]);
//        }
        //quesion2) reverse array in same
        reverseInPlaceArr(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
}
