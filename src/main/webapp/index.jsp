<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Page Title</title>
<link rel="stylesheet" href="<c:url value="/resources/css/Style.css"/>">
</head>
<body>

<jsp:include page="/resources/Header.jsp"></jsp:include>
	<table align="center">
		<a href=Home>Home</a><br>
		<a href=MRegistrationForm>Member Registration Form</a><br>
		<a href=CRegistrationForm.jsp>Client Registration Form</a><br>
		<a href=LoginForm.jsp>Login Here</a>
	</table>
	<jsp:include page="/resources/Footer.jsp"></jsp:include>

</body>
</html>