package th.co.orcsoft.modifier;

import th.co.orcsoft.modifier.obj.Person;

public class PersonExample {
	public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.firstName = "Shawn";
        p1.lastName = "Roberts";
//        p1.age = 32;  // cant access age from other package
        p1.setHeight(178);
        
        System.out.println(p1.getFullname());
//        System.out.println("Age " + p1.age + " years"); // cant access age from other package
        System.out.println("Height " + (p1.getHeight() / 100.0f) + " m");
        
    }
}
