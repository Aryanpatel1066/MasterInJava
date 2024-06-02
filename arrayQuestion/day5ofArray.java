package arrayQuestion;

import java.util.Scanner;

public class day5ofArray {
    static int targetOfSum7(int arr[],int target){
        int counter = 0;
        for(int i =0;i<(arr.length)-2;i++){
            for(int j=i+1;j<(arr.length)-1;j++){
                    if (arr[i] + arr[j]  == target) {
                        counter++;
                    }
            }
        }
        return  counter;
    }
    static int triplateOfSum(int arr[],int target){
        int counter = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j]+arr[k]==target){
                        counter ++;
                    }
                }
            }
        }
        return counter;
    }

    static int uniqueElements(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -2;
                    arr[j] = -2;
                }
            }
        }
        int ans = -2;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]!=-2){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int firstRepeated(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int secondLargestNum(int arr[]){
        int max = arr[0];
        int secondMax =Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
             }
        }

        for(int i =0;i<arr.length;i++){
            if(arr[i]>secondMax && arr[i]<max){
                secondMax= arr[i];
            }
        }
        return secondMax;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter array element");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){

             arr[i]=sc.nextInt();
        }
//        System.out.println("enter the target");
//        int target = sc.nextInt();

        //question1) the sum of target of two pair
//        int ans = targetOfSum7(arr,target);
//        System.out.println("total sum is 7 pir : "+ans);

        //question2) the sum of triplet of three pair
//        int ans2 = triplateOfSum(arr,target);
//        System.out.println("total sum of three pair is "+ans2);

        //question3) find unique element in array
//       int ans3 =  uniqueElements(arr);
//        System.out.println(ans3);

        //question4) find the second largest element from arrar
         int ans = secondLargestNum(arr);
        System.out.println(ans);
        //quesion5) find the first repeated value
//        int ans = firstRepeated(arr);
//        System.out.println(ans);
    }
}
