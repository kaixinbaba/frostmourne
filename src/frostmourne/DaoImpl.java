package frostmourne;

import java.util.List;

public class DaoImpl implements Dao {
    @Override
    public String doDao(List<String> list) {
        return String.valueOf(list.size());
    }
}
