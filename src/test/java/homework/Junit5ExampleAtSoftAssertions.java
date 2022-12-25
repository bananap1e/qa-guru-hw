package homework;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Junit5ExampleAtSoftAssertions {

    @Test
    void ShouldExtendsJUnit5ExampleAtSoftAssertions() {
        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        //  Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $$("#wiki-pages-box").findBy(visible).shouldHave(text("SoftAssertions"));

        // Откройте страницу SoftAssertions,
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();

        // проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
