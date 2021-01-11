package com.github.archturion64.SystemLoad.models;

import java.util.Collections;
import java.util.List;

public class CpuLoadModel {

    public CpuLoadModel() {
    }

    public CpuLoadModel(Short cpuTotalLoad, List<Short> cpuCoresLoad) {
        this.cpuTotalLoad = cpuTotalLoad;
        this.cpuCoresLoad = cpuCoresLoad;
    }

    public Short getCpuTotalLoad() {
        return cpuTotalLoad;
    }

    public void setCpuTotalLoad(Short cpuTotalLoad) {
        this.cpuTotalLoad = cpuTotalLoad;
    }

    public List<Short> getCpuCoresLoad() {
        return cpuCoresLoad;
    }

    public void setCpuCoresLoad(List<Short> cpuCoresLoad) {
        this.cpuCoresLoad = cpuCoresLoad;
    }

    private Short cpuTotalLoad;

    private List<Short> cpuCoresLoad = Collections.emptyList();
}
