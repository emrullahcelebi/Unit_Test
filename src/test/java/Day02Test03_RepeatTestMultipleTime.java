import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMultipleTime {

    //testi tekrarlamak istersem
    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java","Java is an OOP launguage".substring(0,4));
        System.out.println("test calisti");
    }

    //2.ornek
    //@Disabled
    //herhangi bir testi disable etmek icin QDisable annotation i ilgili test methodunun
    //uzerine yazmamiz yeterli
    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("Calisti");
    }
    Random rm=new Random();
    @RepeatedTest(5)
    void testMathExact(){
        int sayi1=rm.nextInt(10);
        int sayi2=rm.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 = "+sayi1+"sayi2 = "+sayi2 );
    }



}
