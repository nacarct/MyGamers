package MyGamers.Abstract;

import MyGamers.Entity.Game;
import MyGamers.Entity.Gamer;

public interface GameService {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
    void buy(Gamer gamer, Game game);
}
