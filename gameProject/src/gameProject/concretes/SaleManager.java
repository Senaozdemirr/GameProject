package gameProject.concretes;

import gameProject.abstracts.SaleService;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class SaleManager  implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + "oyununun" + gamer.getFirstName() + "kiþisine" +
				game.getUnitPrice() + "fiyatýndan satýþý gerçekleþti.");
		
	}

}
