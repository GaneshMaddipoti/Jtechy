package in.co.jtechy.web.models;

import java.sql.Timestamp;

public class User {

	private Integer id;
    private String name;
    private String password;
    private boolean active;
    private Timestamp createDate;
    private Timestamp updateDate;

    public User() {
    }

	public User(Integer id, String name, String password, boolean active,
			Timestamp createDate, Timestamp updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.active = active;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}
