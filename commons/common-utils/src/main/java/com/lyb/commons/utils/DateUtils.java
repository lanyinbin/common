package com.lyb.commons.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by yinbin.lan on 2017/4/9.
 */
public class DateUtils {
   //获得今天零点时间
   public static Date getBreakDayForToday(){
       Calendar cal=Calendar.getInstance();
       cal.add(cal.HOUR,0);
       cal.add(cal.SECOND,0);
       cal.add(cal.MINUTE,0);
       return cal.getTime();
   }
   //获得昨天零点时间
   //获得次日零点时间
   //两个时间点差多少天数
   //格式化时间
   //当前时间推移几天后的时间
   //获得昨天现在的时间戳
   //判断一个时间是否在某个时间段
   //long转date
   //传过来的时间是否小于系统时间
   //获得系统时间和传过来时间的差值
   //返回指定日期所在年的最后一天

    public static void main(String args[]){
        System.out.println(getBreakDayForToday());
    }
}
