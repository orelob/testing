package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "testData")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"John", 25},
                {"Mary", 30},
                {"Mike", 35}
        };
    }

    @Parameters({"name", "age"})
    @Test
    public void testWithParameters(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @Test(dataProvider = "testData")
    public void testWithData(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
