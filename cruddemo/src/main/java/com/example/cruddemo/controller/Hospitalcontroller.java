package com.example.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruddemo.model.Hospital;
import com.example.cruddemo.service.Hospitalservice;

@RestController
public class Hospitalcontroller {
	@Autowired
	Hospitalservice hs;
	@GetMapping(value="/id")
	public List<Hospital> all(){
		return hs.all();
	}
	@GetMapping("/id/{id}")
	public Hospital getdetailsById(@PathVariable int id) {
		return hs.getdetailsById(id);
	}
	@DeleteMapping("/id/{id}")
	public String deletedetailsById(@PathVariable int id) {
		    hs.deletedetailsById(id);
		    return "deleted successfully";
	}
	@PostMapping("/save")
	public String postdetailsById(@RequestBody Hospital b) {
		    hs.posttdetailsById(b);
		    return "saved successfully";
	}
	@PutMapping("/put")
	public Hospital putdetailsById(@RequestBody Hospital c) {
		   return hs.putdetailsById(c);
		   
	}
    @GetMapping("/sort/{field}")
    public List<Hospital> sorts(@PathVariable String field)
    {
    	return hs.sorts(field);
    }
    @GetMapping("/paging/{offset}/{pagesize}")
    public List<Hospital>paginghos(@PathVariable int offset,@PathVariable int pagesize)
    {
    	return hs.paginghos(offset,pagesize);
    }
    @GetMapping("/paging/{offset}/{pageSize}/{field}")
    public List<Hospital>pagehos(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
    {
    	return hs.pagehos(offset,pageSize,field);
    }
    @GetMapping("/fetchHospitalByNamePrefix")
    public List<Hospital> fetchHospitalByNamePrefix(@RequestParam String prefix)
    {
    	return hs.fetchHospitalByName(prefix);
    }
    @GetMapping("/fetchHosByNameSuffix")
    public List<Hospital> fetchHospitalByNameSuffix(@RequestParam String suffix)
    {
    	return hs.fetchHosByName(suffix);
    }
    @GetMapping("/fetchByGname")
    public List<Hospital> fetchHospitalByGname(@RequestParam String gname)
    {
    	return hs.fetchHosByGname(gname);
    }
    /*@GetMapping("/fetchHospitalByName/{name}/{gname}")
    public List<Hospital> getHospitalsByName(@PathVariable String name,@PathVariable String gname)
    {
    	return hs.getHospitalName(name, gname);
    }*/
    /*@GetMapping("/fetchHospitalByName/{name}")
    public List<Hospital> getByName(@PathVariable String name)
    {
    	return hs.getHospitalName(name);
    }*/
    @GetMapping("/deleteHospitalByName/{name}")
    public String deleteHospitalName(@PathVariable String name)
    {
    int result=hs.deleteHospitalByName(name);
    if(result >0)
    	return "Student record deleted";
    else
    	return "Problem occured while deleting";
    }
    @PutMapping("/updateHoByName/{gname}/{name}")
    public String updateHospitalName(@PathVariable String gname,@PathVariable String name)
    {
    int result=hs.updateHospitalByName(gname,name);
    if(result >0)
    	return "Student record updated";
    else
    	return "Problem occured while updating";
    }
   
}
