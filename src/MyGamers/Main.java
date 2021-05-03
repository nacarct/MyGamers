package MyGamers;

import MyGamers.Concrete.CampainManager;
import MyGamers.Concrete.GameManager;
import MyGamers.Concrete.GamerManager;
import MyGamers.Entity.Campain;
import MyGamers.Entity.Game;
import MyGamers.Entity.Gamer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        GamerManager gamerManager = new GamerManager();
        CampainManager campainManager = new CampainManager();

        Game game1 = new Game(1,"Call Of Duty",499.99);
        Game game2 = new Game(2,"BattleField",145.75);
        Game game3 = new Game(3,"Fifa 2021",253.59);
        Game game4 = new Game(4,"Cyberpunk 2077",455.20);
        Game game5 = new Game(5,"GTA V",345.29);

        Game[] games = {game1, game2, game3, game4, game5};

        gameManager.addMultiple(games);

        gameManager.update(game4);

        gameManager.delete(game3);

        List<Game> gamer1Games = new ArrayList<Game>();
        gamer1Games.add(game1);
        gamer1Games.add(game2);
        gamer1Games.add(game4);

        List<Game> gamer2Games = new ArrayList<Game>();
        gamer2Games.add(game1);
        gamer2Games.add(game3);
        gamer2Games.add(game5);

        List<Game> gamer3Games = new ArrayList<Game>();
        gamer3Games.add(game1);
        gamer3Games.add(game3);
        gamer3Games.add(game5);


        Gamer gamer1 = new Gamer(1, "Temuçin", "Nacar", "12345678901", LocalDate.of(1991,11,29) , gamer1Games);
        Gamer gamer2 = new Gamer(2, "Emre", "Tatar", "12345678911",LocalDate.of(1992,9,15) , gamer2Games);
        Gamer gamer3 = new Gamer(3, "Mehmet", "Şığva", "12345678931",LocalDate.of(1990,5,19) , gamer3Games);

        gamerManager.add(gamer1);
        gamerManager.add(gamer2);
        gamerManager.add(gamer3);

        gamerManager.update(gamer2);
        gamerManager.delete(gamer3);

        gameManager.buy(gamer1, game2);

        gamerManager.gameList(gamer1);

        Campain campain1 = new Campain(1,"Bahar Kampanyası",15);
        Campain campain2 = new Campain(2,"Yaz Kampanyası",25);
        Campain campain3 = new Campain(3,"Kış Kampanyası",15);
        campainManager.add(campain1);
        campainManager.add(campain2);
        campainManager.add(campain3);

        campainManager.update(campain1);
        campainManager.delete(campain3);

        campainManager.apply(game1,campain2);
        campainManager.apply(game5,campain1);

        for (Game game : games){
            System.out.println(game.getName() + " : " + game.getPrice());
        }

    }
}
