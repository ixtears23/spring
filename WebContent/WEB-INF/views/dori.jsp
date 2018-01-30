<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <script src="https://code.jquery.com/jquery-1.10.2.js"></script> -->
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"
		integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
		crossorigin="anonymous"></script>
<script>
	
	$(document).ready(function() {
		
		$("#btnSearch").on("click", function(e) {
			e.preventDefault();
			
			$.post( contextPath + "/home/setUser.json", $("#form").serialize())
			  .done(function( data ) {
			    alert( "Data Loaded: " + data );
			  });
			
		});
	})
	
	$.fn.postAjax = function () {
		
	}
	
	$( document ).ajaxComplete(function() {
		  $( ".log" ).text( "Triggered ajaxComplete handler." );
	});
	
	
	function ajax(){
		$.ajax({
			  type: "POST",
			  url: url,
			  data: data,
			  success: success,
			  dataType: dataType
			});
		
		$.post( "ajax/test.html", function( data ) {
			  $( ".result" ).html( data );
			});
	}
	
</script>

</head>

<body>
	<spring:message code="title" />
	<form id="form">
		<table>
			<colgroup>
				<col width="10%">
				<col width="90%">
			</colgroup>
			<thead>
			</thead>
			<tbody>
				<tr>
					<th>
						<label for="id">아이디</label>
					</th>
					<td>
						<input type="text" id="id" name="id" required="required"/>
					</td>
				</tr>
				<tr>
					<th>
						<label for="id">이름</label>
					</th>
					<td>
						<input type="text" id="name" name="name" required="required"/>
					</td>
				</tr>
				<tr>
					<th>
						<label for="password">비밀번호</label>
					</th>
					<td>
						<input type="text" id="password" name="password" required="required"/>
					</td>
				</tr>
			</tbody>
			<tfoot>
			
			</tfoot>		
		</table>
		<input type="button" id="btnSearch" name="btnSearch" value="등록"/>
		
	
	</form>
	
	<div class="trigger">Trigger</div>
	<div class="result"></div>
	<div class="log"></div>
</body>
</html>