public class CodingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday||vacation){
            return true;
        }
        return false;
    }
    //LUB TAK
//    public boolean sleepIn(boolean weekday, boolean vacation) {
//        return !weekday || vacation;
//    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile || aSmile == bSmile ){
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if(a==b){
            return (a+b)*2;
        }
        return a+b;
    }

    public int diff21(int n) {
        return n>=21? Math.abs(n-21)*2 : Math.abs(n-21);
    }

}
