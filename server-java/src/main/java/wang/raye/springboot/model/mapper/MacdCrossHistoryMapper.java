package wang.raye.springboot.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import wang.raye.springboot.model.MacdCrossHistory;
import wang.raye.springboot.model.MacdCrossHistoryCriteria;

public interface MacdCrossHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @SelectProvider(type=MacdCrossHistorySqlProvider.class, method="countByExample")
    long countByExample(MacdCrossHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @DeleteProvider(type=MacdCrossHistorySqlProvider.class, method="deleteByExample")
    int deleteByExample(MacdCrossHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @Delete({
        "delete from macd_cross_history",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @Insert({
        "insert into macd_cross_history (id, exchange, ",
        "symbol, type, status, ",
        "quota1, quota2, quota3, ",
        "price, period, time)",
        "values (#{id,jdbcType=INTEGER}, #{exchange,jdbcType=VARCHAR}, ",
        "#{symbol,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, ",
        "#{quota1,jdbcType=DOUBLE}, #{quota2,jdbcType=DOUBLE}, #{quota3,jdbcType=DOUBLE}, ",
        "#{price,jdbcType=DOUBLE}, #{period,jdbcType=VARCHAR}, #{time,jdbcType=TIMESTAMP})"
    })
    int insert(MacdCrossHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @InsertProvider(type=MacdCrossHistorySqlProvider.class, method="insertSelective")
    int insertSelective(MacdCrossHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @SelectProvider(type=MacdCrossHistorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="exchange", property="exchange", jdbcType=JdbcType.VARCHAR),
        @Result(column="symbol", property="symbol", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="quota1", property="quota1", jdbcType=JdbcType.DOUBLE),
        @Result(column="quota2", property="quota2", jdbcType=JdbcType.DOUBLE),
        @Result(column="quota3", property="quota3", jdbcType=JdbcType.DOUBLE),
        @Result(column="price", property="price", jdbcType=JdbcType.DOUBLE),
        @Result(column="period", property="period", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MacdCrossHistory> selectByExample(MacdCrossHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, exchange, symbol, type, status, quota1, quota2, quota3, price, period, time",
        "from macd_cross_history",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="exchange", property="exchange", jdbcType=JdbcType.VARCHAR),
        @Result(column="symbol", property="symbol", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="quota1", property="quota1", jdbcType=JdbcType.DOUBLE),
        @Result(column="quota2", property="quota2", jdbcType=JdbcType.DOUBLE),
        @Result(column="quota3", property="quota3", jdbcType=JdbcType.DOUBLE),
        @Result(column="price", property="price", jdbcType=JdbcType.DOUBLE),
        @Result(column="period", property="period", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP)
    })
    MacdCrossHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MacdCrossHistorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MacdCrossHistory record, @Param("example") MacdCrossHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MacdCrossHistorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MacdCrossHistory record, @Param("example") MacdCrossHistoryCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MacdCrossHistorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MacdCrossHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table macd_cross_history
     *
     * @mbg.generated
     */
    @Update({
        "update macd_cross_history",
        "set exchange = #{exchange,jdbcType=VARCHAR},",
          "symbol = #{symbol,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "quota1 = #{quota1,jdbcType=DOUBLE},",
          "quota2 = #{quota2,jdbcType=DOUBLE},",
          "quota3 = #{quota3,jdbcType=DOUBLE},",
          "price = #{price,jdbcType=DOUBLE},",
          "period = #{period,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MacdCrossHistory record);
}