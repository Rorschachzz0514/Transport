package com.zhanzhe.layui.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.ToString;

import java.beans.Transient;

@Data
public class Parameter {
    Integer id;
    String roadName;
    double selectTime;
    double incomeYear;
    double worktimeYear;
    double worktimeDay;
    double tR;
    double tW;
    double lamda;
    double sI;
    double kI;
    double vCurrency;
    double yita;
    double p;
    double charge;
    double partitionBusOld;
    double partitionCarOld;

    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)
    double r;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double v;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double tBus;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double tCar;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double eI;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double uBus;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double uCar;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double partitionBus;
    @TableField(insertStrategy = FieldStrategy.NEVER,updateStrategy = FieldStrategy.NEVER)

    double partitionCar;

//    @Override
//    public String toString(){
//        return ",["+"\""+roadName+"\""+","+charge+","+partitionBus+","+partitionCar+"]";
//    }



}
