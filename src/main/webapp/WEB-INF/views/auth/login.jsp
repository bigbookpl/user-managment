<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Logowanie</h1>
    <form action="/auth/login" method="POST">
        Username: <input type="text" name="username">
        Password: <input type="password" name="password">
        <input type="submit" value="login"/>
    </form>

</body>
</html>