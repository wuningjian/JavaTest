package com.wuningjian.java;

import java.io.File;

/**
 * Created by wu_ni on 2017/1/18.
 * 递归查找filePath下面夹是否存在名字为target的文件
 */
public class IOFile {
    public static int num = 0;
    public static void fun(String filePath, String target){
        File f = new File(filePath);
        if(!f.exists()){
            System.out.println("f not exists");
            return;
        }
        if(f.getName().indexOf(target) == 0){
            System.out.println(f.getName().indexOf(target));
            System.out.println("the " + (++num) + " file found in:" + f.getPath());
        }
        if(f.isDirectory()){
            for(String cur_dir : f.list()){
                //System.out.println(cur_dir);
                //System.out.println(File.separator);
                fun((f.getPath() + File.separator + cur_dir), target);
            }
        }
        //System.out.println(f.getName());
    }
}
