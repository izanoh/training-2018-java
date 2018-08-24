package th.co.orcsoft.keyword;

public abstract class Multiplication {
	abstract int getTable();
	public void calculation() {
		for (int i = 1; i<=12 ; i++ ) {
			System.out.println(getTable() + " * " + i + " = " + (getTable()*i));
		}
	}
}
