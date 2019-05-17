package entities.Enum;

public enum OrderStatus {
	
	PENDING_PAYMENT(0), PROCESSING(1) , SHIPPED(2) , DELIVERED(3);
	
	public int order;

	private OrderStatus(int order) {
		this.order = order;
	}
	
		
}
