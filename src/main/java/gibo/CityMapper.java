package gibo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

	
    @Select("SELECT * FROM CITY WHERE state = #{state}")
    List<City> findByState(@Param("state") String state);

    @Insert("insert into CITY values (#{name}, #{state}, #{country})")
    void insertCity(City city);

    @Select("SELECT * FROM CITY")
	List<City> allCities();
    
}
