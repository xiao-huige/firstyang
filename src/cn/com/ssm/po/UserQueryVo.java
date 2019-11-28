package cn.com.ssm.po;

import java.util.List;
//包装类
public class UserQueryVo {
	private UserCustom usercustom;
	//包装其他的查询条件
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public UserCustom getUsercustom() {
		return usercustom;
	}

	public void setUsercustom(UserCustom usercustom) {
		this.usercustom = usercustom;
	}

}
