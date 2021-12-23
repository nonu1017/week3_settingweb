package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
 
public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String, Object> monthloginNum(String month);
    public HashMap<String, Object> dayloginNum(String day);
    public HashMap<String, Object> avgloginNum(String sday, String eday);
    public HashMap<String, Object> loginNum(String sday, String eday);
    public HashMap<String, Object> monthorgNum(String month, String Organization);
    
}