<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="java.util.*"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	List styles = (List)request.getAttribute("styles");
	Iterator it = styles.iterator();
	while(it.hasNext()) {
		out.print("<br>try: " + it.next());
	}
	
 %>
 
 <br>
 <%
 	String[] sizes = request.getParameterValues("sizes");
 	if(sizes != null)
 	{
 		for(int i = 0; i < sizes.length; ++i)
	
	 	{
	 		out.println("<br>sizes: "+sizes[i]);
	 	}
 	}
 
 %>
</body>
</html>