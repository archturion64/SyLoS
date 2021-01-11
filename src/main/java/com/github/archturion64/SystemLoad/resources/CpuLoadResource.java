package com.github.archturion64.SystemLoad.resources;

import com.github.archturion64.SystemLoad.models.CpuLoadModel;
import com.github.archturion64.SystemLoad.services.CpuLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CpuLoadResource {

    @Autowired
    CpuLoadService cpuLoadService;

    @RequestMapping("/cpuload")
    public CpuLoadModel cpuLoad() {
        return cpuLoadService.getCurrentCpuLoad();
    }
}
