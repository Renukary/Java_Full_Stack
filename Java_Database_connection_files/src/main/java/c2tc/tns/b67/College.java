package c2tc.tns.b67;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class College {
	@Id
    
	private Integer id;
	private String college_name;
	private String location;
	
	public College()
	{
	}
	public College(Integer id, String collegeName, String location, String college_name)
	{
	this.id = id;
	this.college_name = college_name;
	this.location =location;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getcollege_name() {
		return college_name;
	}
	public void setCollegeName(String college_name) {
		this.college_name = college_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", college_name=" + college_name + ", location=" + location + "]";
	}
	
	
}
