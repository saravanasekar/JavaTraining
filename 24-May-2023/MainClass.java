package InterAbs;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Parrot();
		b.Bird();
		b.fly();
	}

}

abstract class Bird{
	abstract public void Bird();
	  public void fly() {
		System.out.println("abstractfly"); 
	 }
}

class Parrot extends Bird{
  public void Bird() {
	  System.out.println("Parrot-Bird");
  }
}