package com.tianji.testspringboot.controller;

import com.tianji.testspringboot.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordMapper recordMapper;

    @GetMapping("/add")
    public String add() {
        recordMapper.addRecord();
        return "新增成功!去Navicat看看吧";
    }

    @GetMapping("/reduce")
    public String reduce() {
        int rows = recordMapper.deleteLatestRecord();
        return rows > 0 ? "删除成功!" : "表里没数据，删个毛线。";
    }

    @GetMapping("/update")
    public String update() {
        int rows = recordMapper.updateLatestRecord();
        return rows > 0 ? "更新最新时间成功！" : "表里没数据，无法更新。";
    }

    @GetMapping("/select")
    public List<Map<String,Object>> select() {
        return recordMapper.selectLatestRecord();
    }

}
