<%@  page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="Person" class="jspprj.Person" scope="page"/>
<jsp:setProperty name="Person" property="*"/>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 Name: <jsp:getProperty name="Person" property="name"/><br/>
  PNo: <jsp:getProperty name="Person" property="pno"/><br/>
        <br/>
        <form name="NewFile3" method="POST" action="NewFile3.jsp">
            Enter a name: <input type="text" name="name" size="50"><br/>
            Enter a number: <input type="text" name="pno" size="50"><br/>
            <input type="submit" value="Test the Bean">
        </form>

</body>
</html>