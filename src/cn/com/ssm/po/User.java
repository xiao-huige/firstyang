package cn.com.ssm.po;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private int id;

	private String name;

	private String sex;

	private String address;
	//resultMap 一对多（一是本类 ，多是order ，userId 是order中的外键）
	private List<Orders> orderslist;

	public List<Orders> getOrderslist() {
		return orderslist;
	}

	public void setOrderslist(List<Orders> orderslist) {
		this.orderslist = orderslist;
	}

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", address=" + address + ", orderslist="
				+ orderslist + "]";
	}

//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", orderslist=" + orderslist + "]";
//	}

	
}
