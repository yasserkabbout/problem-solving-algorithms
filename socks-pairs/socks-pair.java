import java.util.HashMap;
import java.util.Map;

public class SocksPairs {


    public static void main(String[] args) {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20,50,10,10,60,60,70,70,80};


        Map<Integer, Integer> socksMap = new HashMap<>();
        Map<Integer, Integer> pairsOfSocks = new HashMap<>();
        int pairsCount =0;

        for (int i : ar) {
            if (socksMap.containsKey(i)) {
                socksMap.put(i, socksMap.get(i) + 1);

            } else {
                socksMap.put(i, 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : socksMap.entrySet()) {

            //System.out.println(entry.getKey() + ": " + entry.getValue());


            if (entry.getValue() % 2 == 0) {
                //System.out.println(entry.getValue());
                //System.out.println(entry.getValue()/2);
                pairsOfSocks.put(entry.getKey(), (entry.getValue() / 2));

            }

             if(entry.getValue() % 2 == 1){
                //System.out.println(entry.getValue());
                 //System.out.println((entry.getValue()-1)/2);
                pairsOfSocks.put(entry.getKey(), ((entry.getValue())/2));
            }




        }

        for (Map.Entry<Integer, Integer> entry : pairsOfSocks.entrySet()) {


            System.out.println(entry.getKey() + ": " + entry.getValue());
            pairsCount+=entry.getValue();

        }

        System.out.println("There is: "+ pairsCount+ " Pairs");
    }
}

