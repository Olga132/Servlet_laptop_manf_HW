
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>News</title>
</head>
<body>
    <jsp:include page="navbar.jsp"/>
    <c:forEach var="news" items="${listNews}">
        <div class="card mb-3" style="max-width: 100%">
            <div class="row g-0">
                <div class="col-md-4">
                    <img src="<c:out value="${news.srcImg}" />" class="img-fluid rounded-start" alt="..." width="600" height="550">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title"><c:out value="${news.name}" /></h5>
                        <p class="card-text"><c:out value="${news.text}" /></p>
                        <a href="fullNews?id=<c:out value='${news.id}' />">Full news</a>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</body>
</html>
