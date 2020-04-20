package hygienegame.screens;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.graphics.Spritesheet;
import de.gurkenlabs.litiengine.gui.screens.Screen;
import de.gurkenlabs.litiengine.util.io.ImageSerializer;
import hygienegame.GameMap;
import hygienegame.GameState;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameScreen extends Screen {
    public static final String TILESET_FILENAME = "img/tilesets/Futuristic_A1.png";
    private BufferedImage image;
    private Spritesheet spritesheet;
    private GameState gameState;

    public GameScreen(String screenName) {
        super(screenName);

        image = ImageSerializer.loadImage(TILESET_FILENAME);
        spritesheet = new Spritesheet(image, TILESET_FILENAME, 64, 64);
        gameState = new GameState();
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);

        drawMap(g, gameState.getMap());

    }

    private void drawMap(Graphics2D g, GameMap map) {
        for (int x = 0; x < map.getWidth(); x++) {
            for (int y = 0; y < map.getHeight(); y++) {
                int sprite = map.getTiles()[x][y].getTileType().getSprite();

                Game.graphics().renderImage(g, spritesheet.getSprite(sprite), x * 200, y * 200);
            }
        }
    }
}
