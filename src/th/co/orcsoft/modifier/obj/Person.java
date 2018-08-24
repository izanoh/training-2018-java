package th.co.orcsoft.modifier.obj;

public class Person {
	public String firstName;
    public String lastName;
    protected int age;
    private int height;
   
    public String getFullname() {
        return firstName + " " + lastName;
    }
    
    public void setHeight(int h) {
        height = h;
    }
    
    public int getHeight() {
        return height;
    }
}
