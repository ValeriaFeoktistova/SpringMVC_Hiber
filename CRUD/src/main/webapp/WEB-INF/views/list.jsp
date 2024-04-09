<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

</html>

<body>
<h2>List if Users</h2>
</body>
<table>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Pet</th>
        <th>Hobby</th>
    </tr>

    <tr th:each="user : ${users}">
        <td th:text="${user.name}"></td>
        <td th:text="${user.age}"></td>
        <td th:text="${user.pet}"></td>
        <td th:text="${user.hobby}"></td>
        <td>

            <table>
                <tr>
                    <td>
                        <form th:action="@{/updateInfo}" method="post">
                            <input type="hidden" name="userId" th:value="${user.id}"/>
                            <button type="submit">Update</button>
                        </form>
                    </td>
                    <td>
                        <form th:action="@{/deleteInfo}" method="get">
                            <input type="hidden" name="userId" th:value="${user.id}"/>
                            <button type="submit">Delete</button>
                        </form>
                    </td>
                </tr>
            </table>
        </td>
    </tr>

    </tbody>
</table>
<br>

<form th:action="@{/addNewUser}" method="get">
    <button type="submit">Add</button>
</form>



</html>
