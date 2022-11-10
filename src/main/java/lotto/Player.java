package lotto;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Lotto> lottos;
    private final int purchaseAmount;

    public Player(int purchaseAmount) {
        validate(purchaseAmount);
        this.purchaseAmount = purchaseAmount;
        this.lottos = getLottos();
    }

    private void validate(int purchaseAmount) {
        // TODO: 1000원 단위로 떨어지지 않으면 예외 처리
    }

    private List<Lotto> getLottos() {
        List<Lotto> lottos = new ArrayList<>();
        return lottos;
    }

}
