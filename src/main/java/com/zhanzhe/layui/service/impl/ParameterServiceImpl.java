package com.zhanzhe.layui.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhanzhe.layui.entity.Parameter;
import com.zhanzhe.layui.mapper.ParameterMapper;
import com.zhanzhe.layui.service.ParameterService;
import com.zhanzhe.layui.vo.ParafinaldrawVO;
import com.zhanzhe.layui.vo.ParameterVO;
import com.zhanzhe.layui.vo.ParameterdrawVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParameterServiceImpl implements ParameterService {
    @Autowired
    private ParameterMapper parameterMapper;
    @Override
    public ParameterVO<Parameter> findData(){
        ParameterVO parameterVO=new ParameterVO<>();
        parameterVO.setCode(0);
        parameterVO.setMsg("");
        parameterVO.setCount(parameterMapper.selectCount(null));
        List<Parameter> parameterList= parameterMapper.selectList(null);

        parameterVO.setData(parameterList);
        //QueryWrapper wrapper=new QueryWrapper();
        //wrapper.eq("id",1);
        return parameterVO;
    }
    @Override
    public int deleteParameter(Integer id){
        return parameterMapper.deleteById(id);
    }
    @Override
    public int createParameter(Integer id,String roadName,double selectTime,double incomeYear,double worktimeYear,double worktimeDay,double tR,double tW,double lamda,double sI,double kI,double vCurrency,double yita,double p,double charge,double partitionBusOld,double partitionCarOld){
        Parameter parameter=new Parameter();
        parameter.setId(id);
        parameter.setRoadName(roadName);
        parameter.setSelectTime(selectTime);
        parameter.setIncomeYear(incomeYear);
        parameter.setWorktimeYear(worktimeYear);
        parameter.setWorktimeDay(worktimeDay);
        parameter.setTR(tR);
        parameter.setTW(tW);
        parameter.setLamda(lamda);
        parameter.setSI(sI);
        parameter.setKI(kI);
        parameter.setVCurrency(vCurrency);
        parameter.setYita(yita);
        parameter.setP(p);
        parameter.setCharge(charge);
        parameter.setPartitionBusOld(partitionBusOld);
        parameter.setPartitionCarOld(partitionCarOld);
        //parameter.setV(null);
        return parameterMapper.insert(parameter);

    }
//    @Override
//    public String drawParameter(){
//        List<Parameter> parameterList=parameterMapper.selectList(null);
//        String result="[[\"roadName\",\"charge\",\"partitionBus\",\"partitionCar\"]";
//        for(Parameter parameter:parameterList){
//            result=result+parameter.toString();
//        }
//        result=result+"]";
//
//        return result;
//    }
    @Override
    public ParafinaldrawVO drawBus(){
        QueryWrapper wrapper1=new QueryWrapper();
        wrapper1.eq("road_name","罗斯福");
        wrapper1.orderByAsc("charge");
        wrapper1.select("partition_bus");
        List<Parameter> list1=parameterMapper.selectList(wrapper1);
        ParameterdrawVO result1=new ParameterdrawVO();
        List<Double>  l1 =new ArrayList<>();

        //ParafinaldrawVO pfinal=new ParafinaldrawVO();
        for(Parameter p :list1){
            double temp=p.getPartitionBus();
            l1.add(temp);
        }
        result1.setData(l1);


        QueryWrapper wrapper2=new QueryWrapper();
        wrapper2.eq("road_name","麦凯乐");
        wrapper2.orderByAsc("charge");
        wrapper2.select("partition_bus");
        List<Parameter> list2=parameterMapper.selectList(wrapper2);
        ParameterdrawVO result2=new ParameterdrawVO();
        List<Double>  l2 =new ArrayList<>();

        for(Parameter p :list2){
            double temp=p.getPartitionBus();
            l2.add(temp);
        }
        result2.setData(l2);
        System.out.println(result2);



        QueryWrapper wrapper3=new QueryWrapper();
        wrapper3.eq("road_name","锦辉");
        wrapper3.orderByAsc("charge");
        wrapper3.select("partition_bus");
        List<Parameter> list3=parameterMapper.selectList(wrapper3);
        ParameterdrawVO result3=new ParameterdrawVO();
        List<Double>  l3 =new ArrayList<>();

        for(Parameter p :list3){
            double temp=p.getPartitionBus();
            l3.add(temp);
        }
        result3.setData(l3);
        System.out.println(result3);




        QueryWrapper wrapper4=new QueryWrapper();
        wrapper4.eq("road_name","福佳新天地");
        wrapper4.orderByAsc("charge");
        wrapper4.select("partition_bus");
        List<Parameter> list4=parameterMapper.selectList(wrapper4);
        ParameterdrawVO result4=new ParameterdrawVO();
        List<Double>  l4 =new ArrayList<>();

        for(Parameter p :list4){
            double temp=p.getPartitionBus();
            l4.add(temp);
        }
        result4.setData(l4);
        System.out.println(result4);

        List<ParameterdrawVO> pfinal=new ArrayList<>();

        pfinal.add(result1);
        pfinal.add(result2);
        pfinal.add(result3);
        pfinal.add(result4);

        ParafinaldrawVO parafina=new ParafinaldrawVO();
        parafina.setList(pfinal);
        //System.out.println(pfinal);
        return parafina;


    }
    @Override
    public ParafinaldrawVO drawCar(){
        QueryWrapper wrapper1=new QueryWrapper();
        wrapper1.eq("road_name","罗斯福");
        wrapper1.orderByAsc("charge");
        wrapper1.select("partition_car");
        List<Parameter> list1=parameterMapper.selectList(wrapper1);
        ParameterdrawVO result1=new ParameterdrawVO();
        List<Double>  l1 =new ArrayList<>();

        //ParafinaldrawVO pfinal=new ParafinaldrawVO();
        for(Parameter p :list1){
            double temp=p.getPartitionCar();
            l1.add(temp);
        }
        result1.setData(l1);


        QueryWrapper wrapper2=new QueryWrapper();
        wrapper2.eq("road_name","麦凯乐");
        wrapper2.orderByAsc("charge");
        wrapper2.select("partition_car");
        List<Parameter> list2=parameterMapper.selectList(wrapper2);
        ParameterdrawVO result2=new ParameterdrawVO();
        List<Double>  l2 =new ArrayList<>();

        for(Parameter p :list2){
            double temp=p.getPartitionCar();
            l2.add(temp);
        }
        result2.setData(l2);
        System.out.println(result2);



        QueryWrapper wrapper3=new QueryWrapper();
        wrapper3.eq("road_name","锦辉");
        wrapper3.orderByAsc("charge");
        wrapper3.select("partition_car");
        List<Parameter> list3=parameterMapper.selectList(wrapper3);
        ParameterdrawVO result3=new ParameterdrawVO();
        List<Double>  l3 =new ArrayList<>();

        for(Parameter p :list3){
            double temp=p.getPartitionCar();
            l3.add(temp);
        }
        result3.setData(l3);
        System.out.println(result3);




        QueryWrapper wrapper4=new QueryWrapper();
        wrapper4.eq("road_name","福佳新天地");
        wrapper4.orderByAsc("charge");
        wrapper4.select("partition_car");
        List<Parameter> list4=parameterMapper.selectList(wrapper4);
        ParameterdrawVO result4=new ParameterdrawVO();
        List<Double>  l4 =new ArrayList<>();

        for(Parameter p :list4){
            double temp=p.getPartitionCar();
            l4.add(temp);
        }
        result4.setData(l4);
        System.out.println(result4);

        List<ParameterdrawVO> pfinal=new ArrayList<>();

        pfinal.add(result1);
        pfinal.add(result2);
        pfinal.add(result3);
        pfinal.add(result4);

        ParafinaldrawVO parafina=new ParafinaldrawVO();
        parafina.setList(pfinal);
        //System.out.println(pfinal);
        return parafina;

    }

}
