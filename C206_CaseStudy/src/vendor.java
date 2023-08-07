public class vendor  {
	private String name;
	private String location;
	private String contractEnd;
	public vendor(String name, String location, String contractEnd) {
		this.name = name;
		this.location = location;
		this.contractEnd = contractEnd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContractEnd() {
		return contractEnd;
	}
	public void setContractEnd(String contractEnd) {
		this.contractEnd = contractEnd;
	}



}
