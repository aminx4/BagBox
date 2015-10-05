package bagbox.beans;

public class Account {

	
	private String id;
	
	private boolean State;
	private String password;
	
	
	public boolean isState() {
		return State;
	}
	public void setState(boolean state) {
		State = state;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
