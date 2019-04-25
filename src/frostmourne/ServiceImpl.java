package frostmourne;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {

    private Dao dao = new DaoImpl();
    @Override
    public List<String> doService(Integer i, String s) {
        List<String> result = new ArrayList<>();
        String s2 = privateMethod(i, s);
        result.add(s2);
        result.add(String.valueOf(i));
        result.add(s);
        String s1 = dao.doDao(result);
        result.add(s1);
        return result;
    }

    private String privateMethod(Integer i, String s) {
        return String.valueOf(i) + "===" + s;
    }
}
