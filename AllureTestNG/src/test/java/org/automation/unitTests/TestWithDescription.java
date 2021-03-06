package org.automation.unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;

/**
 * Created by shantonu on 9/11/16.
 */
@Description("Class Description : This will test calculator")
public class TestWithDescription extends TestingCalculator {
    @Test
    @Description("Method Description : This will test addidtion")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Description("Method Description : This will test Division")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
