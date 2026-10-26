package com.tianji.testspringboot.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDAO {
    @Select("Select * from user")
    List<Map<String,Object>> findAll();
}
