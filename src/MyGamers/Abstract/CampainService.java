package MyGamers.Abstract;

import MyGamers.Entity.Campain;
import MyGamers.Entity.Game;

public interface CampainService {
    void add(Campain campain);
    void delete(Campain campain);
    void update(Campain campain);
    void apply(Game game, Campain campain);
}
