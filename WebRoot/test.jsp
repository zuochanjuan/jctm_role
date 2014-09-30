<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="http://${header['host']}${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap学习测试页</title>
    <!-- Bootstrap -->
    <link href="${ctx}/bootstrap/css/bootstrap.css" rel="stylesheet">
  </head>
  <body>
    <table  class="table table-bordered" style="width:60%">	
    	<tr><td>姓名</td><td>性别</td></tr>
    	<tr  class="success"><td>zcj</td><td>Female</td></tr>
    	<tr  class="warning"><td>zs</td><td>Female</td></tr>
    	<tr><td>zcj</td><td>Female</td></tr>
    	<tr><td>zcj</td><td>Female</td></tr>
    	<tr><td>zcj</td><td>Female</td></tr>
	</table>

    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="${ctx}/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>