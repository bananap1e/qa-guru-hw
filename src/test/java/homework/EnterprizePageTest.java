package homework;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class EnterprizePageTest {
    @Test
    void shouldOpenEnterprizePage() {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown .HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $$("html").findBy(visible).shouldHave(text("Build like the best"));
    }
}
