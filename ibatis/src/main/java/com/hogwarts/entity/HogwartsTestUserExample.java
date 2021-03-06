package com.hogwarts.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HogwartsTestUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public HogwartsTestUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameIsNull() {
            addCriterion("auto_create_case_job_name is null");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameIsNotNull() {
            addCriterion("auto_create_case_job_name is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameEqualTo(String value) {
            addCriterion("auto_create_case_job_name =", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameNotEqualTo(String value) {
            addCriterion("auto_create_case_job_name <>", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameGreaterThan(String value) {
            addCriterion("auto_create_case_job_name >", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("auto_create_case_job_name >=", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameLessThan(String value) {
            addCriterion("auto_create_case_job_name <", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameLessThanOrEqualTo(String value) {
            addCriterion("auto_create_case_job_name <=", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameLike(String value) {
            addCriterion("auto_create_case_job_name like", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameNotLike(String value) {
            addCriterion("auto_create_case_job_name not like", value, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameIn(List<String> values) {
            addCriterion("auto_create_case_job_name in", values, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameNotIn(List<String> values) {
            addCriterion("auto_create_case_job_name not in", values, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameBetween(String value1, String value2) {
            addCriterion("auto_create_case_job_name between", value1, value2, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andAutoCreateCaseJobNameNotBetween(String value1, String value2) {
            addCriterion("auto_create_case_job_name not between", value1, value2, "autoCreateCaseJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameIsNull() {
            addCriterion("start_test_job_name is null");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameIsNotNull() {
            addCriterion("start_test_job_name is not null");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameEqualTo(String value) {
            addCriterion("start_test_job_name =", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameNotEqualTo(String value) {
            addCriterion("start_test_job_name <>", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameGreaterThan(String value) {
            addCriterion("start_test_job_name >", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("start_test_job_name >=", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameLessThan(String value) {
            addCriterion("start_test_job_name <", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameLessThanOrEqualTo(String value) {
            addCriterion("start_test_job_name <=", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameLike(String value) {
            addCriterion("start_test_job_name like", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameNotLike(String value) {
            addCriterion("start_test_job_name not like", value, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameIn(List<String> values) {
            addCriterion("start_test_job_name in", values, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameNotIn(List<String> values) {
            addCriterion("start_test_job_name not in", values, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameBetween(String value1, String value2) {
            addCriterion("start_test_job_name between", value1, value2, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andStartTestJobNameNotBetween(String value1, String value2) {
            addCriterion("start_test_job_name not between", value1, value2, "startTestJobName");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdIsNull() {
            addCriterion("default_jenkins_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdIsNotNull() {
            addCriterion("default_jenkins_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdEqualTo(Integer value) {
            addCriterion("default_jenkins_id =", value, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdNotEqualTo(Integer value) {
            addCriterion("default_jenkins_id <>", value, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdGreaterThan(Integer value) {
            addCriterion("default_jenkins_id >", value, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_jenkins_id >=", value, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdLessThan(Integer value) {
            addCriterion("default_jenkins_id <", value, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdLessThanOrEqualTo(Integer value) {
            addCriterion("default_jenkins_id <=", value, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdIn(List<Integer> values) {
            addCriterion("default_jenkins_id in", values, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdNotIn(List<Integer> values) {
            addCriterion("default_jenkins_id not in", values, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdBetween(Integer value1, Integer value2) {
            addCriterion("default_jenkins_id between", value1, value2, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andDefaultJenkinsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("default_jenkins_id not between", value1, value2, "defaultJenkinsId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated do_not_delete_during_merge Wed May 05 23:02:23 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hogwarts_test_user
     *
     * @mbggenerated Wed May 05 23:02:23 CST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}