package com.example.lenovo.SmartMan;

import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lenovo on 8/20/2017.
 */public class MonitorApp extends Application
{
    // actual store of statistics
    private final ArrayList<HashMap<String,Object>> processList = new ArrayList<HashMap<String,Object>>();

    // fast-access index by package name (used for lookup)
    private ArrayList<String> packages = new ArrayList<String>();

    public ArrayList<HashMap<String,Object>> getProcessList()
    {
        return processList;
    }

    public ArrayList<String> getPackages()
    {
        return packages;
    }

    // TODO: you need to save and load the instance data
    // TODO: you need to address synchronization issues
}