package spring.mvc.home.mapper;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HomeMapper {
	
	@Select("SELECT * FROM USERS WHERE ID = #{id}")
    public Map<String, String> getUser(@Param("id") String id);
    
    @Insert("INSERT INTO USERS (ID, NAME, PASSWORD)VALUES(#{id}, #{name}, #{password})")
    public void setUser(@Param("id") String id, @Param("name") String name, @Param("password")String password);
    
	@PostConstruct
	public default void init() {
		System.out.println("HomeMapper init @PostConstruct");
	}
	
	
	@PostConstruct
	public static void init2() {
		System.out.println("HomeMapper init2 @PostConstruct");
	}
	
	@PreDestroy
	public static void destroy() {
		System.out.println("HomeMapper @PreDestroy");
	}
}
