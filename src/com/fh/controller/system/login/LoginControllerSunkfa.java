package com.fh.controller.system.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.controller.base.BaseController;

@Controller
public class LoginControllerSunkfa extends BaseController {
	@Resource(name = "StaffService")
	private StaffService StaffService;

	/**
	 * 登陆
	 */
	@RequestMapping(value = "/login_login",method=RequestMethod.POST)
	public @ResponseBody  JSONArray login(HttpSession session) throws Exception {
		mv.clear();
		pd = this.getPageData();
		String name = pd.get("name").toString();
		String password = pd.get("password").toString();
		System.out.println(name);
		System.out.println(password);
		pd.put("name", name);
		pd.put("password", password);
		pd = StaffService.getUserByNameAndPwd(pd);
		System.out.println(pd);
		JSONObject member1 = new JSONObject();
		member1.put("success", "1");
		member1.put("staffid", pd.getString("staffid"));
		member1.put("name", pd.getString("name"));
		member1.put("departmentid", pd.getString("departmentid"));
		member1.put("departmentid", pd.getString("department"));
		JSONArray jsonMembers = new JSONArray();  
		jsonMembers.add(member1);
		mv.addObject("aa", jsonMembers);
		System.out.println(jsonMembers);
		return jsonMembers;
	}

}
