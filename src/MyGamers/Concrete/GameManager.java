package MyGamers.Concrete;

import MyGamers.Abstract.GameService;
import MyGamers.Entity.Game;
import MyGamers.Entity.Gamer;

import java.util.List;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println("Oyun eklendi : " + game.getName() +", Fiyat : " + game.getPrice());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi : " + game.getName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun güncellendi : " + game.getName());
    }

    @Override
    public void buy(Gamer gamer, Game game) {
        List<Game> games = gamer.getGames();
        games.add(game);
        gamer.setGames(games);
        System.out.println(gamer.getFullName() + ", " + game.getName() + " satın aldı.");
    }

    public void addMultiple(Game[] games){
        for (Game game : games){
            add(game);
        }
    }

}
