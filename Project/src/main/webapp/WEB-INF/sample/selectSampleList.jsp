<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample 목록</title>

</head>
<body>
	<center>
		<h1>Sample 목록</h1>

		<table border="1" cellpadding="0" cellspacing="0" width="800">
			<tr>
				<th bgcolor="yellow" width="60">아이디</th>
				<th bgcolor="yellow" width="220">제목</th>
				<th bgcolor="yellow" width="40">작성자</th>
				<th bgcolor="yellow" width="60">등록일</th>
				<th bgcolor="yellow" width="40">조회수</th>
				<th bgcolor="yellow" width="40">삭제</th>
			</tr>
			
			<c:forEach var="sample" items="${sampleList}">
				<tr>
					<td align="center"><a href="selectSample.do?id=${sample.id}">${sample.id}</a></td>
					<td>${sample.title}</td>
					<td align="center">${sample.regUser}</td>
					<td align="center">${sample.regDate}</td>
					<td align="center">${sample.readCount}</td>
					<td align="center"><a href="deleteSample.do?id=${sample.id}">삭제</a>
				</tr>
			</c:forEach>
		</table>
		<br>
		
		<br><br>
		<a href="insertSample.do">Sample등록</a>
		<br><br>
		<a href="index.jsp">홈으로</a>
		
	</center>

</body>
</html>