import java.util.Scanner;

public class UI {
	private Scanner s;
	private Player p;
	private Boolean running = true;


	public UI(Player p) {
		this.p = p;
		s = new Scanner(System.in);
	}
	public void run() {
		String Command;
		do {
			System.out.println("Commands: go<dir>, get<it>, drop<it>" + "look, and exit");
			System.out.print(" -> ");
			Command = s.next();
			
			if (Command.equalsIgnoreCase("exit"))
				running = false;
				else if (Command.equalsIgnoreCase("go"))
			if (!p.go(s.next()))
				System.out.println("No exit that way!");
			else ;
				else if (Command.equalsIgnoreCase("look")) {
					System.out.println(p.look());
				}
				else if (Command.equalsIgnoreCase("get")) {
					if (!p.getItem(s.next()))
					System.out.println("Couldn't get that!");
					else ;
				}
				else if (Command.equalsIgnoreCase("drop"))
					if (!p.dropItem(s.next()))
						System.out.println("Couldn't drop That!");
					else ;
				else 
					System.out.println("Unrecognized command");
				
		} while(running);
			System.out.println("Exiting. Thanks for Playing!");
				
		}
	}
