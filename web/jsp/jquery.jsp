<%--
  Created by IntelliJ IDEA.
  User: jason-note
  Date: 2018/9/5
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<!DOCTYPE html>

<head>
    <script src="../js/jquery-3.3.1.js">
    </script>
    <script>
        $().ready(function(){
            $("p").click(function(){
                $(this).hide();
            });
        });
    </script>
</head>
<body>
<p>如果您点击我221，我会消失。</p>
<p>点击我，我会消失。</p>
<p>也要点击我哦。</p>
</body>
</html>
