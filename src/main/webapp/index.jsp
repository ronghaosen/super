<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"  type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/signIn.css">
<title>Super Login In</title>
</head>
<body>

<div class="container">
	<div style="color:red;position:relative;left:500px;">${msg }</div>
      <form id="loginform" class="form-signin" action="${pageContext.request.contextPath }/user/login.action" method="post">
        <input type="text" name="username" class="form-control" placeholder="Username">
        <input type="password" name="password" class="form-control" placeholder="Password">
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in">
      </form>
</div>




<script type="text/javascript" src="${pageContext.request.contextPath }/jslib/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/jslib/bootstrap.min.js"></script>
</body>
</html>