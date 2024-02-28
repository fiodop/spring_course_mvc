<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
  <body>
    <h2>Enter your details</h2>
    <form:form action="showDetails" modelAttribute="Employee">
      Name: <form:input path="name" />
      Surname: <form:input path="surname" />
      Department: <form:input path="department" />
      <input type="submit" value="Ok" />
    </form:form>
  </body>
</html>
