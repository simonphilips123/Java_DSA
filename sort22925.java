package Java_DSA;

public class sort22925 {

    public static void main(String[] args){

        int[] arr ={4,8,12,3,1,15,7,13};
//        bubble sort approach
//        take first element and match
//                4 8 if samll swap
        int n=arr.length;
         for(int i=0;i<n;i++){ // this is for no of passes in bubble sort
//            for(int j=0;j<n;j++){ // traverse array elements
//             for(int j=0;j<n-1;j++){ // this will traverse everytime so reduce the ith elememnt seartching
             for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         for (int no:arr){
             System.out.println(no);
         }
    }
}
