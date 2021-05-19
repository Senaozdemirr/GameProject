package gameProject.concretes;

import gameProject.abstracts.GamerCheckService;
import gameProject.abstracts.GamerService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu eklendi. " + gamer.getFirstName());
		} else {
			System.out.println("Doðru bilgi giriniz.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Oyuncu silindi. " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Oyuncu güncellendi. " + gamer.getFirstName());
	}

	
}
