import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilmaiTest {
    private String pavadinimasT;
    private String zanrasT;
    private String aktoriaiT;
    private String rezisieriusT;
    private String trukmeT;
    private String trintiRedaguotiT;
    private String expectedClickSiustiPositive;
    private String expectedClickSiustiNegative;
    private String expectedClickRedaguotiPositive;
    private String expectedClickRedaguotiNegative;


    @Before
    public void setupas() {
        Filmai.setupas();
        pavadinimasT = "Makaronas";
        zanrasT = "Animacija";
        aktoriaiT = "Visi kas netingi";
        rezisieriusT = "Jezus";
        trukmeT = "20";
        Filmai.clickSiusti();
        expectedClickSiustiPositive = "Duomenys įrašyti sėkmingai";
        expectedClickSiustiNegative = "Duomenų įvedimo klaida";
        trintiRedaguotiT = "141";
        expectedClickRedaguotiPositive = "Įrašas paredaguotas sėkmingai";
        expectedClickRedaguotiNegative = "Blogai įvesti duomenys redaguojant įrašą";
        Filmai.clickTrinti();
        Filmai.clickRedaguoti();
    }

    @Test
    public void fillAllFieldTestPositive() {
        Filmai.fillPavadinimas(pavadinimasT);
        Filmai.fillZanras(zanrasT);
        Filmai.fillAktoriai(aktoriaiT);
        Filmai.fillRezisierius(rezisieriusT);
        Filmai.fillTrukme(trukmeT);
        Filmai.clickSiusti();
        String actualClickSiusti = Filmai.clickSiustiPositive();
        Assert.assertEquals(expectedClickSiustiPositive, actualClickSiusti);
    }

    @Test
    public void trintiTest() {
        Filmai.fillTrintiRedaguoti(trintiRedaguotiT);
        Filmai.clickTrinti();
    }

    @Test
    public void redaguotiTestPositive(){
        Filmai.fillTrintiRedaguoti(trintiRedaguotiT);
        Filmai.fillPavadinimas(pavadinimasT);
        Filmai.fillZanras(zanrasT);
        Filmai.fillAktoriai(aktoriaiT);
        Filmai.fillRezisierius(rezisieriusT);
        Filmai.fillTrukme(trukmeT);
        Filmai.clickRedaguoti();
        String actualClickRedaguoti = Filmai.clickRedaguotiPositive();
        Assert.assertEquals(expectedClickRedaguotiPositive, actualClickRedaguoti);
    }
    @Test
    public void fillAllFieldTestNegative(){
        Filmai.fillPavadinimas(pavadinimasT);
        Filmai.fillZanras(zanrasT);
        Filmai.fillRezisierius(rezisieriusT);
        Filmai.fillTrukme(trukmeT);
        Filmai.clickSiusti();
        String actualClickSiusti = Filmai.clickSiustiNegative();
        Assert.assertEquals(expectedClickSiustiNegative, actualClickSiusti);
    }
    @Test
    public void redaguotiTestNegative(){
        Filmai.fillTrintiRedaguoti(trintiRedaguotiT);
        Filmai.fillPavadinimas(pavadinimasT);
        Filmai.fillZanras(zanrasT);
        Filmai.fillRezisierius(rezisieriusT);
        Filmai.fillTrukme(trukmeT);
        Filmai.clickRedaguoti();
        String actualClickRedaguoti = Filmai.clickRedaguotiNegative();
        Assert.assertEquals(expectedClickRedaguotiNegative, actualClickRedaguoti);
    }
}

