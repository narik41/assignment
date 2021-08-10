
/**
 * Program to find  the total number of inversions.
 * If(i<j) and (A[i]>A[j]), the pair(i,j) is called an inversion of an array.
 * Tested input: A = new int[]{1, 9,6,4,5};
 *
 * @author  Kiran Subedi
 * @date 2021/08/08
 */
public class QuestionOne {

    public static void main(String[] args){
        int[] A = new int[]{1, 9,6,4,5};

        int count = 0;
        int length = A.length;
        for(int i=0;i<length-1;i++){
            for(int j=i;j<length;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        System.out.println("The total number of inversions: "+count);
    }
}
