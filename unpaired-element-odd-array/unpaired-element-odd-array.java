import java.util.*;

public class UnpairedElement {

    public static void main(String[] args){

        //The array to check the unpaired element
        int[] A= {9,3,9,3,9,7};
        int unpairedElement = -1;

        //Using a hashmap to calculate the occurencies of the elements in A
        Map<Integer, Integer> aCountMap= new HashMap<>();

        //Storing the elements of A into the Hashmap aCountMap
        for(int i: A){

            if(aCountMap.containsKey(i)){
                aCountMap.put(i,aCountMap.get(i)+1);

            }
            else{
                aCountMap.put(i, 1);
            }

        }

        //Displaying the elements of the array
        System.out.println("Input Array : "+Arrays.toString(A));

        //Displaying the elements of the array with their occurencies
        System.out.println("Element Count : "+aCountMap);

        //Check which element is found only once (the unpaired element)
        for (Map.Entry<Integer, Integer> entry : aCountMap.entrySet()) {

            if (entry.getValue() ==1) {

                unpairedElement=  entry.getKey();
            }
        }

        //Printing the unpaired element
        System.out.println("The unpaired number is: "+ unpairedElement);






        }

    }



