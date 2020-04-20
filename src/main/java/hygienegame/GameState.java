package hygienegame;

import lombok.Data;

@Data
public class GameState {
    private Player player;
    private GameMap map;

    public GameState() {
        map = new GameMap(100, 100);
    }

}
