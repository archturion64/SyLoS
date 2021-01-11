package com.github.archturion64.SystemLoad.services;

import com.github.archturion64.SystemLoad.models.CpuLoadModel;
import com.github.archturion64.procstatparser.ProcStatParser;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CpuLoadService {

    public CpuLoadModel getCurrentCpuLoad() {
        return currentCpuLoad;
    }

    private CpuLoadModel currentCpuLoad = new CpuLoadModel();

    @PostConstruct
    @Scheduled(cron = "* * * * * *")
    public void fetchCpuLoadData() {
        List<Short> newCpuLoad = ProcStatParser.readCpuLoad();
        if(newCpuLoad.size() > 1)
        {
            currentCpuLoad.setCpuTotalLoad(newCpuLoad.remove(0));
            currentCpuLoad.setCpuCoresLoad(newCpuLoad);
        }
    }
}
