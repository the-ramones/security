<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>String Security Login Page</title>
    </head>
    <body>
        <h2>Login Page</h2>
        <hr />
        <h3>Don't have to be secured via Spring Security</h3>

        <div class="form-container">
            <h2>Login into application</h2>
            <form name="login-form" method="POST" action="/login">
                <div class="form-line clearfix">
                    <label for="j_username">username</label>
                    <input type="text" id="j_username" name="j_username"/>
                </div>
                <div class="form-line clearfix">
                    <label for="j_password">password</label>
                    <input type="password" id="j_password" name="j_password">
                </div>
                <div class="form-line clearfix">
                    <label for="_spring_security_remember_me">Remember Me?</label>
                    <input type="checkbox" name="remember_me"/>
                </div>
                <input name="login-submit" class="btn" type="submit" value="Login"/>
            </form>    
        </div>
        <script type="text/javascript">
            document.getElementById("j_username").focus();
        </script>     
    </body>
</html>
