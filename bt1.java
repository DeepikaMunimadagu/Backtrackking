public class Classroom{
    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            PrintArray(arr);
            return;
        }
        //recursion (kaam)
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;  //backtracking step
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
    }
}
