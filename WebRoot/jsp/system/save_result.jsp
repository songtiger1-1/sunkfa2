<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>保存结果</title>
<meta name="description" content="overview & stats" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<script type="text/javascript" src="/UIML/js/jquery-1.7.2.js"></script>

</head>
<script type="text/javascript">
$.ajax({
    type: "POST",
    url: "http://localhost:8080/UIML/login_login.do",
    cache: false,
    dataType:"text",
    data: {"name":"a","password":"123456"},
    success: function(msg){
      
        var result = JSON.parse(msg);
        if (result.success == 1) {
            userInfo = result;
            $("#sreport2").hide();
        }
        else {
            alert("用户名或密码错误");
        }
      

    },
    error: function (XMLHttpRequest, textStatus, errorThrown) {
        // 通常 textStatus 和 errorThrown 之中
        // 只有一个会包含信息
        alert("错误:" + textStatus);
        this; // 调用本次AJAX请求时传递的options参数
    },
    complete: function (XMLHttpRequest, textStatus) {
this; // 调用本次AJAX请求时传递的options参数
}
});


		
		
	</script>
<body>
	

</body>
</html>