package com.cn.nuc.service;

import java.util.List;

import com.cn.nuc.pojo.Worktable;

public interface GroupServer {
	//获取组长与成员关联表
	public void selectByStudent();
	
	//对没有分配完成的学生进行二次分配
	public void displayStudentAgin(List<Worktable> list);
	
}
