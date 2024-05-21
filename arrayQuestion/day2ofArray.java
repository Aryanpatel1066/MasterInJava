package arrayQuestion;

import java.util.Scanner;

public class day2ofArray {
//    public static  void positveNumbers(int arr[]){
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>0){
//                System.out.println(arr[i]);
//            }
//        }
//    }

//    public static void oddIndices(String str[]){
//        for(int i =0;i<str.length;i++){
//            if(i % 2 != 0){
//                System.out.println(str[i]);
//            }
//        }
//    }

//    public static void evenElement(int arr[]){
//        for(int item :arr){
//            if(item % 2 == 0){
//                System.out.println(item);
//            }
//        }
//    }

//    public static  void leftAndRightBigger(int arr[]){
//        for(int i = 1;i<=arr.length;i++){
//            if(arr[i-1] < arr[i] && arr[i]> arr[i+1]){
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//    }

    public static boolean twiceElement(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return  false;
     }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        //question1)print only positive number from array
//        int[] arr = {2,3,-5,-1,0,4,-9};
//        positveNumbers(arr);

        //question2) given array of string return odd indices string
//        String[] str = {"ab","bc","cd","de","ef","fg","gh"};
//        oddIndices(str);

        //question3) print all even number using for each loop
//        int arr[]={1,2,3,4,5,6,7,8};
//        evenElement(arr);

        //question4) pick element and its bigger then left and right side
//        int arr[]={1,1,3,4,2,3,5,7,0};
//        leftAndRightBigger(arr);

        //question4) the element any one can twice then return true;

        int arr[]={1,2,3,};
        boolean ans = twiceElement(arr);
        System.out.println(ans);
     }
}
