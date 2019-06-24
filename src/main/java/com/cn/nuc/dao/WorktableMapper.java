package com.cn.nuc.dao;

import com.cn.nuc.pojo.Worktable;
import com.cn.nuc.pojo.WorktableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorktableMapper {
    int countByExample(WorktableExample example);

    int deleteByExample(WorktableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Worktable record);

    int insertSelective(Worktable record);

    List<Worktable> selectByExample(WorktableExample example);
    
    List<Worktable> selectByStudent();

    Worktable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Worktable record, @Param("example") WorktableExample example);

    int updateByExample(@Param("record") Worktable record, @Param("example") WorktableExample example);

    int updateByPrimaryKeySelective(Worktable record);

    int updateByPrimaryKey(Worktable record);
}