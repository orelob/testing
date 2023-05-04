package demo;

import listener.SampleListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

@Listeners(SampleListener.class)
public class ParallelTest {
    private static final Logger logger = LogManager.getLogger(ParallelTest.class);

    @Test
    public void test1() throws InterruptedException {
        logger.info("Thread ID Is : " + Thread.currentThread().getId());
    }

    @Test
    public void test2() throws InterruptedException {
        logger.info("Thread ID Is : " + Thread.currentThread().getId());
    }

    @Test
    public void test3() throws InterruptedException {
        logger.info("Thread ID Is : " + Thread.currentThread().getId());
    }
}
