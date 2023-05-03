package com.example.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.cruddemo.model.Hospital;
import com.example.cruddemo.repository.Hospitalrepository;

import jakarta.transaction.Transactional;
@Service
public class Hospitalservice {
    @Autowired
    Hospitalrepository hr;

	public List<Hospital> all() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	public Hospital getdetailsById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return hr.findById(id).orElse(null);
	}

	public void deletedetailsById(int id) {
		// TODO Auto-generated method stub
		 hr.deleteById(id);
	}

	public void posttdetailsById(Hospital b) {
		// TODO Auto-generated method stub
		hr.save(b);
	}

	public Hospital putdetailsById(Hospital c) {
		// TODO Auto-generated method stub
		return hr.save(c);
	}

	public List<Hospital> sorts(String field) {
		// TODO Auto-generated method stub
		return hr.findAll(Sort.by(Direction.DESC,field));
	}

	public List<Hospital> paginghos(int offset, int pagesize) {
		// TODO Auto-generated method stub
		Pageable paging=PageRequest.of(offset,pagesize);
		Page<Hospital> obj=hr.findAll(paging);
		List<Hospital> sc=obj.getContent();
		return sc;
	}

	public List<Hospital> pagehos(int offset, int pageSize, String field) {
		// TODO Auto-generated method stub
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Hospital> obj=hr.findAll(paging);
		List<Hospital> sc=obj.getContent();
		return sc;
	}
    public List<Hospital> fetchHospitalByName(String prefix)
    {
    	return hr.findByNameStartingWith(prefix);
    }
    public List<Hospital> fetchHosByName(String suffix)
    {
    	return hr.findByNameEndingWith(suffix);
    }

	public List<Hospital> fetchHosByGname(String gname) {
		// TODO Auto-generated method stub
		return hr.findByGname(gname);
	}
	/*public List<Hospital>getHospitalName(String name,String gname)
	{
		return hr.getHospitalByName(name,gname);
	}*/

	public List<Hospital> getHospitalName(String name) {
		// TODO Auto-generated method stub
		return hr.getHospitalByName(name);
	}
    @Transactional
	public int deleteHospitalByName(String name) {
		// TODO Auto-generated method stub
		return hr.deleteHosByName(name);
	}

    @Transactional
   	public int updateHospitalByName(String gname,String name) {
   		// TODO Auto-generated method stub
   		return hr.updateHospitalByName(gname,name);
   	}

	

}
