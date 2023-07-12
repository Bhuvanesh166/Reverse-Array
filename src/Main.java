import java.util.Scanner;

class ArrayReverse{
    public int[] reverseArray(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args) {
        ArrayReverse arrayReverse=new ArrayReverse();
        System.out.println("Enter size of the array");
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("After reverse:");
        arrayReverse.reverseArray(arr);
        for(int i=0;i<sze;i++){
            System.out.print(arr[i]+" ");
        }
    }

}