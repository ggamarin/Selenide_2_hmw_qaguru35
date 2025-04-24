import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Selenide_2_hmw_qaguru35 {
    @BeforeAll
    static void setupEnvironment() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browser = "chrome";
    }

    @Test
    void shouldLoadEnterprisePage() {
        open("https://github.com/");
        $("div.HeaderMenu-wrapper").$(byText("Solutions")).hover();
        $$("li a").findBy(text("Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave((text("The AI-powered developer platform")));
    }
}
