package com.tianji.testspringboot.DAO;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

//@Mapper
public interface RecordDAO {

    //增加一条记录，直接用数据库的Now()获取当地时间
    int addRecord();

    //删除最新的一条
    int deleteLatestRecord();

    //更新最新的一条的时间为当前时间
    int updateLatestRecord();

    //查询最新的一条数据
    List<Map<String, Object>> selectLatestRecord();
}
