<%@ page contentType="text/html" %>
<%@ page errorPage="error.jsp" %>
<html><head><title>Error Handling</title></head>
<body>
<form method="post" action="NewFile4.jsp">
Number1: <input type="text" name="num1"> divided by
Number2: <input type="text" name="num2">
<input type="submit" value="=">
Result: <input type="text" name="result" value="
<% String num1=request.getParameter("num1");
   String num2=request.getParameter("num2");
  if (num1!=null && num2!=null){
    int n1=Integer.parseInt(num1); 
     int n2=Integer.parseInt(num2); 
    int r= n1/n2;
        out.print( r);    }  %>
">

</form>
</body>
</html>