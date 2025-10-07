package src;

import java.util.HashSet;

public class Lotto {

    public static void main(String[] args) {

        HashSet set = new HashSet();

        for(int i =0;i <6;i++){
            boolean isUnique = false;
//            System.out.println(randomNumber);
            while(!isUnique){
                int randomNumber = (int) (Math.random()*49)+1;
                if(!set.contains(randomNumber)){
                    set.add(randomNumber);
                    isUnique = true;
                }
                else{
                    System.out.println("powtorka");
                }
            }
        }
        System.out.println(set);
    }
}
