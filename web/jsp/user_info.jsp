<%--
  Created by IntelliJ IDEA.
  User: jason-note
  Date: 2018/9/5
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    $().ready(function(){

        $("#but1").click(function () {
           var userNumber = $("#userNumber").val();
           if(userNumber.length==0)
           {
               alert("输入账号！")
           }
           else
           {
               $.post("ajaxUser.do",{userNumber:userNumber},function (data) {
                   alert(data);
               });
           }
        });
    });

//---------------------------
    $().ready(function() {

        $("#but2").click(function () {

            var username = $("#username2").val();
            alert(username);
            $.post(
                "ajaxgetUser.do",
               function (result) {
                    for(var i=0;i<=result.length;i++)
                    {
                        alert(result[i].userId+result[i].username+result[i].age+result[i].password);
                    }
               alert(result);
             });

        });
    });
//------------------------

    function requestByJson() {
        var name=$("#username").val();
        var psd=$("#password").val();
        var userJson={"username":name,"password":psd};
        $.ajax({

            type : 'post',

            url : 'ajaxgetUser.do',
           // contentType : "application/json",              //发送至服务器的类型
           // dataType : "json",                                     //预期服务器返回类型
            data : userJson,

            success : function(result) {
//
                for(var i=0;i<=result.length;i++)
                {
                    alert(result[i].userId+result[i].username+result[i].age+result[i].password);
                }
                alert(result);

            }

        });

    }

</script>


<html>

<head>
    <title>Title</title>
</head>
<body>
<hr>
账号212：<input type="text" id="userNumber" name="userNumber"/><input id="but1" type="button" value="验证" >
</hr>
<br>
<hr>
账号aaaaa：<input type="text" id="username2" name="username2"/><br>
<input type="button" id="but2" name="but2" value="but2" >
</hr>
<hr>
<form>
    账号1：<input type="text" id="username" name="username"/><br>
    密码1：<input type="text" id="password" name="password"/>
    <input type="button" value="查询" onclick="requestByJson()" >

</form>

</hr>

<p>If you click on me, I will disappear.</p>
</body>
</html>
