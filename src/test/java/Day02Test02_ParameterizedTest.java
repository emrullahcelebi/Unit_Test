import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Day02Test02_ParameterizedTest {

    @Test
    void testLength(){
        assertTrue("Mirac".length()>0);
        assertTrue("Ali".length()>0);
        assertTrue("Cemal".length()>0);
        assertTrue("HAlil".length()>0);
        assertTrue("Cenk".length()>0);
    }

    //yukaruidaki methodu daha kolay yazmak icin parametreli testler yaziyoruz
    @ParameterizedTest
    @ValueSource(strings={"Mirac","Ali","Cemal","HAlil","Cenk"})
    void testLength2(String str){//Array icerisindekileri arka planda tek tek alarak isleme sokuyor
        assertTrue(str.length()>0);
    }
    //2.ornek

    @Test
    void testUpperCase(){
        String str1="Merhaba";
        String str2="Java";
        String str3="Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    //yukaridaki ornegi parametreli olarak test edelim

    @ParameterizedTest
    @CsvSource(value =
            {//key value gibi
                    //2.ifadeyi uppercase icerisine atiyor ve 1.ifade olarak cikmasini istiyor
                    "MERHABA, merhaba",
                    "JAVA, java",
                    "TEST,test"
            })
    void testUpperCase2(String str1, String str2){
        assertEquals(str1,str2.toUpperCase());
    }

    //3. ornek
    @ParameterizedTest
    @CsvSource(value = {"true,java,a","true,junit,u","false,hello,a"})
    //java da a var mi true-junit icinde u var mi true-hello kelimesinin icinde a var mi false
    void testContains(boolean b1,String str1,String str2){
        assertEquals(b1,str1.contains(str2));

    }
}
