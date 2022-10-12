
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link rel="stylesheet" href="css/common.css">
    <title>Full News</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>

  <form action="fullNews" method="post">
    <div class="text-block">
      <c:forEach var="img" items="${imgList}">
        <img src="<c:out value="${img}" />" class="img-fluid" alt="..." height="250" width="300">
      </c:forEach>
      <br>
      <br>
      <p><c:out value="${textNews}" /></p>
      <br>
      <a href="<%=request.getContextPath()%>/news" class="btn btn-secondary">Назад в новости</a>
    </div>
  </form>
</body>
</html>
