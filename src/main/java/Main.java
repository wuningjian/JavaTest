import com.wuningjian.java.BufferInput;
import com.wuningjian.java.NetClass;
import com.wuningjian.java.UsageForeach;

import java.io.File;

/**
 * Created by oldfive on 2017/2/9.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("This is main MavenJava");
        BufferInput bufferInput = new BufferInput();
        bufferInput.bufferInputTest();

        NetClass netClass = new NetClass();
        netClass.InetAddTest();

        File file = new File("");

        UsageForeach usageForeach = new UsageForeach();
        usageForeach.UsageMap();

    }
}
