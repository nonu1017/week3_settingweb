package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }

    @RequestMapping("/sqlmonthStatistic")
    public Map<String, Object> sqltest2(String month) throws Exception{ 
        
        return service.monthloginNum(month);
    }

    @RequestMapping("/sqldayStatistic")
    public Map<String, Object> sqltest3(String day) throws Exception{ 
        
        return service.dayloginNum(day);
    }

    @RequestMapping("/sqlavgloginStatistic")
    public Map<String, Object> sqltest4(String Sday, String Eday) throws Exception{ 
        
        return service.avgloginNum(Sday, Eday);
    }

    @RequestMapping("/sqlloginStatistic")
    public Map<String, Object> sqltest5(String Sday, String Eday) throws Exception{ 
        
        return service.loginNum(Sday, Eday);
    }

    @RequestMapping("/sqlorgStatistic")
    public Map<String, Object> sqltest6(String month, String Organization) throws Exception{ 
        
        return service.monthorgNum(month, Organization);
    }
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}