<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <title>List of Users</title>
</head>

<body>
<h1>List of Users</h1>
<h2>Create New User</h2>
<form  th:action="@{/create}" th:object="${user}" method="post">
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" th:field="*{name}" required>
    </div>
    <div>
        <label for="age">Age:</label>
        <input type="number" id="age" th:field="*{age}" required>
    </div>
    <div>
        <label for="pet">Pet:</label>
        <input type="text" id="pet" th:field="*{pet}" required>
    </div>
    <div>
        <label for="hobby">Hobby:</label>
        <input type="text" id="hobby" th:field="*{hobby}" required>
    </div>
    <div>
        <input type="submit" value="OK">
    </div>
</form>
</body>
</html>
