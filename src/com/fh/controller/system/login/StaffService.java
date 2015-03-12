package com.fh.controller.system.login;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fh.dao.DaoSupport;
import com.fh.util.PageData;
@Service("StaffService")
public class StaffService {
	@Resource(name = "daoSupport")
	private DaoSupport dao;
	/*
	* 登录判断
	*/
	public PageData getUserByNameAndPwd(PageData pd)throws Exception{
		return (PageData)dao.findForObject("StaffMapper.getStaffInfo", pd);
	}
}
