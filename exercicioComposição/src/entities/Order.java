package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enum.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	SimpleDateFormat sdfDateHour = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItem() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment:"+sdfDateHour.format(moment)+"\n");
		sb.append("Order statud:"+status\n+"");
		sb.append("Order items:\n");
		Double total = 0.0;
		for(OrderItem i : items) {
			sb.append(i.toString()+"\n");
			total += i.subTotal();
		}
		sb.append("Total price:"+String.format("%.2f",total));
		return sb.toString();
	}
	
}
