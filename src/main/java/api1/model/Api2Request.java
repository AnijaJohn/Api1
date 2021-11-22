package api1.model;

import java.sql.Date;
import java.time.LocalDate;

public class Api2Request {
	

	private  Long rid;
	private String rname;
private String rdob;
	
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
	public String getRdob() {
	return rdob;
}
	
	public void setRdob(String rdob) {
		LocalDate date=LocalDate.of(Integer.parseInt(rdob.substring(6,10)),
		Integer.parseInt(rdob.substring(3,5)), Integer.parseInt(rdob.substring(0,2)));
		this.rdob = date.toString();
		}

//	public void setRdob(String date) {
//		this.rdob = date;
//	}
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
