<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title>主页</title>
</head>
<body>
    <#--${name}-->
    <#list  all as x>
       ${x.userName}
    </#list>
</body>
</html>
