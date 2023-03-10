package entities;

public class Bill {

	public char gender;
	public int beer, barbecue, softDrink;
	

	public double feeding() {
		return beer * 5 + softDrink * 3 + barbecue * 7;

	}

	public double ticket() {
		if (gender == 'M') {
			return 10.00;
		} else {
			return 8.00;
		}
	}

	public double cover() {
		if (feeding() > 30) {
			return 0.00;
		} else {
			return 4.00;
		}
	}

	public double total() {
		return feeding() + cover() + ticket();
	}

}
