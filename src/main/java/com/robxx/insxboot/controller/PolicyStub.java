package com.robxx.insxboot.controller;

import com.robxx.insxboot.model.Policy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolicyStub {

    private static Map<Long, Policy> policies = new HashMap<Long, Policy>();
    private static Long idIndex = 3L;

    // populate initial policies
    static {
        Policy p1 = new Policy(1L, "David Smith", "Ford", "Focus",
                "DU14 LVX", "david.smith@mail.com", 210.25f);
        policies.put(1L, p1);
        Policy p2 = new Policy(1L, "Sarah Pritchard", "Audi", "A4",
                "YT06 ZKT", "sarah.pritchard@mail.com", 582.95f);
        policies.put(2L, p2);
        Policy p3 = new Policy(1L, "James Jones", "BMW", "325",
                "VA57 JVK", "james.jomes@mail.com", 755.40f);
        policies.put(3L, p3);
    }

    public static List<Policy> list() {
        return new ArrayList<Policy>(policies.values());
    }

    public static Policy create(Policy p) {
        idIndex += idIndex;
        p.setId(idIndex);
        policies.put(idIndex, p);
        return p;
    }

    public static Policy get(Long id) {
        return policies.get(id);
    }

    public static Policy update(Long id, Policy p) {
        policies.put(id, p);
        return p;
    }

    public static Policy delete(Long id) {
        return policies.remove(id);
    }

}
