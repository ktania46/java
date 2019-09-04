
public class Seller {
	String id;
	String name;
	String price;
    Buyer buyer;
    
	public Seller(String id, String name, String price, Buyer buyer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.buyer = buyer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", price=" + price + ", buyer=" + buyer + "]";
	}
	
}