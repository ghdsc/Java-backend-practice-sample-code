package test;

public class Laptop {
	private Integer lid;
	private String lname;
	private String lmodel;
	

	public Laptop(Integer lid, String lname, String lmodel) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lmodel = lmodel;
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLmodel() {
		return lmodel;
	}

	public void setLmodel(String lmodel) {
		this.lmodel = lmodel;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lmodel=" + lmodel + "]";
	}

}

