package dao;

import entity.CoreResult;
import entity.CoreResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreResultMapper {
    int countByExample(CoreResultExample example);

    int deleteByExample(CoreResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoreResult record);

    int insertSelective(CoreResult record);

    List<CoreResult> selectByExampleWithBLOBs(CoreResultExample example);

    List<CoreResult> selectByExample(CoreResultExample example);

    CoreResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoreResult record, @Param("example") CoreResultExample example);

    int updateByExampleWithBLOBs(@Param("record") CoreResult record, @Param("example") CoreResultExample example);

    int updateByExample(@Param("record") CoreResult record, @Param("example") CoreResultExample example);

    int updateByPrimaryKeySelective(CoreResult record);

    int updateByPrimaryKeyWithBLOBs(CoreResult record);

    int updateByPrimaryKey(CoreResult record);
}