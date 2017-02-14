package com.wuningjian.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by oldfive on 2017/2/9.
 */
public class NetClass {
    //获取IP的
    public void InetAddTest(){
        try{
            InetAddress hostAddress = InetAddress.getLocalHost();
            System.out.println("getLocalHost:" + hostAddress);

            InetAddress getByName = InetAddress.getByName("origin.game.21cn.com");
            System.out.println("getByName:" + getByName);

            InetAddress getAllByName[] = InetAddress.getAllByName("www.baidu.com");
            for(int i = 0;i<getAllByName.length;i++){
                System.out.println("getAllByName:" + getAllByName[i]);

            }
        }catch(UnknownHostException err){
            err.printStackTrace();
        }
    }


}
