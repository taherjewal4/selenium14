package testng;

import org.testng.annotations.*;

public class TestNgTagOrder {

    @AfterMethod
    public void afterMethod(){
        System.out.println("@AfterMethod");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("@AfterClass");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@BeforeMethod");
    }

    @Test
    public void test(){
        System.out.println("@Test");
    }

}
