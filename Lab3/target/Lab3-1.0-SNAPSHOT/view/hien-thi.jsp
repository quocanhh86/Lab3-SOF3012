<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abc
  Date: 13/11/24
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<table border="1">
    <form action="/bai-hat/add" method="post">
        Tên Bài Hát <input type="text" name="tenBaiHat"> <br>
        Tên Tác Giả <input type="text"  name="tenTacGia"> <br>
        Thời Lượng <input type="text" name="thoiLuong"> <br>
        Ngày Sản Xuất <input type="date" name="ngaySanXuat"> <br>
        Giá <input type="text" name="gia"> <br>
        Phát Hành Đĩa
        <input type="radio"  name="phatHanhDia" value="true"> True
        <input type="radio"  name="phatHanhDia" value="false"> False
        <br>
        Ngày ra mắt <input type="date" name="ngayRaMat"> <br>
        <button type="submit" onclick="return confirm('Bạn có muốn add không')">Add</button>
    </form>
    <thead>
    <tr>
        <th>Tên bài hát</th>
        <th>Tên tác giả</th>
        <th>Thời lượng</th>
        <th>Ngày sản xuất</th>
        <th>Giá</th>
        <th>Phát hành đĩa</th>
        <th>Ngày ra mắt</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${listBaiHat}" var="bh">
            <tr>
                <td>${bh.tenBaiHat}</td>
                <td>${bh.tenTacGia}</td>
                <td>${bh.thoiLuong}</td>
                <td>${bh.ngaySanXuat}</td>
                <td>${bh.gia}</td>
                <td>${bh.phatHanhDia}</td>
                <td>${bh.ngayRaMat}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
