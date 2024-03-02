package tests.examples;

import org.junit.jupiter.api.*;

public class JUnit5Examples {

    @BeforeAll
    static void setUp()   {
        System.out.println("___SetUp()");
    }

    @BeforeEach
    void beforeEach()   {
        System.out.println("______beforeTest");
    }

    @Test
    void firstTest() {
        System.out.println("______firstTest");
    }

    @Test
    void secondTest() {
        System.out.println("______secondTest");
    }

    @AfterEach
    void afterEach()   {
        System.out.println("______afterTest");
    }

    @AfterAll
    static void tearDown()  {
        System.out.println("___tearDown()");
    }


}
