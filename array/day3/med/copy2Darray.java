package Java_DSA.array.day3.med;

public class copy2Darray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        int row=arr.length;
        int col=arr[0].length;
        int[][] copyArr=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                copyArr[i][j]=arr[i][j];
            }
        }
        for(int[] rarr:copyArr){
            for (int np:rarr){
                System.out.print(np+" ");
            }
            System.out.println();
        }

    }
}
