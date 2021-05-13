import java.util.*;

/*class Converter{
	public static int toBinary(int x){
		String binary="";
		while(x>0){
			binary = (x%2)+binary;
			x /=2;
		}
		int b=Integer.parseInt(binary);
		return b;
	}
}

public class Program{
	public static void main(String[] args){
		Scanner c = new Scanner(System.in);
		int x = c.nextInt();
		System.out.print(Converter.toBinary(x));
	}
}*/

class Bowling{
	HashMap<String, Integer> players;
	Bowling(){
		players = new HashMap<String, Integer>();
	}
	
	public void addPlayer(String name, int p){
		players.put(name, p);
	}
	
	//mine
	public void getWinner(){
		int n=-1;
		String p = new String();
	for(String key:players.keySet()){
		if(players.get(key) > n){
			n=players.get(key);
			p=key;
		}
	}
	System.out.println(p);
	}
}

public class Program{
	public static void main(String[] args){
		Bowling game = new Bowling();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			String input = sc.nextLine();
			String[] values = input.split("");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			game.addPlayer(name, points);
		}
		game.getWinner();
	}
}