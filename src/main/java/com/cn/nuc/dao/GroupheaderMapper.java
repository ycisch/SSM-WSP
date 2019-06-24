package com.cn.nuc.dao;

import com.cn.nuc.pojo.Groupheader;
import com.cn.nuc.pojo.GroupheaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupheaderMapper {
    int countByExample(GroupheaderExample example);

    int deleteByExample(GroupheaderExample example);

    int deleteByPrimaryKey(Long gid);

    int insert(Groupheader record);

    int insertSelective(Groupheader record);

    List<Groupheader> selectByExample(GroupheaderExample example);
    
    List<Groupheader> selectByStudent();
    
    List<Groupheader> selectByStudent_One();

    Groupheader selectByPrimaryKey(Long gid);

    int updateByExampleSelective(@Param("record") Groupheader record, @Param("example") GroupheaderExample example);

    int updateByExample(@Param("record") Groupheader record, @Param("example") GroupheaderExample example);

    int updateByPrimaryKeySelective(Groupheader record);

    int updateByPrimaryKey(Groupheader record);
}