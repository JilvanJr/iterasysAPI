package test;

import entities.Category;
import entities.Pet;
import entities.Store;
import entities.User;

public class MassaDados {
	Category dog = new Category(1, "dog");
	Category cat = new Category(2, "cat");
	Category platypus = new Category(3,"platypus");
	User ana = new User(1, "ana_maia", "Ana", "Maia", "ana@maia.com", "123456", "40028922", 1);
	User rodrigo = new User(2, "rodrigo_mendes", "Rodrigo", "Mendes", "rodrigo@mendes.com", "654321", "40028923", 1);
	User tatiana = new User(3, "tatiana_vasconcelos", "Tatiana", "Vasconcelos", "tatiana@vasconcelos.com", "123123", "40028924", 1);
	Pet snoopy = new Pet(1, dog, "Snoopy", "available");
	Pet bichento = new Pet(2, cat, "Bichento", "available");
	Pet perry = new Pet(3, platypus, "Perry", "available");
	Store anaPerry = new Store(ana, perry, 1, "2020-05-30T20:37:39.749Z", "approved", true); 
	Store rodrigoSnoopy = new Store(rodrigo, snoopy, 1, "2020-05-30T20:37:39.749Z", "approved", true);
	Store tatianaBichento = new Store(tatiana, bichento, 1, "2020-05-30T20:37:39.749Z", "delivered", true);

	String endpointUser = "user";
	String endpointPet = "pet";
	String endpointStore = "store/order";
}
