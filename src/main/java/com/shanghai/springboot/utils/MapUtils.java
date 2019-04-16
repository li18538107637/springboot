package com.shanghai.springboot.utils;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    public static Map toMap(Object... params) {
        Map conditionMap = new HashMap();
        for (int i = 0; i < params.length; i += 2) {
            conditionMap.put(params[i], params[i + 1]);
        }
        return conditionMap;
    }
}
