import org.junit.*;

public class MainClassTest {

@BeforeClass
    public static void beforeClassMethod(){

    }

    @Before
    public void setUp(){

    }


    @Test
    public void method1(){

        Assert.assertTrue(1+1 ==2);
        Assert.assertFalse("Value are True!!!",1+1==2);

    }



    @Test
    @Ignore
    public void method2(){

        Assert.assertNull(0);
        Assert.assertNotNull(2);
    }

    @Test
    public void method3(){


        Assert.assertEquals(10,5+5);

        Assert.assertNotEquals(10,2+2);

    }


    @After
    public void tearDown(){

    }

    @AfterClass
    public static void afterClassMethod(){

    }



}
