package frostmourne;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    // public
    // wrapper type
    public static Integer publicInteger = 1;
    public static Boolean publicBoolean = true;
    public static Double publicDouble = 19491001.0D;
    public static Float publicFloat = 1314.520F;
    // basic type
    public static int publicInt = 7;
    public static boolean publicBool = false;
    public static double publicDou = 1234D;
    public static float publicFlo = 4321F;

    // protected
    // wrapper type
    protected static Integer protectedInteger = 10;
    protected static Boolean protectedBoolean = true;
    protected static Double protectedDouble = 194910010.0D;
    protected static Float protectedFloat = 13140.520F;
    // basic type
    protected static int protectedInt = 70;
    protected static boolean protectedBool = false;
    protected static double protectedDou = 12340D;
    protected static float protectedFlo = 43210F;

    // default
    // wrapper type
    static Integer defaultInteger = 100;
    static Boolean defaultBoolean = true;
    static Double defaultDouble = 1949100100.0D;
    static Float defaultFloat = 131400.520F;
    // basic type
    static int defaultInt = 700;
    static boolean defaultBool = false;
    static double defaultDou = 123400D;
    static float defaultFlo = 432100F;

    // private
    // wrapper type
    private static Integer privateInteger = 1000;
    private static Boolean privateBoolean = true;
    private static Double privateDouble = 19491001000.0D;
    private static Float privateFloat = 1314000.520F;
    // basic type
    private static int privateInt = 7000;
    private static boolean privateBool = false;
    private static double privateDou = 1234000D;
    private static float privateFlo = 4321000F;

    // object
    private static OtherClassWithToString otherClassWithToString = new OtherClassWithToString();

    private static Service service = new ServiceImpl();

    static {
        otherClassWithToString.setAge(1);
        otherClassWithToString.setName("xxxx");
        otherClassWithToString.setMoney(123123123.12132233D);
        otherClassWithToString.setScore(100.00F);
    }

    class InnerClass {
        private String name;
        private Map<String, Object> map;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, Object> getMap() {
            return map;
        }

        public void setMap(Map<String, Object> map) {
            this.map = map;
        }
    }

    private static void sleep(int i) {
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        // dead loop
        while (true) {
            try {
                voidMethod(1);
                int number = intMethod("java");
                List<Double> doubleList = listMethod(123.D);
                Map<String, Object> map = multiParamMethod(7, "123", doubleList);
                String error = throwMethod(r.nextInt(1000));
                OtherClass otherClass = inputObject(otherClassWithToString);
                List<String> djfdkfjk = service.doService(r.nextInt(100), "djfdkfjk");
                TimeUnit.SECONDS.sleep(1L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static OtherClass inputObject(OtherClassWithToString otherClassWithToString) {
        OtherClass otherClass = new OtherClass();
        otherClass.setAge(otherClassWithToString.getAge());
        otherClass.setName(otherClassWithToString.getName());
        otherClass.setScore(otherClassWithToString.getScore());
        otherClass.setMoney(otherClassWithToString.getMoney());
        return otherClass;
    }

    private static String throwMethod(int nextInt) {
        if (nextInt % 7 == 0) {
            throw new RuntimeException("occor error, message is blabla");
        } else {
            sleep(1);
            return "success";
        }
    }

    public static Map<String, Object> multiParamMethod(int i, String s, List<Double> doubleList) {
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();
        stringObjectMap.put("i", i);
        stringObjectMap.put("s", s);
        stringObjectMap.put("doubleList", doubleList);
        return stringObjectMap;
    }

    static List<Double> listMethod(double v) {
        List<Double> result = new ArrayList<Double>();
        result.add(v);
        return result;
    }

    static int intMethod(String java) {
        return java.length();
    }
    private String getString(String a, int b) {
        return a + b;
    }

    private static void voidMethod(int i) {
        i = 7;
        String n = "11";
        n += i;
        System.out.println(n);
    }
}
