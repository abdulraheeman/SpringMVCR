<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
<h1>Add Student</h1>
<form:form action="save" method="post">
<table>
<tr>
<td>Id : </td>
<td><form:hidden path="id"/></td>
</tr>
<tr>
<td>Name : </td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Address : </td>
<td><form:input path="address"/></td>
</tr>
<tr>
<td>Marks : </td>
<td><form:input path="marks"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="save"></td>
</tr>

</table>
</form:form>
</body>

</html>