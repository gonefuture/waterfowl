package cn.zhku.waterfowl.pojo.mapper;

import cn.zhku.waterfowl.pojo.entity.UserRole;
import cn.zhku.waterfowl.pojo.entity.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int countByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int deleteByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Sun Feb 04 21:51:04 CST 2018
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);
}