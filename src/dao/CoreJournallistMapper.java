package dao;

import entity.CoreJournallist;
import entity.CoreJournallistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreJournallistMapper {
    int countByExample(CoreJournallistExample example);

    int deleteByExample(CoreJournallistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreJournallist record);

    int insertSelective(CoreJournallist record);

    List<CoreJournallist> selectByExample(CoreJournallistExample example);

    CoreJournallist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreJournallist record, @Param("example") CoreJournallistExample example);

    int updateByExample(@Param("record") CoreJournallist record, @Param("example") CoreJournallistExample example);

    int updateByPrimaryKeySelective(CoreJournallist record);

    int updateByPrimaryKey(CoreJournallist record);
    
    int getCountByWord(java.util.Map<String, String> map);
    
    CoreJournallist getJournalOneByOne(java.util.Map<String, String> map);
    
    void updateStateByName(CoreJournallist cj);
    
    void updateStateTo500(CoreJournallist cj);
    
    void updateStateTo200(CoreJournallist cj);
    
    void updateStateTo300(CoreJournallist cj);
    
    void updateStateTo400(CoreJournallist cj);
}