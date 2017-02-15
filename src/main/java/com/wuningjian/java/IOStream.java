package com.wuningjian.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by wu_ni on 2017/1/22.
 * 字节流使用,文件拷贝
 */
public class IOStream {
    public static void copyFile(){
        FileInputStream ins = null;
        FileOutputStream outs = null;
        int num = 0;
        byte[] buffer = new byte[1024];
        try{
            ins = new FileInputStream("D:/WorkSpace/file.txt");
            outs = new FileOutputStream("D:/WorkSpace/copy_file.txt");
            while ((num = ins.read(buffer))!=-1){
                System.out.println(num);
                outs.write(buffer, 0, num);
            }
            ins.close();
            outs.flush();
            outs.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
