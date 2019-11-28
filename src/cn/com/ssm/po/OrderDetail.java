package cn.com.ssm.po;

public class OrderDetail {
    
	private int id;
	private int orderId;
	
	private int itemsId;
	private int itemsNum;
	
	//resultMap 一对一 
	private Items items;
	
	//resultMap 一对一   一是本类   一是item itemid为 本类外键
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemsId() {
		return itemsId;
	}
	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}
	public int getItemsNum() {
		return itemsNum;
	}
	public void setItems_num(int itemsNum) {
		this.itemsNum = itemsNum;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orderId=" + orderId + ", itemsId=" + itemsId + ", itemsNum="
				+ itemsNum + ", items=" + items + "]";
	}
	
	
	
}
