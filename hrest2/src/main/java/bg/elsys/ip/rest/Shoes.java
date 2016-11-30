package bg.elsys.ip.rest;

import io.swagger.annotations.ApiModelProperty;

public class Shoes {

	@ApiModelProperty(required = true)
	String brand = null;
	String model = null;
	String color = null;
	String materialMadeFrom = null;
	int season = 0;

	int number = 0;

	int price = 0;

	public Shoes() {

	}

	public Shoes(String brand, String model, String color, String materialMadeFrom, int season, int number, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.materialMadeFrom = materialMadeFrom;
		this.season = season;
		this.number = number;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shoes [brand=" + brand + ", model=" + model + ", color=" + color + ", materialMadeFrom="
				+ materialMadeFrom + ", season=" + season + ", number=" + number + ", price=" + price + "]";
	}

	public String getManufacturer() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterialMadeFrom() {
		return materialMadeFrom;
	}

	public void setMaterialMadeFrom(String materialMadeFrom) {
		this.materialMadeFrom = materialMadeFrom;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
