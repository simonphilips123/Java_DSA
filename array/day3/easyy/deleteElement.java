package Java_DSA.array.day3;

public class deleteElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int index = 1;
        int n = arr.length;
        int[] newArr = new int[n - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index+1; i < n; i++) {
            newArr[i-1] = arr[i];
        }


        for (int no : newArr) {
            System.out.println(no);
        }
    }
}
