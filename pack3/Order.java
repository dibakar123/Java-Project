import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Order {
	private Integer orderNo;
	private String paymentType;
	private Double amount;
	private Date purchaseddate;

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getPurchaseddate() {
		return purchaseddate;
	}

	public void setPurchaseddate(Date purchaseddate) {
		this.purchaseddate = purchaseddate;
	}

	public Order() {
		super();
	}

	public Order(Integer orderNo, String paymentType, Double amount, Date purchaseddate) {
		super();
		this.orderNo = orderNo;
		this.paymentType = paymentType;
		this.amount = amount;
		this.purchaseddate = purchaseddate;
	}

	static Map<String, Integer> typeWiseCount(List<Order> list) {
		Map<String, Integer> ret= new TreeMap<String,Integer>();
		for(Order o:list) {
			if(ret.containsKey(o.getPaymentType())) {
				int val= ret.get(o.getPaymentType()).intValue()+1;
				ret.put(o.getPaymentType(), val);
			}
			else
				ret.put(o.getPaymentType(),1);
		}
		return ret;
	}
}
