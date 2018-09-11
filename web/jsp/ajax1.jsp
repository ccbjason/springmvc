<%--
  Created by IntelliJ IDEA.
  User: jason-note
  Date: 2018/9/6
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
<script>
    function requestByJson() {
        var personList = [];
        personList.push({"username": "李四","age": "23","password":"1111"});
        personList.push({"username": "张三","age": "12","password":"2222"});
        $.ajax({
            type: "POST",
            url: "../ajaxgetUser.do",
             //data : JSON.stringify($('form').serialize()),//将form下的对象序列化成JSON字符串
            data: JSON.stringify(personList),//将对象序列化成JSON字符串
            contentType: 'application/json;charset=utf-8', //设置请求头信息
            success: function (data) {
                alert("data"+data);
            },
            error:function(XMLHttpRequest, textStatus, errorThrown) {
                alert(XMLHttpRequest.status); // 200
                alert(textStatus); // 200
                alert(errorThrown); // SyntaxError: Unexpected end of input
    }
    });

    }
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    账号1：<input type="text" id="username" name="username"/><br>
    密码1：<input type="text" id="password" name="password"/>
    <input type="button" value="查询" onclick="requestByJson()" >

</form>

</body>
</html>
