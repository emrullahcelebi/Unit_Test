package day3;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class C06_ErrorTest {

    @Test
    void test(){
        //Error Runner clasinda divider methodu 5 ve 0 parametreleri ile hata firlatirken
        // ayni methodu mocklanan obje uzerinden cagirdigimizda hatafirlatmaz
        //obje sahte oldugu icin method gercekten calismaz
        C06_Error testObj= Mockito.mock(C06_Error.class);// mockitoladik
        testObj.divide(5,0);

    }
}
