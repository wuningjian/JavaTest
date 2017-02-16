package com.wuningjian.java;

/**
 * Created by wu_ni on 2017/2/16.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 测试线程组用例
 * */
public class ThreadList {
    //获取根线程组
    private static ThreadGroup getRootThreadGroups(){
        ThreadGroup rootGroup = (Thread.currentThread()).getThreadGroup();
        while(true){
            if(rootGroup.getParent()!=null){
                rootGroup = rootGroup.getParent();
            }else{
                break;
            }
        }
        return rootGroup;
    }

    //获取给定线程组的所有线程名
    public static List<String> getThreads(ThreadGroup group){
        List<String> threadList = new ArrayList<String>();
        Thread[] threads = new Thread[group.activeCount()];
        int count = group.enumerate(threads,false);
        for(int i=0;i<count;i++){
            threadList.add(group.getName() + "线程组：" + threads[i].getName());
        }
        return threadList;
    }

    //获取线程组中所有的线程，包括子线程下的线程
    public static List<String> getThreadGroups(ThreadGroup group){
        List<String> threadList = getThreads(group);
        ThreadGroup[] groups = new ThreadGroup[group.activeGroupCount()];
        int count = group.enumerate(groups, false);
        for(int i=0;i<count;i++){
            threadList.addAll(getThreads(groups[i]));
        }
        return threadList;
    }

    public static void main(String[] args){
        for(String string : getThreadGroups(getRootThreadGroups())){
            System.out.println(string);
        }
    }
}
