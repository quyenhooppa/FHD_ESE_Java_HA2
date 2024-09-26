package HA2;

public class Car {
	private int id;
	private int Make;
	private String Model;
	private int YearofManufacture;
	private String Color;
	private double Price;
	private int RegistrationNumber;
	
	Car(int id){
		setId(id);
		System.out.println("id: " + id);
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", Make=" + Make + ", Model=" + Model + ", YearofManufacture=" + YearofManufacture
				+ ", Color=" + Color + ", Price=" + Price + ", RegistrationNumber=" + RegistrationNumber + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMake() {
		return Make;
	}

	public void setMake(int make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYearofManufacture() {
		return YearofManufacture;
	}

	public void setYearofManufacture(int yearofManufacture) {
		YearofManufacture = yearofManufacture;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getRegistrationNumber() {
		return RegistrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		RegistrationNumber = registrationNumber;
	};
}
