package arrayQuestion;

import java.util.Scanner;

public class day3ofArray {
    public static int  counterElement(int arr[],int key){
             int counter = 0;
             for(int i = 0;i<arr.length;i++){
                 if(arr[i]==key){
                     counter++;
                 }
             }
             return counter;
    }

    public static int lastOcuurence(int arr[],int key){
        //step1: traverse array
        int index = -1;
        for(int i =0;i<arr.length;i++) {
            //step2: check wheathe is present or not
            if (arr[i] == key) {
                index = i;
            }

        }
        return index;
    }

    public static boolean isSorted(int arr[]){
        boolean sorted = true;
        for(int i = 1;i<arr.length;i++){

                if(arr[i]<arr[i-1]){
                    sorted=false;
                    break;
                }

        }
        return sorted;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //taking size of array from user
        System.out.println("enter array size: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        //taking array element from user
        System.out.println("enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //taking keyValue for search in array
        System.out.println("enter key value ");
        int key = sc.nextInt();

        //question1 : find the given element how many time present in array
//           int ans = counterElement(arr,key);
//        System.out.println(key + " is present in array total "+ans +" time");

        //question2 : find the last occurrence of element in array
//        int ans  = lastOcuurence(arr,key);
//        System.out.println(key +" is lastoccurrence is "+ans);

        //question3: weather an array is sorted or not(ascending or descending anything )
        boolean ans = isSorted(arr);
        System.out.println(ans + "is sorted");
    }
}
