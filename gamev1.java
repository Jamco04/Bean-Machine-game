public class gamev1 {
    public static void main (String[] args){
        int numOfSlots = 10;
        int numOfBalls = 50;

        int[] slots = new int[numOfSlots];


        for (int i = 0; i<numOfBalls; i++) {
            int defaultPos =1;
            for (int j = 0; j<numOfSlots-1; j++){
                if (Math.random()<.5){
                    System.out.print("L");

                }

                else {
                    System.out.print("R");
                    defaultPos++;
                }

            }
            System.out.println("");
            slots[defaultPos] +=1;

        }
        int numOfrows = numOfBalls;
        for (int i =0; i<numOfBalls ; i++ ){
            for (int j=0;j<numOfSlots ;j++){

                if (slots[j]>=numOfrows){
                    System.out.print("0");
                }
                else{
                    System.out.print(" ");


                }
            }
            numOfrows--;
            System.out.println();
        }


    }
}