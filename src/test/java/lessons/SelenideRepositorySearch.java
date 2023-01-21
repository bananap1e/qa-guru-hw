package lessons;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        //открыть главную страницу
        open("https://github.com/");
        //ввести в поле поиска selenide и нажать enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        //кликнуть на первый репозиторий из списка найденных
        $("ul.repo-list li a").click();
        // проверка: заголовок selenide / selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
    @Test
    void solntsevShouldBeTheTopContributor() {
        //открыть страницу рапозитория селенида
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому аватару из блока contributors
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row")
                .$("ul li").hover();
        //проверка: во всплывающем окне есть текст Andrei Solntsev
        $$(".Popover .Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
    }
}

