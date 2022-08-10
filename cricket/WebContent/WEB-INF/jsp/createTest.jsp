<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<title>Insert title here</title>
</head>
<body>
<form:form action="createTest" modelAttribute="testBo">
<form:input path="name" placeholder="Enter the Name"/>
<form:input path="dof" placeholder="Enter the Date Of Birth"/>
<form:input path="runs" plaeholder="Enter the Runs"/>
<form:button>Save</form:button>
</form:form>
</body>
</html>