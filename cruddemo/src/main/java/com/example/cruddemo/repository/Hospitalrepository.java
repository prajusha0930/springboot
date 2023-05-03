package com.example.cruddemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.Hospital;

@Repository
public interface Hospitalrepository extends JpaRepository<Hospital,Integer> {
    //positional parameter
	/*@Query("select s from Hospital s where s.gname=?1 and s.name=?2")
	public List<Hospital>getHospitalByName(String gname,String name);*/
	//named parameter
	@Query("select s from Hospital s where s.name=:name")
	public List<Hospital>getHospitalByName(String name);
	//
		@Modifying
		@Query("delete from Hospital s where s.name=?1")
		public int deleteHosByName(String name);
		@Modifying
		@Query("update Hospital s set s.gname=?1 where s.name=?2")
		public int updateHospitalByName(String gname,String name);
		
		@Query(value="select * from Hospital s where s.email=?1",nativeQuery=true)
		public List<Hospital> fetchHospitalByMail(String mail);
List<Hospital> findByNameStartingWith(String prefix);
List<Hospital> findByNameEndingWith(String suffix);
List<Hospital> findByGname(String gname);
}
