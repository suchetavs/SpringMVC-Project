<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<body>

<form:form action="processForm" modelAttribute="student">

First Name <form:input path="fname"/>
<br><br>
Last Name <form:input  path="lname"/>
<br><br>

Country <form:select path="country"

 items="${student.countries}"/>
<br><br>

Favorite Language <form:radiobuttons path="language" 

items="${student.languages}"/>

<br><br>

Operating Systems :

<form:checkboxes path="os" items="${student.operatingSystems}"/>

<br><br>

<input type="submit" value="Submit" />


</form:form>



</body>




</head>





</html>