package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PlayerTest {
    @DisplayName("구입 금액이 1000원으로 나누어 떨어지지 않으면 예외가 발생한다.")
    @Test
    void createPurchaseAmountNotDividedBy1000() {
        assertThatThrownBy(() -> new Player(3300))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
