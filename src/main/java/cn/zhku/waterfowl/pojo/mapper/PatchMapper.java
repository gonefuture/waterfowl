package cn.zhku.waterfowl.pojo.mapper;

import cn.zhku.waterfowl.pojo.entity.Patch;
import cn.zhku.waterfowl.pojo.entity.PatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int countByExample(PatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int deleteByExample(PatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int insert(Patch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int insertSelective(Patch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    List<Patch> selectByExample(PatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    Patch selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") Patch record, @Param("example") PatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int updateByExample(@Param("record") Patch record, @Param("example") PatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int updateByPrimaryKeySelective(Patch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patch
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int updateByPrimaryKey(Patch record);
}