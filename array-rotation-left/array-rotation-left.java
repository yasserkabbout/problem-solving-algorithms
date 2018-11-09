import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRotationLeft {



    public static void main(String[] args){

        //Array to be shifted
        int[] A={1,2,3,4,5};

        int j=0;

        //Rotate Factor (rotating the arry left n times)
        int rotateFactor =4;

        ArrayList<Integer> tmp = new ArrayList<>();

        //1. Storing rotateFactor elements in tmp
        for(int i=0;i<rotateFactor;i++){
            tmp.add(A[i]);
            A[i]=0;
        }


        //2. Shifting the rest of Array A to left
        System.arraycopy(A, rotateFactor, A, 0, A.length - rotateFactor);


        //3. Storing back the rotateFactor elements
        for(int i=A.length-rotateFactor;i<A.length;i++){

          A[i]=tmp.get(j);
          j++;

        }

        //printing the Arrays
        //You can implement a return function instead...
        System.out.println(tmp);
        System.out.println(Arrays.toString(A));


        }



    }
