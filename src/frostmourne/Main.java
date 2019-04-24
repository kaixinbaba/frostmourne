package frostmourne;

import java.security.interfaces.RSAKey;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    // public
    // wrapper type
    public Integer publicInteger = 1;
    public Boolean publicBoolean = true;
    public Double publicDouble = 19491001.0D;
    public Float publicFloat = 1314.520F;
    // basic type
    public int publicInt = 7;
    public boolean publicBool = false;
    public double publicDou = 1234D;
    public float publicFlo = 4321F;

    // protected
    // wrapper type
    protected Integer protectedInteger = 10;
    protected Boolean protectedBoolean = true;
    protected Double protectedDouble = 194910010.0D;
    protected Float protectedFloat = 13140.520F;
    // basic type
    protected int protectedInt = 70;
    protected boolean protectedBool = false;
    protected double protectedDou = 12340D;
    protected float protectedFlo = 43210F;

    // default
    // wrapper type
    Integer defaultInteger = 100;
    Boolean defaultBoolean = true;
    Double defaultDouble = 1949100100.0D;
    Float defaultFloat = 131400.520F;
    // basic type
    int defaultInt = 700;
    boolean defaultBool = false;
    double defaultDou = 123400D;
    float defaultFlo = 432100F;

    // private
    // wrapper type
    private Integer privateInteger = 1000;
    private Boolean privateBoolean = true;
    private Double privateDouble = 19491001000.0D;
    private Float privateFloat = 1314000.520F;
    // basic type
    private int privateInt = 7000;
    private boolean privateBool = false;
    private double privateDou = 1234000D;
    private float privateFlo = 4321000F;

    // object
    private static OtherClassWithToString otherClassWithToString = new OtherClassWithToString();


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
        sleep(2);
        return otherClass;
    }

    private static String throwMethod(int nextInt) {
        if (nextInt % 7 == 0) {
            throw new RuntimeException("occor error, message is blabla");
        } else {
            sleep(3);
            return "success";
        }
    }

    public static Map<String, Object> multiParamMethod(int i, String s, List<Double> doubleList) {
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();
        stringObjectMap.put("i", i);
        stringObjectMap.put("s", s);
        stringObjectMap.put("doubleList", doubleList);
        sleep(1);
        return stringObjectMap;
    }

    static List<Double> listMethod(double v) {
        List<Double> result = new ArrayList<Double>();
        result.add(v);
        sleep(1);
        return result;
    }

    static int intMethod(String java) {
        sleep(1);
        return java.length();
    }

    private static void voidMethod(int i) {
        i = 7;
        String n = "11";
        n += i;
        sleep(1);
        System.out.println(n);
    }
}
