<html>

<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
<div class="container">
        <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6">
                <div class="box">
                    <div class="shape1"></div>
                    <div class="shape2"></div>
                    <div class="shape3"></div>
                    <div class="shape4"></div>
                    <div class="shape5"></div>
                    <div class="shape6"></div>
                    <div class="shape7"></div>
                    <div class="float">
                        <form class="form" action="SignUp" method = "POST">
                            <div class="form-group">
                                <label for="username" class="text-white">Username:</label><br>
                                <input type="text" name="username" class="form-control" placeholder = "username" required = "required">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-white">Password:</label><br>
                                <input type="password" name="password" class="form-control" placeholder = "password" required = "required">
                            </div>
                            <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="sign up">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
