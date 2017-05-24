package com.lup.model.slave.os;

public class OSInfo {
    private long id;
    enum OS_TYPE{
        WINDOWS,
        MAC,
        LINUX
    }

    private OSInfo OsInfo;
    private String OsVersion;
}
