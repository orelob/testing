package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

public class DependentTest {
    private static final Logger logger = LogManager.getLogger(DependentTest.class);

    @Test(dependsOnMethods = {"test3", "test2"})
    public void test1() {
        logger.info("Test method 1");
    }

    @Test
    public void test2() {
        logger.info("Test method 2");
    }

    @Test
    public void test3() {
        logger.info("Test method 3");
    }
}
