package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.CourseTables;

public interface CourseTablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_tables
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer courseTablesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_tables
     *
     * @mbggenerated
     */
    int insert(CourseTables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_tables
     *
     * @mbggenerated
     */
    int insertSelective(CourseTables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_tables
     *
     * @mbggenerated
     */
    CourseTables selectByPrimaryKey(Integer courseTablesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_tables
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CourseTables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_tables
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CourseTables record);
}