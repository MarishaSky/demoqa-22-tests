package tests.examples;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples()   {
        $("[name=q]").setValue("selenide").pressEnter();

   //     $x("//textarea[@name='q']");
   //     $(byName("q"));
    }
}
