package com.zhanzhe.layui.controller;

import com.zhanzhe.layui.service.BprService;
import com.zhanzhe.layui.vo.BprVO;
import com.zhanzhe.layui.vo.BprfinaldrawVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BprController {
    @Autowired
    private BprService bprService;
    @RequestMapping("/bpr")
    public BprVO findData(){return bprService.findData();}
    @RequestMapping("/bpr/delete")
    public int delete(Integer id){return bprService.deleteBpr(id);}
    @RequestMapping("/bpr/create")
    public int create(Integer id,String roadName,double selectTime,double incomeYear,double worktimeYear,double worktimeDay,double sI,double kI,double vCurrency,double yita,double p,double charge,double qOld,double l){
        return bprService.createBpr(id,roadName,selectTime,incomeYear,worktimeYear,worktimeDay,sI,kI,vCurrency,yita,p,charge,qOld,l);
    }
    @RequestMapping("/bpr/draw")
    public BprfinaldrawVO drawbpr(){
        return bprService.drawbpr();
    }
}
