package cn.com.ssm.po;

public class OrderCustom extends Orders {
    //resultType 向外 POJO 增加属性
	private String name;
	private String sex;

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
		return "OrderCustom [name=" + name + ", sex=" + sex + ", id=" + id + ", userId=" + userId
				+ ", number=" + number + ", createtime=" + createtime + ", note=" + note + "]";
	}

}
