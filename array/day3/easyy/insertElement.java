package Java_DSA.array.day3.easyy;

public class insertElement {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        int[] narr=new int[n+1];
        int element=4;
        int index=3;
        for (int i=0;i<index;i++) {
            narr[i] = arr[i];
        }
        narr[index]=element;

        for (int j = index; j < n; j++) {
                narr[j + 1] = arr[j];
            }
        for(int no:narr){
            System.out.println(no);
        }
    }
}
