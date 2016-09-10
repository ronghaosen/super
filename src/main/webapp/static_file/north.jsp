<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head>
<body> 


	
	<div id="div1" style="position:absolute;left:1200px;top:95px;">用户名:${user.username }</div>
	<div><a id="logout" class="easyui-linkbutton" style="position:absolute;left:1300px;top:90px;color:blue">退出</a></div>


<script type="text/javascript">
	$(document).ready(function(){
		$("#logout").click(function(){
			$.ajax({
				url:'${pageContext.request.contextPath}/user/logout.action',
				type:'POST',
				async:false,
				data:"uid=${user.uid}",
				success:function(){
					window.top.location.href="${pageContext.request.contextPath}/index.jsp";
				}
			});
		});
	});
</script>
	
</body> 
</html>