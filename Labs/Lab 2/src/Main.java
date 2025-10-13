import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> userNums = new ArrayList<>();

        for (int arg = 0; arg < args.length; arg++) {
            userNums.add(Integer.parseInt(args[arg]));
        }

        ArrayList<Integer> lottoList = selectNumbers();

        System.out.println(userNums);
        System.out.println(lottoList);

        ArrayList<Integer> userNumsCopy = new ArrayList<>(userNums);

        userNumsCopy.retainAll(lottoList);

        System.out.println("Wygrywajace numery: "+userNumsCopy);
        System.out.println(userNums.toArray().length);

        Long stime = System.currentTimeMillis();
        boolean sixLotto = false;
        int count = 0;
        while(!sixLotto){
            count++;
            ArrayList<Integer> userNumsLoop = new ArrayList<>(userNums);

            lottoList = selectNumbers();
            lottoList.retainAll(userNumsLoop);

            if(lottoList.size()==6){
                sixLotto = true;
            }
        }
        Long etime = System.currentTimeMillis();

        Long elapsedTime = etime - stime;

        System.out.println("Czas: "+(elapsedTime/1000.0)+ " sekund");
        System.out.println("Ile razy: "+count);
    }

    private static ArrayList<Integer> selectNumbers() {
            ArrayList<Integer> numsList = new ArrayList<>();
            for (int i = 1; i <= 6; i++) {
                boolean add = false;
                while(!add){

                    int number = (int) Math.floor(Math.random()*50+1);
                    if(!numsList.contains(number)){
                        numsList.add(number);
                        add = true;
                    }
                }
            }

        return numsList;
    }
}
