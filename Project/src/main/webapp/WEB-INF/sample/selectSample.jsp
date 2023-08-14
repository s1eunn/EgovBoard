<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세</title>
</head>
<body>
	<center>
		<h1>상세보기</h1>
		<form action="updateSample.do" method="post">
			<input name="id" type="hidden" value="${sample.id}"/>
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="yellow" width="70">아이디</td>
					<td align="left"><input name="id" type="text" value="${sample.id}" disabled="disabled"/></td>
				</tr>
				<tr>
					<td bgcolor="yellow">제목</td>
					<td align="left"><input name="title" type="text" value="${sample.title}" size="52"/></td>
				</tr>
				<tr>
					<td bgcolor="yellow">작성자</td>
					<td align="left"><input name="regUser" type="text" value="${sample.regUser}" disabled="disabled"/></td>
				</tr>
				<tr>
					<td bgcolor="yellow">내용</td>
					<td align="left"><textarea name="content" cols="40" rows="5">${sample.content}</textarea></td>
				</tr>
				<tr>
					<td bgcolor="yellow">등록일</td>
					<td align="left">${sample.regDate}</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="UPDATE"/>
					</td>
				</tr>
			</table>
		</form>
		<br>
		<a href="insertSample.do">INSERT</a>&nbsp;&nbsp;&nbsp;
		<a href="selectSampleList.do">LIST</a>
	</center>
</body>
</html>