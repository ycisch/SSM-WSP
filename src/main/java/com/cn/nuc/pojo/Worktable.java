package com.cn.nuc.pojo;

public class Worktable {
    private Long id;

    private Long sid;

    private Long bnumber;

    private String anumber;
    
    private Student student;
    
    

    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getBnumber() {
        return bnumber;
    }

    public void setBnumber(Long bnumber) {
        this.bnumber = bnumber;
    }

    public String getAnumber() {
        return anumber;
    }

    public void setAnumber(String anumber) {
        this.anumber = anumber == null ? null : anumber.trim();
    }
    
    

	@Override
	public String toString() {
		return "Worktable [id=" + id + ", sid=" + sid + ", bnumber=" + bnumber + ", anumber=" + anumber + "]";
	}
    
    
}