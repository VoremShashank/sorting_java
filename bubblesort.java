

public class bubblesort{
    public static void bsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
       
    }
    public static void main(String[] args) {
        int arr[]={0,-6,3,5,-1};
        bsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         
           }
       
    }
}