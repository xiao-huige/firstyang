package cn.com.ssm.po;

import java.util.Date;
import java.util.List;

public class Orders {
	public int id;
	public int userId;
	public String number;
	public Date createtime;
	public String note;
	// 使用resultmap 向内 进行关联查询
	private User user;
	// 使用resultMap  一对多 （一是本类 ，多是 orderDetail orderId 是orderDetail的外键）
	private List<OrderDetail> orderdetails;
    
	public List<OrderDetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<OrderDetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + ", user=" + user + ", orderdetails=" + orderdetails + ", getOrderdetails()="
				+ getOrderdetails() + ", getUser()=" + getUser() + ", getId()=" + getId() + ", getUserId()="
				+ getUserId() + ", getNumber()=" + getNumber() + ", getCreatetime()=" + getCreatetime() + "]";
	}




}
