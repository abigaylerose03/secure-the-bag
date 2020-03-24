package hygienegame.screens;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.graphics.Spritesheet;
import de.gurkenlabs.litiengine.gui.screens.Screen;
import de.gurkenlabs.litiengine.util.io.ImageSerializer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameScreen extends Screen {
    private BufferedImage image;
    private Spritesheet spritesheet;

    public GameScreen(String screenName) {
        super(screenName);

        image = ImageSerializer.loadImage("img/image.png");
        spritesheet = new Spritesheet(image, "img/image.png", 64, 64);
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);



        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int sprite = (int)(Game.time().sinceGameStart() / 200);
                sprite += i;
                sprite += j * 6;

                Game.graphics().renderImage(g, spritesheet.getSprite(sprite), i * 32, j * 32);
            }
        }

    }
}
