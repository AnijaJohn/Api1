package api1.model;

import java.sql.Date;

public class Api2Request {
	

	private  Long rid;
	private String rname;
	private Date rdob;
	private String remail;
	private String rmobno;
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Date getRdob() {
		return rdob;
	}
	public void setRdob(Date rdob) {
		this.rdob = rdob;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public String getRmobno() {
		return rmobno;
	}
	public void setRmobno(String rmobno) {
		this.rmobno = rmobno;
	}
	
	

}
