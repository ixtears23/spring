<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<title>Insert title here</title>
<script>
	var map = "<c:out value='${map }'/>";
	var map2 = '${map}';
	console.log(map);
</script>

</head>

<body>
	<spring:message code="title"/>
	<form>
<%-- 	<c:set var="t" value="<script type='text/javascript'>alert(1);</script>" /> --%>
		${t}
<%-- 	<c:out value="${t}" escapeXml="true" /> --%>
	<c:out value="${t}" escapeXml="false" />
	
		<input type="text" name="map" value="<c:out value="${map }"/>"/>
		<input type="text" name="map2" value="<c:out value="${map2 }"/>"/>
	
	</form>
	<h1>반갑습니다.</h1>
	<h2>저는 도리삼춘 입니다.</h2>
</body>
</html>