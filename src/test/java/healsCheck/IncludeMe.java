package healsCheck;

import org.testng.annotations.Test;
import healsCheck.steps.HealsCheckSteps;

public class IncludeMe {

    @Test(description = "Heals check test")
    public void includeMeTest() {
        HealsCheckSteps healsCheckSteps = new HealsCheckSteps();
        HealsCheckSteps.healsCheckSteps();
        HealsCheckSteps.healsCheckSteps1();
        HealsCheckSteps.healsCheckSteps2();
        HealsCheckSteps.healsCheckSteps3();
        HealsCheckSteps.healsCheckSteps4();
        System.out.println("Include me");
    }
}
