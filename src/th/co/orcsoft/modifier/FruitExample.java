package th.co.orcsoft.modifier;

public class FruitExample {
	public static void main (String[] args) {
        Fruit fr = new Fruit();
        fr.name = "Grape";
        fr.flavor = "sour";
        fr.setColor("green");
        
        System.out.println("Fruit name: " + fr.name);
        System.out.println("Flavor: " + fr.flavor);
        System.out.println("Color: " + fr.getColor());
    }
}
