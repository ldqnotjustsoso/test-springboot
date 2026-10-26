package com.tianji.testspringboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    @Select("Select * from user")
    List<Map<String,Object>> findAll();
}
