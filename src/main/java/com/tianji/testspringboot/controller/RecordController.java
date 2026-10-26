package com.tianji.testspringboot.controller;

import com.tianji.testspringboot.DAO.RecordDAO;
import com.tianji.testspringboot.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping("/add")
    public String add() {
        return recordService.addRecord();
    }

    @GetMapping("/reduce")
    public String reduce() {
        return recordService.reduceRecord();
    }

    @GetMapping("/update")
    public String update() {
        return recordService.updateRecord();
    }

    @GetMapping("/select")
    public List<Map<String,Object>> select() {
        return recordService.selectRecord();
    }

    @PostMapping("/addByName")
    public String addByName(@RequestParam String name) {
        return recordService.addRecordByName(name);
    }

    @GetMapping("/all")
    public List<Map<String,Object>> getAll() {
        return recordService.getAllRecords();
    }

}
