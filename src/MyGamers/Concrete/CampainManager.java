package MyGamers.Concrete;

import MyGamers.Abstract.CampainService;
import MyGamers.Entity.Campain;
import MyGamers.Entity.Game;

public class CampainManager implements CampainService {
    @Override
    public void add(Campain campain) {
        System.out.println("Kampanya eklendi : " + campain.getName());
    }

    @Override
    public void delete(Campain campain) {
        System.out.println("Kampanya silindi : " + campain.getName());
    }

    @Override
    public void update(Campain campain) {
        System.out.println("Kampanya güncellendi : " + campain.getName());
    }

    @Override
    public void apply(Game game, Campain campain) {
        double newPrice = game.getPrice() - (game.getPrice()*campain.getRate()/100);
        game.setPrice(newPrice);
        System.out.println(game.getName() + " oyununa kampanya uygulandı.");
    }

}
