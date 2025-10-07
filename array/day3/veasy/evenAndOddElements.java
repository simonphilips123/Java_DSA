//WAP to count the number of even and odd elements in a given array.
package Java_DSA.array.day3;

import java.security.spec.RSAOtherPrimeInfo;

public class evenAndOddElements {
    public static void main(String[] args) {

            int[] arr = {4, 8, 12, 3, 1, 15, 7, 13};
            int even=0;
            int odd=0;
            int[] ev= new int[arr.length];
            int[] od= new int[arr.length];
            int evindex=0;
            int oddindex=0;
            for (int j = 0; j < arr.length ; j++) {
                if (arr[j]%2==0){
                    even=arr[j];
                    ev[evindex]=even;
                    evindex++;
                }
                else {
                    odd=arr[j];
                    od[oddindex]=odd;
                    oddindex++;
                }

            }
        System.out.print("even->");
        for(int in=0;in<evindex;in++){
            System.out.print(ev[in]+" ");
        }
        System.out.println();
        System.out.print("odd->");
        for(int nn=0;nn<oddindex;nn++){
            System.out.print(od[nn]+" ");
        }
        System.out.println();

        System.out.println("totaleven->"+evindex);
        System.out.println("totalodd->"+oddindex);

        }
    }

//#output
//even->4 8 12
//odd->3 1 15 7 13
//totaleven->3
//totalodd->5