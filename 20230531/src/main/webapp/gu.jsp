<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<div><h1>9x9</h1></div>
	<div>
	<% 
	for(int i=2;i<=9;i++){%>
		2*<%=i %>=<%=2*i %><br>
		
	<%}%>
	</div>
	<!-- 
	<%@ %>는 jsp가 쓰는 지시자이다
	<%! %>는 선언 예: 변수선언
	<% %>내에 자바실행코드 입력
	<%= %>화면에 보여줄 출력문
	
	
	
	 -->
	
	
</div>
</body>
</html>