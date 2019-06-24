package com.cn.nuc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.nuc.dao.DlimitMapper;
import com.cn.nuc.dao.GroupheaderMapper;
import com.cn.nuc.dao.MarkMapper;
import com.cn.nuc.dao.RelationMapper;
import com.cn.nuc.dao.StudentMapper;
import com.cn.nuc.pojo.Dlimit;
import com.cn.nuc.pojo.Groupheader;
import com.cn.nuc.pojo.Mark;
import com.cn.nuc.pojo.Relation;
import com.cn.nuc.pojo.Student;
import com.cn.nuc.pojo.Worktable;
import com.cn.nuc.service.AdminServer;

@Service
public class AdminServerImpl implements AdminServer {

	@Autowired
	private DlimitMapper dlimitMapper;
	
	@Autowired
	private MarkMapper markMapper;
	
	@Autowired
	private RelationMapper relationMapper;
	
	@Autowired
	private GroupheaderMapper groupheaderMapper;
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public void st() {
		System.out.println("希望你可以运行");
	}

	@Override
	public List<Worktable> getListWorkTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mark> getMarkList() {
		// TODO Auto-generated method stub
		return markMapper.selectByExample(null);
	}

	@Override
	public List<Relation> getRelationList() {
		// TODO Auto-generated method stub
		return relationMapper.selectByExample(null);
	}

	@Override
	public List<Groupheader> getGroupHeader() {
		// TODO Auto-generated method stub
		return groupheaderMapper.selectByStudent_One();
	}

	@Override
	public void addMark(Mark mark) {
		// TODO Auto-generated method stub
		markMapper.insert(mark);
	}

	@Override
	public void addRelation(Relation relation) {
		// TODO Auto-generated method stub
		relationMapper.insert(relation);
	}

	@Override
	public void addGroupHeader(Groupheader groupheader) {
		// TODO Auto-generated method stub
		groupheaderMapper.insertSelective(groupheader);
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentMapper.selectByExample(null);
	}

	@Override
	public void updateRelation(Relation relation) {
		// TODO Auto-generated method stub
		relationMapper.updateByPrimaryKey(relation);
	}

	@Override
	public void deleteGrounpHeader(Groupheader groupheader) {
		// TODO Auto-generated method stub
		groupheaderMapper.deleteByPrimaryKey(groupheader.getGid());
	}

	@Override
	public List<Dlimit> getDlimit() {
		// TODO Auto-generated method stub
		return dlimitMapper.selectByName();
	}

	@Override
	public void addDlimit(Dlimit dlimit) {
		// TODO Auto-generated method stub
		dlimitMapper.insertSelective(dlimit);
	}

	@Override
	public void updateDlimit(Dlimit dlimit) {
		// TODO Auto-generated method stub
		dlimitMapper.updateByPrimaryKeySelective(dlimit);
	}


}
