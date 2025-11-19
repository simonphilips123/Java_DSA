package Java_DSA;

public class twopointer230925 {
    
    public static void main(String[] args){

        int [] arr={1,7,3,9,2,5,8};

        int left=0;
        int n=arr.length;
        int right=n-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }
        for(int no: arr) {
            System.out.println(no);
        }
    }
}
