package com.youkeshu.ht.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.youkeshu.ht.service.TestSer;

@RestController
@RequestMapping(value="/index")
public class TestCtrl {
	@Autowired
	private TestSer testSer;
	
	@RequestMapping(value="/",method=RequestMethod.GET,params={"name"})
	public String getInfo(@RequestParam(value="id",required=true) Integer id,
			@RequestParam(value="name",required=false) String name){
		return "hellobaby";
	}
}
