<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>
Student Confirmation

</title>

</head>
<body>

The student is confirmed : ${student.fname} ${student.lname} ${student.country } ${student.language}

Operating Systems :

<ul>
	<c:forEach var="temp" items="${student.os}">
		<li> ${temp} </li>
	</c:forEach>
</ul>



</body>

</html>

