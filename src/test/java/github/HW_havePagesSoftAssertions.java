package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HW_havePagesSoftAssertions {
  @Test
  void ShouldBePaPagesSoftAssertions() {
      // Откройте страницу Selenide в Github
      open("https://github.com/selenide/selenide");
      // Перейдите в раздел Wiki проекта
      $("#wiki-tab").click();

      // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
      $(".js-wiki-more-pages-link").click();
      $x("//a[contains(text(), 'SoftAssertions')]").shouldHave(text("SoftAssertions"));

      // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
      $x("//a[contains(text(), 'SoftAssertions')]").click();
      $x("//h4[contains(text(), '3. Using JUnit5 extend test class:')]").click();
           sleep(5000);
  }


}
