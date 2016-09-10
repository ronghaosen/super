<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/default/easyui.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/jslib/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/jslib/jquery.easyui.min.js"></script>
<title>HOME PAGE</title>
</head>
<body>


<body class="easyui-layout"> 
	<div data-options="region:'north',href:'${pageContext.request.contextPath }/static_file/north.jsp'" style="height:120px;background:url(${pageContext.request.contextPath}/pic/background.jpg) left no-repeat #addbff"></div>   
    <div data-options="region:'west',title:'管理菜单',split:true" style="width:100px;"></div>   
    <div data-options="region:'center',title:'数据展示区域'" style="padding:5px;background:#eee;"></div>   
</body> 


</body>
</html>