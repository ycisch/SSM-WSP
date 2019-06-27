<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2019/6/27
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试Json</title>
    <script type="text/javascript" src="/static/js/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $.post("testjson.do",{},function (data){
                console.log("hello World");
                console.log(data);
            },"json")
        });
    </script>
</head>
<body>
<button onclick="sendJson()">提交</button>
</body>
</html>
