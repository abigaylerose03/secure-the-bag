package hygienegame;

import lombok.Data;

@Data
public class GameMap {
    private GameTile[][] tiles;
    private int width;
    private int height;

    public GameMap(int width, int height) {
        this.width = width;
        this.height = height;

        tiles = new GameTile[width][height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = new GameTile();
                tiles[x][y].setTileType(TileType.VOID);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tiles[i][j].setTileType(TileType.GROUND);
            }
        }
    }
}

/*

 .....
 .....
 .....
 .....
 .....









 */