package Group.Better.repository;

import Group.Better.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserRepository {

    @Insert("insert into users (username, password) values (#{username}, #{password})")
    void insert(@Param("username") String username, @Param("password") String password);

    @Select("select * from users where username = #{username}")
    Optional<User> findByUsernameLogin(String username);

    @Select("select id from users where username = #{username}")
    Long findIdByUsername(String username);

    @Select("select * from users where username = #{username}")
    User findByUsername(String username);

}
