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
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter array element");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();

        //question1) the sum of target of two pair
//        int ans = targetOfSum7(arr,target);
//        System.out.println("total sum is 7 pir : "+ans);

        //question2) the sum of triplet of three pair
        int ans2 = triplateOfSum(arr,target);
        System.out.println("total sum of three pair is "+ans2);

    }
}
