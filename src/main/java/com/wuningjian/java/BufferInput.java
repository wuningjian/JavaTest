package com.wuningjian.java;

import java.io.*;

/**
 * Created by oldfive on 2017/2/9.
 */
public class BufferInput {
    public void bufferInputTest(){
        String filePath = "/Users/oldfive/Documents/workspace/java/TestFile.txt";
        String copyFilePath = null;
        File file = new File(filePath);
        File copyFile = null;
        if(file.isFile()){
            copyFilePath = file.getParent() + File.separator + "copy_" + file.getName();
            System.out.println("copyFilePath:" + copyFilePath);
        }
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(filePath));
            if(copyFilePath != null){
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(copyFilePath));
                byte[] buffer = new byte[1024];
                int n = 0;
                while((n = in.read(buffer))!=-1){
                    out.write(buffer, 0, n);
                }
                out.close();
                in.close();
            }

        }catch(IOException err){
            err.printStackTrace();
        }
    }
}
