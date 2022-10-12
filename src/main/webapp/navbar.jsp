
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Navbar</title>
</head>
<body>
<header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src="https://w7.pngwing.com/pngs/210/467/png-transparent-hewlett-packard-house-and-garage-logo-dell-icon-hp-ink-text-trademark-thumbnail.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
                </a>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/main">Главная</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/history.jsp">История</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/news">Новости</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/laptop">Модели ноутбуков</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
</body>
</html>
