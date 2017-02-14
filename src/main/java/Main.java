import com.wuningjian.java.BufferInput;
import com.wuningjian.java.NetClass;

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

    }
}
