
import java.text.SimpleDateFormat;
import java.util.Date;


public class Product {

	private String productId, name;
	private Date expiryDate;
	private Double price;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	

	public Product() {
		super();
	}

	public Product(String productId, String name, Date expiryDate, Double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.expiryDate = expiryDate;
		this.price = price;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "Product Id:" + productId + "\nName:" + name + "\nExpiry Date:" + sdf.format(expiryDate) + "\nPrice:" + price;
	}

	@Override
	public boolean equals(Object o) {
		Product p= (Product) o;
		return (productId.equals(p.productId)&&name.equalsIgnoreCase(p.name));
	}
	
	

}
