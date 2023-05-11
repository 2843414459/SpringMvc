<%@page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh_CN">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录页面</title>
    <link rel="stylesheet" href="static/css/index.css">
</head>

<body>
<div class="bgc"></div>
<div class="bgc"></div>
<div class="bgc"></div>
<div class="login_box">
    <div class="title_h1">后台管理系统</div>
    <div class="div_l">
        <img src="static/images/bgc.webp">
    </div>
    <div class="div_r">
        <div>Welcome Back :)</div>
        <div>
            To keep connected with us please login with your personal information by account and password
        </div>
        <form method="post" action="static/user/login.do">
            <div class="input_box m_top_12">
                <div class="input_img">
                    <img src="static/images/user_name.png"/>
                </div>
                <p>userName</p>

                <input type="text" name="userName">
            </div>

            <div class="input_box m_top_1">
                <div class="input_img">
                    <img src="static/images/pwd.png"/>
                </div>
                <p>password</p>
                <input type="password" name="password">
            </div>
            <div>
                <button type="submit" class="sub_btn">登录</button>
            </div>
        </form>

    </div>
</div>
</body>
</html>