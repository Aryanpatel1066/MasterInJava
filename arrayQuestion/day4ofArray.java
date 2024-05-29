package arrayQuestion;

import java.util.Scanner;

public class day4ofArray {
    public static double averageOfArray(int arr[]){
        int sum = 0;
        double avg;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        avg = sum/arr.length;
        return avg;
    }
    public static int maxOfElement(int arr[]){
        int max = arr[1];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void searchElement(int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("find the element at index: "+i);
                break;
            }

        }
    }
    public static  void printPositiveNum (int arr[]){
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void strOddIndeces(String strArr[]){
        for(int i = 0;i<strArr.length;i++){
            if(i % 2 != 0){
                System.out.println(strArr[i]);
            }
        }

    }
    public static void leftRightBigger(int arr[]){
        for(int i =1;i<=arr.length;i++){
            if(arr[i-1]< arr[i] && arr[i]> arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean twiceElement(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                 }
            }
         }
        return false;
    }

    public static void sortedArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array element one by one");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter the key value : ");
        int key = sc.nextInt();
        //question1: calculate average of array
//        double ans = averageOfArray(arr);
//        System.out.println(ans);

        //question2: find the maximum element
//        int ans = maxOfElement(arr);
//        System.out.println(ans);

        //question3: search element from array
//         searchElement(arr,key);

         //question4: only print positive number
//        printPositiveNum(arr);

        //question5: given string or array return only odd indeces string
//        String stringOfArry[]= {"ab","bc","cc","cd","dd","ef","fg"};
//        strOddIndeces(stringOfArry);

        //question6: pick element and its bigger then left and right side
//        leftRightBigger(arr);

        //question7: element of array any one can then repet 2 time
//        boolean ans = twiceElement(arr);
//        System.out.println(ans);
        //question8: sort the element of array
        sortedArray(arr);
    }
}
