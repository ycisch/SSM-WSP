package com.cn.nuc.dao;

import com.cn.nuc.pojo.Dlimit;
import com.cn.nuc.pojo.DlimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlimitMapper {
    int countByExample(DlimitExample example);

    int deleteByExample(DlimitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dlimit record);

    int insertSelective(Dlimit record);

    List<Dlimit> selectByExample(DlimitExample example);

    Dlimit selectByPrimaryKey(Long id);
    
    List<Dlimit> selectByName();

    int updateByExampleSelective(@Param("record") Dlimit record, @Param("example") DlimitExample example);

    int updateByExample(@Param("record") Dlimit record, @Param("example") DlimitExample example);

    int updateByPrimaryKeySelective(Dlimit record);

    int updateByPrimaryKey(Dlimit record);
}