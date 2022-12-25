package homework;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {
    @Test
    void actionsWithDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
        // не работает
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
    }
}
