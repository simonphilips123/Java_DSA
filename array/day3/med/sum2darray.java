//14. WAP to calculate the sum of all elements in a given 2D array.
package Java_DSA.array.day3.med;

public class sum2darray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int sum = 0;
        int n = arr.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
