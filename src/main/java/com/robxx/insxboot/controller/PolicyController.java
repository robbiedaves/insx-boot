package com.robxx.insxboot.controller;

import com.robxx.insxboot.model.Policy;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PolicyController {

    @RequestMapping(value = "policies", method = RequestMethod.GET)
    public List<Policy> list() {
        return PolicyStub.list();
    }

    @RequestMapping(value = "policies", method = RequestMethod.POST)
    public Policy create(@RequestBody Policy p) {
        return PolicyStub.create(p);
    }

    @RequestMapping(value = "policies/{id}", method = RequestMethod.GET)
    public Policy get(@PathVariable Long id) {
        return PolicyStub.get(id);
    }

    @RequestMapping(value = "policies", method = RequestMethod.PUT)
    public Policy update(@PathVariable Long id, @RequestBody Policy p) {
        Policy existingPolicy = PolicyStub.get(id);
        BeanUtils.copyProperties(p, existingPolicy);
        return PolicyStub.update(id, p);
    }

    @RequestMapping(value = "policies", method = RequestMethod.DELETE)
    public Policy delete(@PathVariable Long id) {
        Policy existingPolicy = PolicyStub.get(id);
        PolicyStub.delete(id);
        return existingPolicy;
    }

}
