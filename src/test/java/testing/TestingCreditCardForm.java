package testing;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestingCreditCardForm {

    @Test
    public void shouldOpenCreditCardOrder() {
        open("http://localhost:9999");
        $("[name=\"name\"]").setValue("Иванов Иван");
        $("[name=\"phone\"]").setValue("+79998887766");
        $("[data-test-id=\"agreement\"]").click();
        $("button").click();
        $("[data-test-id=\"order-success\"]").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}
