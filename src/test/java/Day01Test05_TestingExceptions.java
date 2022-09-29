import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {
    //test etttigimiz methodu bekledigimiz exception firlatti mi?


    @Test
    void testException(){
        String str="Merhaba Dunya";
        assertThrows(NullPointerException.class,()->{
            System.out.println("testException is run");
            str.length();
        });

    }
    //
    // bolme islemi icin exception kontrolu

   @Test
    void testException2(){
        int sayi1=1;
        int sayi2=0;
        //parent i da yazabiliriz : RuntimeException
        assertThrows(RuntimeException.class,()->{//eger benim testim buradaki gibi bekledigim exc. i verirse kod gecer
            System.out.println(sayi1/sayi2);
        });
   }
   //yukaridaki soruyu method ekleyerek yapalim

    @Test
    void testException3(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class,()->{
            divide(sayi1,sayi2);
        });

        }
    private int divide (int a, int b){
        return a/b;
    }
}
