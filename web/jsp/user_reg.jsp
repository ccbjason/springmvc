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
        var empno=$("#empno").val();
        var phone=$("#phone").val();
        var clsize=$("#clsize").val();
        var sex=$("#sex").val();
        var runtype=$("#runtype").val();
        var cardid=$("#cardid").val();
        // alert(111111);
        var userJson={"username":name,"password":psd,"empno":empno,"phone":phone,"clsize":clsize,"sex":sex,"runtype":runtype,"cardid":cardid,"cardid":cardid};
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
                    alert(result[i].userId+result[i].username+result[i].age+result[i].password+result[i].cardid+result[i].phone+result[i].clsize+result[i].sex+result[i].runtype);
                }
                alert(result);

            }

        });

    }

</script>


<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>2018西马报名</title>
    <link rel="stylesheet" type="text/css" href="css/default.css">
    <link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
    <link rel="stylesheet" href="css/style.css"> <!-- Resource style -->
    <script src="js/modernizr.js"></script> <!-- Modernizr -->
</head>
<body>



<div class="container">

    <form class="cd-form floating-labels">
        <fieldset>
            <legend>报名信息</legend>





            <div class="error-message">
                <p>请输入有效的身份证及手机号</p>
            </div>

            <div class="icon">
                <label class="cd-label" for="username">姓名</label>
                <input class="user" type="text" name="username" id="username" required>
            </div>

            <div class="icon">
                <label class="cd-label" for="cardid">身份证</label>
                <input class="company" type="text" name="cardid" id="cardid" required>
            </div>

            <div class="icon">
                <label class="cd-label" for="phone">手机号码</label>
                <input class="company" type="text" name="phone" id="phone" required>
            </div>

            <div class="icon">
                <label class="cd-label" for="empno">客户经理工号</label>
                <input class="company" type="text" name="empno" id="empno" required>
            </div>
        </fieldset>

        <fieldset>
            <legend>参加项目</legend>

            <div>


                <p class="cd-select icon">
                    <select class="budget" id="runtype" name="runtype">
                        <option value="0">选择项目</option>
                        <option value="1">10000米</option>
                        <option value="2">半   马</option>
                        <option value="3">全   马</option>
                    </select>
                </p>
            </div>

            <div>
                <h4>性  别</h4>

                <ul class="cd-form-list">
                    <li>
                        <input type="radio" name="sex" id="sex" checked>
                        <label for="sex">男</label>
                    </li>

                    <li>
                        <input type="radio" name="sex" id="sex2">
                        <label for="sex">女</label>
                    </li>


                </ul>
            </div>

            <div>
                <h4>衣服尺码</h4>

                <ul class="cd-form-list">
                    <li>
                        <input type="radio"  name="clsize" id="clsize-1">
                        <label for="clsize-1">S</label>
                    </li>

                    <li>
                        <input type="radio"  name="clsize" id="clsize-2">
                        <label for="clsize-2">M</label>
                    </li>

                    <li>
                        <input type="radio" name="clsize" id="clsize-3">
                        <label for="clsize-3">XL</label>
                    </li>

                    <li>
                        <input type="radio" name="clsize" id="clsize-4">
                        <label for="clsize-4">XXL</label>
                    </li>
                </ul>
            </div>


            <div>
                <input type="submit" value="提交报名"   onclick="requestByJson()">
            </div>
        </fieldset>
    </form>
</div>

<script src="js/jquery-2.1.1.js"></script>
<script src="js/main.js"></script> <!-- Resource jQuery -->

</body>

</html>
