package Java_DSA.array.day3;

public class sumOfOddAndEven {
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            int n=arr.length;
            int oddSum=0;
            int evenSum=0;
            for(int i=0;i<n;i++){
                if (arr[i]%2==0){
                    evenSum +=arr[i];
                }
                else{
                    oddSum+=arr[i];
                }
            }
        System.out.println("oddsum->"+oddSum);
        System.out.println("evensum->"+evenSum);

    }
}
