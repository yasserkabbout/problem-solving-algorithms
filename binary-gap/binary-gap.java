import java.util.*;

public class binaryCheck {

    public static void main(String[] args){


        //x is the number to check
        int x=529;
        int count =0;
        int maxBinaryGap=0;
        //a flag to detect if we have a 1
        boolean foundone=false;
        int binaryGap;
        ArrayList binaryGaps = new ArrayList();

        //Integer to Binary conversion
        String binary = Integer.toBinaryString(x);
        //printing the binary representation of x
        System.out.println(binary);


        for(int i=0; i<binary.length();i++){


            count=0;

            if (binary.charAt(i)=='1'){

                for(int j=i+1; j<binary.length();j++){
                    if(binary.charAt(j)=='0')
                        count++;//incrementing the binary gap count

                    if(binary.charAt(j)=='1'){
                        binaryGap=count;
                        binaryGaps.add(binaryGap);
                        foundone=true;
                        break;
                    }
                    else if(foundone==false)
                        binaryGap=0;




                }






            }

        }

        //Checking the max binary gap available
        for(int i=0;i<binaryGaps.size();i++){

            if(Integer.parseInt(binaryGaps.get(i).toString()) > maxBinaryGap)
                maxBinaryGap=Integer.parseInt(binaryGaps.get(i).toString());
        }





    System.out.println(maxBinaryGap);





    }





}
