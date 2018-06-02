<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>View All Student Details List</h1>
<table>
<tr><th>Name</th><th>Address</th><th>Marks</th></tr>
<c:forEach var="student" items="list">
<tr>
<td>${student.name}</td>
<td>${student.address}</td>
<td>${student.marks}</td>
<td><a href="delete/{student.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>