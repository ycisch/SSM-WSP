package com.cn.nuc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.RelationService;
import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.nuc.date.RelationDate;
import com.cn.nuc.pojo.Dlimit;
import com.cn.nuc.pojo.Groupheader;
import com.cn.nuc.pojo.Mark;
import com.cn.nuc.pojo.Relation;
import com.cn.nuc.pojo.Voqo;
import com.cn.nuc.service.AdminServer;

@RequestMapping("/target")
@Controller
public class Admin {

	//����Service----���ڵõ��±߱����Ϣ
	
	@Autowired
	private AdminServer adminServer;

	
	@RequestMapping("/login.do")
	public ModelAndView doTargetlogin(){
		// TODO Auto-generated method stub
		return new ModelAndView("login/login");
	}
	
	@RequestMapping("/admin1.do")
	public ModelAndView doTargetadmin(){
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		//System.out.println(admin);
		return new ModelAndView("adminpage/admin");
	}
	
	@RequestMapping("/adminWorkManage.do")
	public ModelAndView doTargetadminWorkManage(){
		// TODO Auto-generated method stub
		//添加标记信息
		RelationDate.list1 = new ArrayList<Mark>();
		RelationDate.list2 = new ArrayList<Mark>();
		RelationDate.list3 = new ArrayList<Mark>();
		RelationDate.list4 = new ArrayList<Mark>();
		RelationDate.list5 = new ArrayList<Mark>();
		RelationDate.list6 = new ArrayList<Mark>();
		RelationDate.list7 = new ArrayList<Mark>();
		RelationDate.list8 = new ArrayList<Mark>();
		RelationDate.MARK_INFO = new String[1000];
		List<Mark> list = adminServer.getMarkList();
		for (Mark mark : list) {
			RelationDate.MARK_INFO[mark.getNumber().intValue()] = mark.getPosition();
			if(mark.getMark() == 1) {
				//宿舍
				RelationDate.list1.add(mark);
			}
			else if(mark.getMark() == 6) {
				//大岗
				RelationDate.list6.add(mark);
			}
			else if(mark.getMark() == 2){
				//卫生队
				RelationDate.list2.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 3) {
				//教学楼
				RelationDate.list3.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 4) {
				//保洁队
				RelationDate.list4.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 5) {
				//龙山岗
				RelationDate.list5.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 8) {
				//学院
				RelationDate.list8.add(mark);
			}
		}
		
		
		//System.out.println("@@@@@@@");
		return new ModelAndView("adminpage/adminWorkManage");
	}
	
	@RequestMapping("/adminWorkForm.do")
	public ModelAndView doTargetadminWorkForm(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminWorkForm");
	}
	
	@RequestMapping("/adminSalaryForm.do")
	public ModelAndView doTargetadminSalaryForm(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminSalaryForm");
	}
	
	@RequestMapping("/adminBehaviorForm.do")
	public ModelAndView doTargetadminBehaviorForm(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminBehaviorForm");
	}
	
	/*==========添加标记开始===================*/
	
	@RequestMapping("/addMark.do")
	public String addMark(Model model,Mark mark) {
		
		adminServer.addMark(mark);
		return "redirect:adminFillInMark.do";
	}
	
	@RequestMapping("/adminFillInMark.do")
	public String doTargetadminFillInMark(Model model){
		// TODO Auto-generated method stub
		
		List<Mark> list = adminServer.getMarkList();
		

		model.addAttribute("markList", list);
		
		return "adminpage/adminFillInMark";
	}
	
	/*=============添加标记结束=====================*/
	
	/*=============添加关系开始=====================*/
	
	@RequestMapping("addRelation.do")
	public String addRelation(Model mode,String[] test,Relation relation) {
		
		int len = test.length;
		for (String string : test) {
			//System.out.println(string);
		}
		
		relation.setList(test);
		
		//字符串数组转字符串
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < len; i++){
		 sb. append(test[i]);
		 if(i!=len-1) sb.append(",");
		}
		relation.setRelation(sb.toString());
		//添加宿舍以及岗位类型编号，以及区域划分
		//System.out.println(relation);
		adminServer.addRelation(relation);
		
