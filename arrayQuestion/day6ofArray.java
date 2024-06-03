package arrayQuestion;

import java.util.Scanner;

public class day6ofArray {
    static String  exactDifferent(int arr[],int x){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]-arr[i] == x){
                    return "yes";
                }
            }
        }
        return "No";
    }
    static int totoalOccurance(int arr[],int x){
        int counter = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
    static int missingPair(int arr[]){
        int ans=0 ;
        for(int i =1;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++) {
                if (arr[i] != arr[j]) {
                    ans = i;
                }
            }
        }
        return ans;
    }
    static boolean equalityOfArray(int arr1[],int arr2[]){

        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array: ");
//        int size = sc.nextInt();
//        System.out.println("enter the array element: ");
//        int arr[]=new int[size-1];
//        for(int i =0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }

        //question1) find the exact different of the size of array
//        System.out.print("x=");
//        int x = sc.nextInt();
//        String ans = exactDifferent(arr,x);
//        System.out.println(ans);

        //question2) find the number of total occurance
//        System.out.print("x= ");
//        int x = sc.nextInt();
//        int ans  = totoalOccurance(arr,size);
//        System.out.println(ans);

        //question3)
//        int ans = missingPair(arr);
//        System.out.println(ans);

        //question4) find the equality of two  array
//        int arr1[] = {10,20,30};
//        int arr2[] = {10,20,30};
//        boolean ans = equalityOfArray(arr1,arr2);
//        System.out.println(ans);

        //question5)
    }
}
