package jenembed.com;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bikes 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bid;
	private String model;
	private int milage, price;
	@Override
	public String toString() {
		return "Bikes [bid=" + bid + ", model=" + model + ", milage=" + milage + ", price=" + price + "]";
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
