import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Selenide2_hmw_qaguru35 {
    @BeforeAll
    static void setupEnvironment() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browser = "chrome";
    }

    @Test
    void shouldLoadEnterprisePageTest() {
        open("https://github.com/");
        $("div.HeaderMenu-wrapper").$(byText("Solutions")).hover();
        $$("li a").findBy(text("Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave((text("The AI-powered developer platform")));
    }

    @Test
    void shouldMoveAtoBTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-b").hover();
        actions().clickAndHold().moveByOffset(-200, 0).release().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    void shouldDragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
