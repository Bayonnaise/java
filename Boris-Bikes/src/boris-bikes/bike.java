package boris-bikes;

public class bike {
	boolean broken = false;

	void break() {
		broken = true;
	}

	void fix() {
		broken = false;
	}
}