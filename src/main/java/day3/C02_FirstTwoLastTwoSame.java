package day3;

public class C02_FirstTwoLastTwoSame {
    //Task: ilk 2  ve son 2 karakteri ayni mi?

    public boolean check_If_First_Last_Two_Are_Same(String str){
        if (str.length()<=1) return false;
        if (str.length()==2) return true;

        String firstTwoChars=str.substring(0,2);
        String lastTwoChars=str.substring(str.length()-2);

        return firstTwoChars.equals(lastTwoChars);
    }
}
