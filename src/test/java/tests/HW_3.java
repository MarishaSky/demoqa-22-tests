package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HW_3 extends TestBase {

    @Test
    void fillFormTest() {
        open("/text-box");

        $("#userName").setValue("Alex Egorov");
        $("#userEmail").setValue("alex@egorov.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

    }

    @Test
    void registrationFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Maryna");
        $("#lastName").setValue("Stalkova");
        $("#userEmail").setValue("marisha.andreevna@mail.ru");
        $("#gender-radio-2").parent().click();
        $("#userNumber").setValue("6558468456");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--029:not(.react-datepicker__day--outside-month").click();
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $x("//label[text()='Music']").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.jpg"));
    //    $("#uploadPicture").uploadFromClasspath("/img/1.jpg");
        $("#currentAddress").setValue("Some address 1");

        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form\n"));
        $(".table-responsive").shouldHave(text("Maryna"), text("Stalkova"),
                text("marisha.andreevna@mail.ru"), text("6558468456"));



    }
}
