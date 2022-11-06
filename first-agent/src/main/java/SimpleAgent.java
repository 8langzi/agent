import java.lang.instrument.Instrumentation;

public class SimpleAgent {


    /**
     * jvm 参数形式启动
     * @param agentArgs
     * @param inst
     */
    public static void premain(String agentArgs, Instrumentation inst){
        System.out.println("premain");
    }

    /**
     * 动态 attch 方式启动， 运行此方法
     * @param agentArgs
     * @param inst
     */
    public static void agentmain(String agentArgs, Instrumentation inst){
        System.out.println("agentmain");
    }

}
