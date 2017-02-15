package com.wuningjian.java;

import java.util.*;

/**
 * Created by wu_ni on 2017/1/10.
 *
 */
public class UsageForeach {
    public void IntegerList(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list.add(i+1);
        }
        System.out.println("list[5]:" + list.get(5));
        for(Integer num : list){
            System.out.println(num);
        }
        Integer[] listToArr = new Integer[list.size()];
        list.toArray(listToArr);
        for(Integer num : listToArr){
            System.out.println(num);
        }
    }
    public void UsageMap(){
        Map<String, String[]> foodMap = new HashMap<>();
        foodMap.put("江门", new String[]{"外海面","粉卷"});
        foodMap.put("武汉", new String[]{"热干面","豆皮"});
        Set<String> city = foodMap.keySet();
        String[] cityArr = new String[city.size()];
        city.toArray(cityArr);
        System.out.println("美食城市有:");
        String[] food = foodMap.get(cityArr[0]);
        System.out.println(cityArr[0]+"有美食"+food[0]);
    }
}