package com.robxx.insxboot.controller;

import com.robxx.insxboot.model.Policy;
import com.robxx.insxboot.repository.PolicyRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PolicyController {

    @Autowired
    private PolicyRepository policyRepository;

    @RequestMapping(value = "policies", method = RequestMethod.GET)
    public List<Policy> list() {
        //return PolicyStub.list();
        return policyRepository.findAll();
    }

    @RequestMapping(value = "policies", method = RequestMethod.POST)
    public Policy create(@RequestBody Policy p) {
        // return PolicyStub.create(p);
        return policyRepository.saveAndFlush(p);
    }

    @RequestMapping(value = "policies/{id}", method = RequestMethod.GET)
    public Policy get(@PathVariable Long id) {
        //return PolicyStub.get(id);
        return policyRepository.findOne(id);
    }

    @RequestMapping(value = "policies", method = RequestMethod.PUT)
    public Policy update(@PathVariable Long id, @RequestBody Policy p) {
        //Policy existingPolicy = PolicyStub.get(id);
        Policy existingPolicy = policyRepository.findOne(id);
        BeanUtils.copyProperties(p, existingPolicy);
        //return PolicyStub.update(id, p);
        return policyRepository.saveAndFlush(existingPolicy);
    }

    @RequestMapping(value = "policies", method = RequestMethod.DELETE)
    public Policy delete(@PathVariable Long id) {
        //Policy existingPolicy = PolicyStub.get(id);
        Policy existingPolicy = policyRepository.findOne(id);
        //PolicyStub.delete(id);
        policyRepository.delete(id);
        return existingPolicy;
    }

}
