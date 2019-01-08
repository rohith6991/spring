<head>
        <%@ page isELIgnored="false" %>
</head>

<html>
<body>

<h2>HTML Forms</h2>

<form action="/addUser" method="POST">
Username: <input type="text" name="user" ><br>
Password: <input type="password" name="password">
<input class="btn btn-md btn-success btn-block" type="submit">
</form>

</body>
</html>