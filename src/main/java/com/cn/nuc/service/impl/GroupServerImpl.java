package com.cn.nuc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.nuc.dao.GroupheaderMapper;

import com.cn.nuc.pojo.Groupheader;
import com.cn.nuc.pojo.Worktable;
import com.cn.nuc.service.GroupServer;

@Service
public class GroupServerImpl implements GroupServer{

	@Autowired
	private GroupheaderMapper groupheaderMapper;
	
	public void selectByStudent() {
		// TODO Auto-generated method stub
		List<Groupheader> list = groupheaderMapper.selectByStudent();
		for (Groupheader groupheader : list) {
			System.out.println(groupheader);
		}
	}

	public void displayStudentAgin(List<Worktable> list) {
		// TODO Auto-generated method stub
		//����worktable��û�з����ѧ���ڴ˽��з���
		//�������һ����ֲ���

	}


}