		return "redirect:adminFillInRelation.do";
	}
	//====================添加关系结束=================
	
	//====================修改关系====================
	@RequestMapping("/updaterelation.do")
	public String updateRelation(Model mode,Voqo voqo) {
		//System.out.println(voqo);
		Relation relation = new Relation();
		int num = -1,num1 = -1,len = RelationDate.MARK_INFO.length;
		for(int i = 0; i < len; i++) {
			if(voqo.getBnumber().trim().equals(RelationDate.MARK_INFO[i]) && num==-1) {
				num = i;
			}
			if(voqo.getDnumber().trim().equals(RelationDate.MARK_INFO[i]) && num1==-1) {
				num1 = i;
			}
		}
		if(num == -1 || num1 == -1) {
			System.out.println("输入错误");
			
		}
		else {
			relation.setBnumber((long)num);
			relation.setDnumber((long)num1);
			relation.setId(voqo.getId());
			relation.setRelation(voqo.getRelation());
			
			adminServer.updateRelation(relation);
		}
		
		
		return "redirect:adminFillInRelation.do";
	}
	
	//==================修改关系结束===============
	
	//=================关系总跳转=================
	@RequestMapping("/adminFillInRelation.do")
	public String doTargetadminFillInRelation(Model model){
		// TODO Auto-generated method stub
		

		//获取联系信息  同时获得标记信息
		List<Relation> list = adminServer.getRelationList();
		for (Relation relation : list) {
			String[] s = relation.getRelation().split(",");
			int len = s.length;
			for(int i = 0; i < len; i++) {
				s[i] = RelationDate.MARK_INFO[Integer.parseInt(s[i])]+"   "+Integer.parseInt(s[i]);
			}
			relation.setList(s);
			relation.setName(RelationDate.MARK_INFO[relation.getDnumber().intValue()]);
			relation.setName1(RelationDate.MARK_INFO[relation.getBnumber().intValue()]);
		}
		
		for (Relation relation : list) {
			//System.out.println(relation);
		}
		
		
		
		model.addAttribute("list1", RelationDate.list1);
		model.addAttribute("list2", RelationDate.list2);
		model.addAttribute("list3", RelationDate.list3);
		model.addAttribute("list4", RelationDate.list4);
		model.addAttribute("list5", RelationDate.list5);
		model.addAttribute("list6", RelationDate.list6);
		model.addAttribute("relationlist", list);
		model.addAttribute("mark", RelationDate.MARK_INFO);
		
		return "adminpage/adminFillInRelation";
	}
	//====================关系总跳转结束====================
	
	//=====================添加组长=======================
	@RequestMapping("/addHeader.do")
	public String addHeader(Model model,Groupheader groupheader) {
		System.out.println(groupheader);
		groupheader.setArea(RelationDate.MARK_INFO[groupheader.getAnumber().intValue()]);
		groupheader.setCount(30L);
		adminServer.addGroupHeader(groupheader);
		
		return "redirect:adminFillInGroupheader.do";
	}
	
	//====================添加时间结束=================
	
	//====================删除组长事件================
	
	@RequestMapping("/deleteHeader.do")
	public String deleteHeader(Groupheader groupheader) {
		//删除操作
		//传值进来
		System.out.println(groupheader);
		adminServer.deleteGrounpHeader(groupheader);
		
		return "redirect:adminFillInGroupheader.do"; 
	}
	 
	
	//=====================删除组长事件结束==============
	
	@RequestMapping("/adminFillInGroupheader.do")
	public String doTargetadminFillInGroupheader(Model model){
		// TODO Auto-generated method stub
		List<Groupheader> list = adminServer.getGroupHeader();
		for (Groupheader groupheader : list) {
			//System.out.println(groupheader);
		}
		model.addAttribute("liststudent",adminServer.getStudent());
		model.addAttribute("list7", RelationDate.list7);
		model.addAttribute("grouplist", list);
		//return "adminpage/adminSalaryForm";
		return "adminpage/adminFillInGroupheader";
	}
	
	//=====================组长事件结束***************
	
	//=====================添加每个院限制的人数=========
	@RequestMapping("/addDlimit.do")
	public String addDlimit(Model model,Dlimit dlimit) {
		
		String bh = "";
		for(Mark mark: RelationDate.list6) {
			bh += mark.getNumber();
			bh+=",";
		}
		bh = bh.substring(0, bh.length()-2);
		dlimit.setArrbnumber(bh);
		System.out.println(dlimit);
		adminServer.addDlimit(dlimit);
		
		return "redirect:adminFillInDlimit.do";
	}
	
	
	
	@RequestMapping("/updateDlimit.do")
	public String updateDlimit(Model model,Dlimit dlimit) {
		System.out.println(dlimit);
		adminServer.updateDlimit(dlimit);
		return "redirect:adminFillInDlimit.do";
	}
	
	@RequestMapping("/adminFillInDlimit.do")
	public String doTargetadminFillInDlimit(Model model){
		// TODO Auto-generated method stub
		
		//获取所有院系标签
		//已经保存到了RealationDate中
		
		//获得所有院的限制情况
		List<Dlimit> list = adminServer.getDlimit();
		for (Dlimit dlimit : list) {
			System.out.println(dlimit);
		}
		model.addAttribute("dlimit", list);
		model.addAttribute("list8", RelationDate.list8);
		model.addAttribute("list6", RelationDate.list6);
		return "adminpage/adminFillInDlimit";
	}
	
	
	//=====================添加结束=============
	
	@RequestMapping("/student.do")
	public ModelAndView doTargetstudent(){
		// TODO Auto-generated method stub
		return new ModelAndView("studentpage/student");
	}
	
	@RequestMapping("/stuMountGuard.do")
	public ModelAndView doTargetstuMountGuard(){
		// TODO Auto-generated method stub
		return new ModelAndView("studentpage/stuMountGuard");
	}
	
	@RequestMapping("/stuPersonalInfo.do")
	public ModelAndView doTargetstuPersonalInfo(){
		// TODO Auto-generated method stub
		return new ModelAndView("studentpage/stuPersonalInfo");
	}
	
	

	
	@RequestMapping("/groupHeader.do")
	public ModelAndView doTargetgroupHeader(){
		// TODO Auto-generated method stub
		return new ModelAndView("groupheaderpage/groupHeader");
	}
	
	@RequestMapping("/myTeamMember.do")
	public ModelAndView doTargetmyTeamMember(){
		// TODO Auto-generated method stub
		return new ModelAndView("groupheaderpage/myTeamMember");
	}
	
	@RequestMapping("/fillInDaily.do")
	public ModelAndView doTargetfillInDaily(){
		// TODO Auto-generated method stub
		return new ModelAndView("groupheaderpage/fillInDaily");
	}
	
	@RequestMapping("/fillInSalary.do")
	public ModelAndView doTargetfillInSalary(){
		// TODO Auto-generated method stub
		return new ModelAndView("groupheaderpage/fillInSalary");
	}
	
	@RequestMapping("/fillInYourExperience.do")
	public ModelAndView doTargetfillInYourExperience(){
		// TODO Auto-generated method stub
		return new ModelAndView("groupheaderpage/fillInYourExperience");
	}
	
}
