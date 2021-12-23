package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectMonthLogin(String month);
    public HashMap<String, Object> selectDayLogin(String day);
    public HashMap<String, Object> selectAvgLogin(String sday, String eday);
    public HashMap<String, Object> selectLogin(String sday, String eday);
    public HashMap<String, Object> selectMonthOrg(String month, String Organization);
 
}