package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            retVal.put("requestlog", "Y");
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
            retVal.put("requestlog", "Y");
        }
        
        return retVal;
    }
    public HashMap<String, Object> monthloginNum(String month){
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectMonthLogin(month);
            retVal.put("month", month);
            retVal.put("is_success", true);
            retVal.put("requestlog", "M");
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("month", month);
            retVal.put("is_success", false);
            retVal.put("requestlog", "M");
        }
        
        return retVal;
    	
    }
    public HashMap<String, Object> dayloginNum(String day){
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectDayLogin(day);
            retVal.put("day", day);
            retVal.put("is_success", true);
            retVal.put("requestlog", "D");
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("day", day);
            retVal.put("is_success", false);
            retVal.put("requestlog", "D");
        }
        
        return retVal;
        }
    public HashMap<String, Object> avgloginNum(String sday, String eday){
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectAvgLogin(sday, eday);
            retVal.put("is_success", true);
            retVal.put("requestlog", "A");
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("is_success", false);
            retVal.put("requestlog", "A");
        }
        
        return retVal;
        }
    public HashMap<String, Object> loginNum(String sday, String eday){
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectLogin(sday, eday);
            retVal.put("is_success", true);
            retVal.put("requestlog", "L");
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("is_success", false);
            retVal.put("requestlog", "L");
        }
        
        return retVal;
        }
    public HashMap<String, Object> monthorgNum(String month, String Organization){
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectMonthOrg(month, Organization);
            retVal.put("Organization", Organization);
            retVal.put("month", month);
            retVal.put("is_success", true);
            retVal.put("requestlog", "O");
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("Organization", Organization);
            retVal.put("month", month);
            retVal.put("is_success", false);
            retVal.put("requestlog", "O");
        }
        
        return retVal;
        }
 
}