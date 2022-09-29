import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformansTest {

    @Test
    void testPrintPerformans(){
        assertTimeout(Duration.ofSeconds(2),
                ()-> IntStream.rangeClosed(1,100000).forEach(System.out::println));
        //IntStream.rangeClosed(1,100000) 1 den 100000 e kadar sayilari getirir
    }
    //2.ornek

    @Test
    void testPrintPerformans2(){
        assertTimeout(Duration.ofSeconds(1),
                ()->IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
    }
    //bunu nerede kullanabiliriz? mesela task olarak verdiginiz sorunun cozumu icin
    //yazilan kodun max. 2sn. icinde ekrana sonucu vermesini istiyor isem
    //performans testlerini uygularim
}
