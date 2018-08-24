package th.co.orcsoft.inheritance;

public class Sport {
	public int totalPlayer;

	public int getTotalPlayer() {
		return totalPlayer;
	}

	public final void setTotalPlayer(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}

	public Sport(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}
	
	public Sport() {

	}
	
}
