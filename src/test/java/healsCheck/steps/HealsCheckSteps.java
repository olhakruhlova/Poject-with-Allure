package healsCheck.steps;

import io.qameta.allure.Step;

public class HealsCheckSteps {

    @Step("Check first step")
    public static void healsCheckSteps() {
        System.out.println("I am step");
    }
    @Step("Check second step")
    public static void healsCheckSteps1() {
        System.out.println("I am step");
    }
    @Step
    public static void healsCheckSteps2() {
        System.out.println("I am step");
    }
    @Step
    public static void healsCheckSteps3() {
        System.out.println("I am step");
    }
    @Step
    public static void healsCheckSteps4() {
        System.out.println("I am step");
    }
}
