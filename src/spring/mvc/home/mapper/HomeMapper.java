package spring.mvc.home.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HomeMapper {
	
    @SuppressWarnings("rawtypes")
	@Select("SELECT * FROM USERS WHERE ID = #{id}")
    public Map getUser(@Param("id") String id);
}
