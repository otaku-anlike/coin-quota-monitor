package wang.raye.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MacdCrossCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    protected String groupByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public MacdCrossCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public void setGroupByClause(String groupByClause) {
        this.groupByClause = groupByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public String getGroupByClause() {
        return groupByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
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
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table macd_cross
     *
     * @mbg.generated
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

        public Criteria andExchangeIsNull() {
            addCriterion("exchange is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNotNull() {
            addCriterion("exchange is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeEqualTo(String value) {
            addCriterion("exchange =", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotEqualTo(String value) {
            addCriterion("exchange <>", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThan(String value) {
            addCriterion("exchange >", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("exchange >=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThan(String value) {
            addCriterion("exchange <", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThanOrEqualTo(String value) {
            addCriterion("exchange <=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLike(String value) {
            addCriterion("exchange like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotLike(String value) {
            addCriterion("exchange not like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeIn(List<String> values) {
            addCriterion("exchange in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotIn(List<String> values) {
            addCriterion("exchange not in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeBetween(String value1, String value2) {
            addCriterion("exchange between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotBetween(String value1, String value2) {
            addCriterion("exchange not between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNull() {
            addCriterion("symbol is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("symbol is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("symbol =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("symbol <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("symbol >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("symbol >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("symbol <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("symbol <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("symbol like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("symbol not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("symbol in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("symbol not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("symbol between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("symbol not between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andQuota1IsNull() {
            addCriterion("quota1 is null");
            return (Criteria) this;
        }

        public Criteria andQuota1IsNotNull() {
            addCriterion("quota1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuota1EqualTo(Double value) {
            addCriterion("quota1 =", value, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1NotEqualTo(Double value) {
            addCriterion("quota1 <>", value, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1GreaterThan(Double value) {
            addCriterion("quota1 >", value, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1GreaterThanOrEqualTo(Double value) {
            addCriterion("quota1 >=", value, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1LessThan(Double value) {
            addCriterion("quota1 <", value, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1LessThanOrEqualTo(Double value) {
            addCriterion("quota1 <=", value, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1In(List<Double> values) {
            addCriterion("quota1 in", values, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1NotIn(List<Double> values) {
            addCriterion("quota1 not in", values, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1Between(Double value1, Double value2) {
            addCriterion("quota1 between", value1, value2, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota1NotBetween(Double value1, Double value2) {
            addCriterion("quota1 not between", value1, value2, "quota1");
            return (Criteria) this;
        }

        public Criteria andQuota2IsNull() {
            addCriterion("quota2 is null");
            return (Criteria) this;
        }

        public Criteria andQuota2IsNotNull() {
            addCriterion("quota2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuota2EqualTo(Double value) {
            addCriterion("quota2 =", value, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2NotEqualTo(Double value) {
            addCriterion("quota2 <>", value, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2GreaterThan(Double value) {
            addCriterion("quota2 >", value, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2GreaterThanOrEqualTo(Double value) {
            addCriterion("quota2 >=", value, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2LessThan(Double value) {
            addCriterion("quota2 <", value, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2LessThanOrEqualTo(Double value) {
            addCriterion("quota2 <=", value, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2In(List<Double> values) {
            addCriterion("quota2 in", values, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2NotIn(List<Double> values) {
            addCriterion("quota2 not in", values, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2Between(Double value1, Double value2) {
            addCriterion("quota2 between", value1, value2, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota2NotBetween(Double value1, Double value2) {
            addCriterion("quota2 not between", value1, value2, "quota2");
            return (Criteria) this;
        }

        public Criteria andQuota3IsNull() {
            addCriterion("quota3 is null");
            return (Criteria) this;
        }

        public Criteria andQuota3IsNotNull() {
            addCriterion("quota3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuota3EqualTo(Double value) {
            addCriterion("quota3 =", value, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3NotEqualTo(Double value) {
            addCriterion("quota3 <>", value, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3GreaterThan(Double value) {
            addCriterion("quota3 >", value, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3GreaterThanOrEqualTo(Double value) {
            addCriterion("quota3 >=", value, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3LessThan(Double value) {
            addCriterion("quota3 <", value, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3LessThanOrEqualTo(Double value) {
            addCriterion("quota3 <=", value, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3In(List<Double> values) {
            addCriterion("quota3 in", values, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3NotIn(List<Double> values) {
            addCriterion("quota3 not in", values, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3Between(Double value1, Double value2) {
            addCriterion("quota3 between", value1, value2, "quota3");
            return (Criteria) this;
        }

        public Criteria andQuota3NotBetween(Double value1, Double value2) {
            addCriterion("quota3 not between", value1, value2, "quota3");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMaxpriceIsNull() {
            addCriterion("maxprice is null");
            return (Criteria) this;
        }

        public Criteria andMaxpriceIsNotNull() {
            addCriterion("maxprice is not null");
            return (Criteria) this;
        }

        public Criteria andMaxpriceEqualTo(Double value) {
            addCriterion("maxprice =", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceNotEqualTo(Double value) {
            addCriterion("maxprice <>", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceGreaterThan(Double value) {
            addCriterion("maxprice >", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("maxprice >=", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceLessThan(Double value) {
            addCriterion("maxprice <", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceLessThanOrEqualTo(Double value) {
            addCriterion("maxprice <=", value, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceIn(List<Double> values) {
            addCriterion("maxprice in", values, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceNotIn(List<Double> values) {
            addCriterion("maxprice not in", values, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceBetween(Double value1, Double value2) {
            addCriterion("maxprice between", value1, value2, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMaxpriceNotBetween(Double value1, Double value2) {
            addCriterion("maxprice not between", value1, value2, "maxprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNull() {
            addCriterion("minprice is null");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNotNull() {
            addCriterion("minprice is not null");
            return (Criteria) this;
        }

        public Criteria andMinpriceEqualTo(Double value) {
            addCriterion("minprice =", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotEqualTo(Double value) {
            addCriterion("minprice <>", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThan(Double value) {
            addCriterion("minprice >", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("minprice >=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThan(Double value) {
            addCriterion("minprice <", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThanOrEqualTo(Double value) {
            addCriterion("minprice <=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceIn(List<Double> values) {
            addCriterion("minprice in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotIn(List<Double> values) {
            addCriterion("minprice not in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceBetween(Double value1, Double value2) {
            addCriterion("minprice between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotBetween(Double value1, Double value2) {
            addCriterion("minprice not between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("period like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("period not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table macd_cross
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table macd_cross
     *
     * @mbg.generated
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