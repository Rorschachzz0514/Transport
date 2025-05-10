package com.zhanzhe.layui.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhanzhe.layui.entity.Bpr;
import com.zhanzhe.layui.mapper.BprMapper;
import com.zhanzhe.layui.service.BprService;
import com.zhanzhe.layui.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BprServiceImpl implements BprService {
    @Autowired
    private BprMapper bprMapper;
    @Override
    public BprVO<Bpr> findData(){
        BprVO bpr=new BprVO<>();
        bpr.setCode(0);
        bpr.setMsg("");
        bpr.setCount(bprMapper.selectCount(null));
        List<Bpr> bprList=bprMapper.selectList(null);
        bpr.setData(bprList);
        return bpr;
    }
    @Override
    public int deleteBpr(Integer id){
        return bprMapper.deleteById(id);
    }
    @Override
    public  int createBpr(Integer id,String roadName,double selectTime,double incomeYear,double worktimeYear,double worktimeDay,double sI,double kI,double vCurrency,double yita,double p,double charge,double qOld,double l){
        Bpr bpr=new Bpr();
        bpr.setId(id);
        bpr.setRoadName(roadName);
        bpr.setSelectTime(selectTime);
        bpr.setIncomeYear(incomeYear);
        bpr.setWorktimeYear(worktimeYear);
        bpr.setWorktimeDay(worktimeDay);
        bpr.setSI(sI);
        bpr.setKI(kI);
        bpr.setVCurrency(vCurrency);
        bpr.setYita(yita);
        bpr.setP(p);
        bpr.setCharge(charge);
        bpr.setQOld(qOld);
        //bpr.setVF(vF);
        //bpr.setVM(vM);
        bpr.setL(l);
        //bpr.setTimeCurrency(timeCurrency);

        return bprMapper.insert(bpr);
    }


    @Override
    public BprfinaldrawVO drawbpr(){
        QueryWrapper wrapper1=new QueryWrapper();
        wrapper1.eq("road_name","罗斯福");
        wrapper1.orderByAsc("charge");
        wrapper1.select("jam");
        List<Bpr> list1=bprMapper.selectList(wrapper1);
        BprdrawVO result1=new BprdrawVO();
        List<Double> l1=new ArrayList<>();
        for(Bpr b:list1){
            double temp=b.getJam();
            l1.add(temp);
        }
        result1.setData(l1);





        QueryWrapper wrapper2=new QueryWrapper();
        wrapper2.eq("road_name","麦凯乐");
        wrapper2.orderByAsc("charge");
        wrapper2.select("jam");
        List<Bpr> list2=bprMapper.selectList(wrapper2);
        BprdrawVO result2=new BprdrawVO();
        List<Double> l2=new ArrayList<>();
        for(Bpr b:list2){
            double temp=b.getJam();
            l2.add(temp);
        }
        result2.setData(l2);






        QueryWrapper wrapper3=new QueryWrapper();
        wrapper3.eq("road_name","锦辉");
        wrapper3.orderByAsc("charge");
        wrapper3.select("jam");
        List<Bpr> list3=bprMapper.selectList(wrapper3);
        BprdrawVO result3=new BprdrawVO();
        List<Double> l3=new ArrayList<>();
        for(Bpr b:list3){
            double temp=b.getJam();
            l3.add(temp);
        }
        result3.setData(l3);






        QueryWrapper wrapper4=new QueryWrapper();
        wrapper4.eq("road_name","罗斯福");
        wrapper4.orderByAsc("charge");
        wrapper4.select("jam");
        List<Bpr> list4=bprMapper.selectList(wrapper4);
        BprdrawVO result4=new BprdrawVO();
        List<Double> l4=new ArrayList<>();
        for(Bpr b:list4){
            double temp=b.getJam();
            l4.add(temp);
        }
        result4.setData(l4);


        QueryWrapper wrapper5=new QueryWrapper();
        wrapper5.eq("road_name","其他路段");
        wrapper5.orderByAsc("charge");
        wrapper5.select("jam");
        List<Bpr> list5=bprMapper.selectList(wrapper5);

        //System.out.println(list5);


        BprdrawVO result5=new BprdrawVO();
        List<Double> l5=new ArrayList<>();
        for(Bpr b:list5){
            double temp=b.getJam();
            l5.add(temp);
        }
        result5.setData(l5);

        List<BprdrawVO> bfinal=new ArrayList<>();

        bfinal.add(result1);
        bfinal.add(result2);
        bfinal.add(result3);
        bfinal.add(result4);
        bfinal.add(result5);
        BprfinaldrawVO bfina=new BprfinaldrawVO();
        bfina.setList(bfinal);
        //System.out.println(bfinal);
        return bfina;
    }
}
