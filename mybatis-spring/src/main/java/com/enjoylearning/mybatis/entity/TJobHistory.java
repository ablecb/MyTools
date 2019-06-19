package com.enjoylearning.mybatis.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_job_history
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TJobHistory extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_job_history.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_job_history.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_job_history.comp_name
     *
     * @mbg.generated
     */
    private String compName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_job_history.years
     *
     * @mbg.generated
     */
    private Integer years;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_job_history.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_job_history.id
     *
     * @return the value of t_job_history.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_job_history.id
     *
     * @param id the value for t_job_history.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_job_history.user_id
     *
     * @return the value of t_job_history.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_job_history.user_id
     *
     * @param userId the value for t_job_history.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_job_history.comp_name
     *
     * @return the value of t_job_history.comp_name
     *
     * @mbg.generated
     */
    public String getCompName() {
        return compName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_job_history.comp_name
     *
     * @param compName the value for t_job_history.comp_name
     *
     * @mbg.generated
     */
    public void setCompName(String compName) {
        this.compName = compName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_job_history.years
     *
     * @return the value of t_job_history.years
     *
     * @mbg.generated
     */
    public Integer getYears() {
        return years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_job_history.years
     *
     * @param years the value for t_job_history.years
     *
     * @mbg.generated
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_job_history.title
     *
     * @return the value of t_job_history.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_job_history.title
     *
     * @param title the value for t_job_history.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }
}