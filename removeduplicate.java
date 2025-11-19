package Java_DSA;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,5,5,6,7};
        int n=arr.length;
        for (int i=0;i<n-1;i++){

            if (arr[i] == arr[i+1]) {
                System.out.println(arr[i]);
            }
        }       
    }
}
