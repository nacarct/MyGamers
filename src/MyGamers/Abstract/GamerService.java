package MyGamers.Abstract;

import MyGamers.Entity.Gamer;

public interface GamerService {
    void add(Gamer gamer);
    void delete(Gamer gamer);
    void update(Gamer gamer);
}
