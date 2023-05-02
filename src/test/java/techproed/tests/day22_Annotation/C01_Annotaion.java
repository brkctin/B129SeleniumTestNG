package techproed.tests.day22_Annotation;

import org.testng.annotations.*;

public class C01_Annotaion {

     /*
     @Test: Testlerimizi yazmak için kullandıgımız notasyon
     @BeforeSuite: Her bir test suite'inden önce bir kez calısır
     @AfterSutie: Her bir test suite'inden sonra bir kez calısır.
     @BeforeTest: Her bir test öncesi bir kez calısır.
     @AfterTest: Her bir test sonrası bir kez calısır.
     @BeforeClass: Her bir class'dan önce bir kez calısır
     @AfterClass: Her bir class'dan sonra bir kez calısır.
     @BeforeMethod: Her bir test method'undan önce bir kez calısır.   --> JUnit'deki @Before
     @AfterMethod: her bir test medhod'undan sonra bir kez calısır.   --> JUnit'deki @After
     --TestNG''de @BeforeGroups, @AfterGroups, @FindBy gibi notasyonlarda vardır. Bunları ilerki konularda göreceğiz.
     --JUnit'de
     */

    @Test
    public void test1(){
        System.out.println("Test 1 Çalıştı");
    }
    @Test
    public void test2() {
        System.out.println("Test 2 Çalıştı");
    }
    @Test
    public void test3() {
        System.out.println("Test 3 Çalıştı");
    }
    @Test
    public void test4() {
        System.out.println("Test 4 Çalıştı");
    }
    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}