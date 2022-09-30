package day3;

public class C01_StringModify {
    //Task: Kelimenin ilk 2 harfinde A harfi varsa silinsin
    //kelime icindeki harflerin hepsi buyuk olacak
    //AABC--> BC, ABC --> BC

    public String deleteAIfItIsinFirstTwoPosition(String str){
        if (str.length()<=2){
            return  str.replace("A","");
        }
        String firstTowChars=str.substring(0,2);//ilk iki harfi aldim
        String afterFirstTowChars=str.substring(2);//3. harften itibaren aldim

        return firstTowChars.replace("A","")+afterFirstTowChars;
        //ilk 2 harfte A varsa hiclikle degistir ve sonrakileri ekle
    }
}
