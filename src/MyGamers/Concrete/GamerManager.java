package MyGamers.Concrete;

import MyGamers.Abstract.GamerService;
import MyGamers.Entity.Game;
import MyGamers.Entity.Gamer;
import WebServices.EDevletManager;
import WebServices.EDevletService;

public class GamerManager implements GamerService {

    EDevletManager eDevletManager = new EDevletManager();

    @Override
    public void add(Gamer gamer) {
        eDevletManager.checkCitizen(gamer.getCitizenId(), gamer.getFirstName(),gamer.getLastName(),gamer.getDateOfBirth().getYear());

        System.out.println("Oyuncu eklendi : " + gamer.getFullName());
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu silindi : " + gamer.getFullName());
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu güncellendi : " + gamer.getFullName());
    }

    public void gameList(Gamer gamer){
        System.out.println(gamer.getFullName() + " oyun listesi.");
        for (Game game : gamer.getGames()){
            System.out.println("Oyun : " + game.getName());
        }
    }
}
