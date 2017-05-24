package com.lup.model.slave;

import com.lup.model.instance.Instance;
import com.lup.model.slave.os.OSInfo;

import java.util.List;

public class SlaveMachine {
    private String Ip;
    private long port;
    private OSInfo osInfo;

    List<Instance> LUPInstances;

}
