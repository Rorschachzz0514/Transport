package com.zhanzhe.layui.service;

import com.zhanzhe.layui.entity.Bpr;
import com.zhanzhe.layui.vo.BprVO;
import com.zhanzhe.layui.vo.BprfinaldrawVO;

public interface BprService {
    public BprVO<Bpr> findData();
    public int deleteBpr(Integer id);
    public int createBpr(Integer id,String roadName,double selectTime,double incomeYear,double worktimeYear,double worktimeDay,double sI,double kI,double vCurrency,double yita,double p,double charge,double qOld,double l);



    public BprfinaldrawVO drawbpr();
}
