package github;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class BestContributorToSelenide {

    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        //открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");

        //подвести мышку к первому аватару из блока contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$("ul li").hover();

        //проверка: во всплывающем окне есть текст Andrei Solntsev Если несколько элементов одинаковых
    //    $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"))

        //проверка: во всплывающем окне есть текст Andrei Solntsev
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));

        //если нужен скрин
   //     screenshot("hh");


    }

}
