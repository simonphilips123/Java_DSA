package Java_DSA.TwoPointers.nov25;

public class TwoSum {

        public int[] twoSum(int[] numbers, int target) {
            int n=numbers.length;
            int left=0;
            int right=n-1;

            while(left<right){

                int sum=numbers[left]+numbers[right];

                if(sum==target){

                    return new int[]{left+1,right+1};
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
            return new int[]{}; //return empty array
        }
    public static void main(String[] args) {
//        System.out.println("welcome back");

       int[] numbers = {2,7,11,15};
        int target = 9;
        TwoSum obj=new TwoSum();
        int[] res=obj.twoSum(numbers,target);
        System.out.println(res[0]+"  "+res[1]);
    }
}
