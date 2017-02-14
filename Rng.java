import java.util.Random;

//lihtne random number generator

public class Rng{
	int a;
	int b;
	public Rng(int number1){
		if(number1<=0){throw new RuntimeException("Arv liiga vaike, peab olema rohkem kui 0!");}
		a=number1;
		Random rand = new Random();
		b = rand.nextInt((a - 1) + 1) + 1;
	}

	public boolean possibility(){
		if((a/2)<=b){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "Sisestatud arv oli "+a+", random arv oli "+b+", see tahendab et: "+possibility();
	}
}