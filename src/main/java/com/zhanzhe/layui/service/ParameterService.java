package com.zhanzhe.layui.service;

import com.zhanzhe.layui.entity.Parameter;
import com.zhanzhe.layui.vo.ParafinaldrawVO;
import com.zhanzhe.layui.vo.ParameterVO;
import com.zhanzhe.layui.vo.ParameterdrawVO;

import java.beans.Transient;
import java.util.List;

public interface ParameterService {
    public ParameterVO<Parameter> findData();
    public int deleteParameter(Integer id);

    public int createParameter(Integer id,String roadName,double selectTime,double incomeYear,double worktimeYear,double worktimeDay,double tR,double tW,double lamda,double sI,double kI,double vCurrency,double yita,double p,double charge,double partitionBusOld,double partitionCarOld);
    //public String drawParameter();
    public ParafinaldrawVO drawBus();
    public ParafinaldrawVO drawCar();
}
