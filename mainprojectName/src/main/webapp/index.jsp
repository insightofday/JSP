<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
el표현식(아마도servlet의 기능?) (이게 끗):if 같은 거 않되(외부라이브러리로 다른 기능 추가 ㄱㄴ/jstl로 가능)
프론트와 관련된 라이브러리는 lib폴더에 넣고 buildpath에 추가(이렇게하면 referenced libraries가 추가되고 그 안에 생김),(jstl포함)
백과 관련된 라이브러리는 pom의 dependency에 추가해야 함
<p> 5+2=${ 5+2}
<p>5-2 =${ 5-2}
<p>  5*2=${ 5*2}
<p> 5/2 =${ 5/2}

<p> ${ "관계연산자"}
<p>5>2=${5>2 }

<c:if test="${name eq'haha' }"> 오답입니다</c:if>
<c:if test="${empty name }">correct!</c:if>
<h1>jstl표현식</h1>

jstl변수선언
<c:set var="name" value="nana"></c:set>


<c:if test="${empty name  }">
<h1>${name }</h1>
</c:if>

<c:choose>
	<c:when test="${name eq '니니'}">니니입니다</c:when>
	<c:when test="${name eq 'nana'}">나나입니다</c:when>
	<c:otherwise>${name} </c:otherwise>
</c:choose>

<c:forEach var="i" begin="0" end="10" step="5">
	<h1>${i }</h1><br>
</c:forEach>

<c:forEach items="${itens }" var="name">
<h1>${name }</h1>
</c:forEach>



</body>
</html>