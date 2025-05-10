package com.zhanzhe.layui.controller;

import com.zhanzhe.layui.service.ParameterService;
import com.zhanzhe.layui.vo.ParafinaldrawVO;
import com.zhanzhe.layui.vo.ParameterVO;
import com.zhanzhe.layui.vo.ParameterdrawVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ParameterControler {
    @Autowired
    private ParameterService parameterService;
    @RequestMapping("/parameter")
    public ParameterVO parameterVO(){return parameterService.findData();}
    @RequestMapping("/parameter/delete")
    public int deleteParameter(Integer id){return parameterService.deleteParameter(id);}
    @RequestMapping("/parameter/create")
    public int createParameter(Integer id,String roadName,double selectTime,double incomeYear,double worktimeYear,double worktimeDay,double tR,double tW,double lamda,double sI,double kI,double vCurrency,double yita,double p,double charge,double partitionBusOld,double partitionCarOld){
        return parameterService.createParameter(id, roadName, selectTime, incomeYear, worktimeYear, worktimeDay, tR, tW, lamda, sI, kI, vCurrency, yita, p, charge, partitionBusOld, partitionCarOld);
    }
//    @RequestMapping("/parameter/drawparameter")
//    public String drawParemeter(){
//        return parameterService.drawParameter();
//    }
    @RequestMapping("parameter/drawbus")
    public ParafinaldrawVO drawBus(){
        return parameterService.drawBus();
    }
    @RequestMapping("parameter/drawcar")
    public ParafinaldrawVO drawCar(){
        return parameterService.drawCar();
    }


}
//http://localhost:8080/parameter/create?id=100&roadName=zhanzhe&selectTime=0.72&incomeYear=1&worktimeYear=1&worktimeDay=1&tR=1&tW=1&lamda=1&sI=1&kI=1&vCurrency=1&yita=1&p=1&charge=1&partitionBusOld=1&partitionCarOld=1