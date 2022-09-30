package day3;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {
    @Test
    void islemler(){
        C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasım");
        // methodlar çağrılmış mı kontrol edelim
        verify(dummyObject).ekleOgrenci("Kasım");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");
    }
    // method kaç kere çağrıldığını test edelim
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Mehmet");
        // Acaba Ahmet parametresi ile ekleOgrenci() metodu 2 defa çağrıldı mı
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");
        // ekleOgrenci() metodunu "Buse" parametresi ile çağırılığ çağrılmadığını test ediyorum
        verify(dummyObject2,times(0)).ekleOgrenci("Buse");
        //herhangi bir parametre ile hic ccagrilmsyan kodu test edmek

        verify(dummyObject2,never()).silOgrenci(anyString());//anyString ne gelirse onemli degil

        //methodun en az 2 defa cagirildigini test etmek istersek
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet");//atLeast en az 2 defa cagirdim mi

    }

    //methodlarin cagirilma sirasini test etmek istersem

    @Test
    void testSiralama(){
        C05_Mock_Islemler dummyObject3=Mockito.mock(C05_Mock_Islemler.class);

        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Mehmet");
        dummyObject3.silOgrenci("Ahmet");

        //inOrder classi siralama icin kullaniliyor
        InOrder inOrder=inOrder(dummyObject3);//mockito turu
        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Mehmet");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");


    }
}
