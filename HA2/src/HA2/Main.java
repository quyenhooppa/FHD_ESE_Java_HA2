package HA2;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void givenBrand(Car[] arr, String brand) throws IOException {
		Car[] arrBrand = new Car[arr.length];
		BufferedWriter output = null;
		int num = 0;
		
		try {
	      File file = new File(brand + "Car.txt");
	      if (!file.createNewFile()) {
	    	file.delete();
	    	file.createNewFile();
	      }
	      output = new BufferedWriter(new FileWriter(file));
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
		System.out.println("BRAND: " + brand);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getModel().equals(brand)) {
				arrBrand[num++] = arr[i]; 
				System.out.println(arrBrand[num-1].toString());
				output.write(arrBrand[num-1].toString()+"\n");
			}
		}
		output.close();
		System.out.println();
	}

	public static void givenBrandUsedMoreNYears(Car[] arr, String brand, int years) throws IOException {
		Car[] arrBrand = new Car[arr.length];
		BufferedWriter output = null;
		int num = 0;
		int usedYears;
		
		try {
	      File file = new File(brand + "Car" + years + "Years.txt");
	      if (!file.createNewFile()) {
	    	file.delete();
	    	file.createNewFile();
	      }
	      output = new BufferedWriter(new FileWriter(file));
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
		System.out.println("BRAND: " + brand + " - Years: " + years);
		for (int i = 0; i < arr.length; i++) {
			usedYears = 2024 - arr[i].getMake();
			if ((arr[i].getModel().equals(brand)) && (usedYears > years)) {
				arrBrand[num++] = arr[i]; 
				System.out.println(arrBrand[num-1].toString());
				output.write(arrBrand[num-1].toString()+"\n");
			}
		}
		output.close();
		System.out.println();
	}
	
	public static void givenManufactureYears(Car[] arr, int years, double price) throws IOException {
		Car[] arrBrand = new Car[arr.length];
		BufferedWriter output = null;
		int num = 0;
		
		try {
	      File file = new File("CarIn" + years + "YearsWith" + price + "USD.txt");
	      if (!file.createNewFile()) {
	    	file.delete();
	    	file.createNewFile();
	      }
	      output = new BufferedWriter(new FileWriter(file));
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
		System.out.println("Years: " + years + " - Price: " + price);
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].getYearofManufacture() == years) && (arr[i].getPrice() == price)) {
				arrBrand[num++] = arr[i]; 
				System.out.println(arrBrand[num-1].toString());
				output.write(arrBrand[num-1].toString()+"\n");
			}
		}
		output.close();
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Car[] arrOfCars = new Car[6];
		for (int i = 0; i < arrOfCars.length; i++) {
			arrOfCars[i] = new Car(i);
		}

		//
		arrOfCars[0].setMake(2010);
		arrOfCars[0].setModel("BMW");
		arrOfCars[0].setYearofManufacture(2008);
		arrOfCars[0].setColor("Blue");
		arrOfCars[0].setPrice(10000);
		arrOfCars[0].setRegistrationNumber(2798);
		
		//
		arrOfCars[1].setMake(2015);
		arrOfCars[1].setModel("Suzuki");
		arrOfCars[1].setYearofManufacture(2012);
		arrOfCars[1].setColor("White");
		arrOfCars[1].setPrice(8000);
		arrOfCars[1].setRegistrationNumber(5647);
		
		//
		arrOfCars[2].setMake(2014);
		arrOfCars[2].setModel("BMW");
		arrOfCars[2].setYearofManufacture(2012);
		arrOfCars[2].setColor("Black");
		arrOfCars[2].setPrice(13000);
		arrOfCars[2].setRegistrationNumber(4832);
		
		//
		arrOfCars[3].setMake(2009);
		arrOfCars[3].setModel("Suzuki");
		arrOfCars[3].setYearofManufacture(2008);
		arrOfCars[3].setColor("White");
		arrOfCars[3].setPrice(6000);
		arrOfCars[3].setRegistrationNumber(1702);
		
		//
		arrOfCars[4].setMake(2015);
		arrOfCars[4].setModel("Mercedes");
		arrOfCars[4].setYearofManufacture(2013);
		arrOfCars[4].setColor("Orange");
		arrOfCars[4].setPrice(15000);
		arrOfCars[4].setRegistrationNumber(5643);
		
		//
		arrOfCars[5].setMake(2022);
		arrOfCars[5].setModel("BMW");
		arrOfCars[5].setYearofManufacture(2020);
		arrOfCars[5].setColor("White");
		arrOfCars[5].setPrice(15000);
		arrOfCars[5].setRegistrationNumber(8648);
		
		// Print Info
		for (int i = 0; i < arrOfCars.length; i++) {
			System.out.println(arrOfCars[i].toString());
		}
		System.out.println();
		
		System.out.println("**************************");
		// a) a list of cars of a given brand
		System.out.println("Cars of a given brand\n");
		givenBrand(arrOfCars, "BMW");
		givenBrand(arrOfCars, "Suzuki");
		givenBrand(arrOfCars, "Mercedes");
		
		System.out.println("**************************");
		// b)  a list of cars of a given model that have been in use for more than n years
		System.out.println("Cars of a given model that have been in use for more than n years\n");
		givenBrandUsedMoreNYears(arrOfCars, "Suzuki", 13);
		givenBrandUsedMoreNYears(arrOfCars, "BMW", 8);
		
		System.out.println("**************************");
		// c)  a list of cars of a given year of manufacture, 
		// the price of which is higher than the specified one
		System.out.println("Cars of a given year of manufacture, the price of which is higher than the specified one\n");
		givenManufactureYears(arrOfCars, 2012, 8000);
		givenManufactureYears(arrOfCars, 2008, 10000);
		givenManufactureYears(arrOfCars, 2020, 18000);
	}
}