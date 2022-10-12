
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Laptop</title>
</head>
<body>
    <jsp:include page="navbar.jsp"/>
    <div class="text-block">
        <c:forEach var="content" items="${listLaptop}">
            <div class="card mb-3" style="max-width: 100%">
                <div class="row g-0">
                    <div class="col-md-4">
                        <img src="<c:out value="${content.srcImg}" />" class="img-fluid rounded-start" alt="..." width="350" height="300">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title"><c:out value="${content.name}" /></h5>
                            <p class="card-text"><c:out value="${content.characteristics}" /></p>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
