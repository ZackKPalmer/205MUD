
import java.util.Scanner;

public class MudBoot {
	
	private MudBoot() {
		
		Room b = new Room ("Basement");
		Room n = new Room ("Entrance");
		Room h = new Room ("Hallway");
		
		Exit e1 = new Exit ("To Hallway", h, "north");
		Exit e2 = new Exit ("To Entrance", e, "south");
		Exit e3 = new Exit ("To Basement", b, "Your not ready yet!");
		
		Player p = new Player(n);
		
		Item sword = new Item("sword");
		Item knife = new Item("knife");
		Item shield = new Item("shield");
		
		n.addItem(b);
		n.addExit(e1);
		
		h.addExit(e2);
		h.addExit(e3);
		
		p.addItem(shield);
		p.addItem(knife);
		
		
		UI ui = new UI(n);
		ui.run();
	}
}
