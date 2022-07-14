package bbGame;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



	public class CreateRandom {
	    public int setNum(){
	        Random random = new Random();
	        return random.nextInt(9) + 1;
	
	}