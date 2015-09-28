<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="/273Assign2/css/style.css" />
 <link href="/273Assign2/bootstrap.min.css" rel="stylesheet"/>
 <link href="/273Assign2/font-awesome.min.css" rel="stylesheet"/>
<title>BEST DEALS</title>
</head>

<body>
<div id="container">
		<div id="header">
        	<h1>BEST<span class="off">DEALS</span></h1>
            <h2>Come stop by!</h2>
        </div>   
        
        <div id="menu">
        	<ul>
            	<li class="menuitem"><a href="#">Home</a></li>
                <li class="menuitem"><a href="#">About</a></li>
                <li class="menuitem"><a href="#">Products</a></li>
                <li class="menuitem"><a href="#">Services</a></li>
                <li class="menuitem"><a href="#">Design</a></li>
              <li class="menuitem"><a href="#">Contact</a></li>
            </ul>
        </div>
        <div id="leftmenu">

        <div id="leftmenu_top"></div>

                <div id="leftmenu_main"> 

                <a href = "/index"><h3>PRODUCTS</h3></a>
                          
                <ul>
            <li>
                <!--<a href="/">Products</a></li>-->
                    <li><a href="/index/cars">Cars</a></li>
                    <li><a href="/television">Television</a></li>
                    <li><a href="/women_accessories">Accessories for women</a></li>
                    <li><a href="#">Dresses</a></li>
                    <li><a href="#">Casual Wear</a></li>
                </ul> 
</div>

     <div id="leftmenu_bottom"></div>
 </div>      
      <div id="content">
       <div id="content_top"></div>
        <div id="content_main">
<div class="login">

    <h1>Sign In</h1>
	<div>&nbsp;</div>
    <form method="post" action="validation">

      <p><input type="text" name="username" value="" placeholder="Username or Email" required></p><br />

      <p><input type="password" name="password" value="" placeholder="Password" required></p><br />
	  <p><input type="hidden" name="login" value="login" ></p><br />
      <p class="remember_me">

        <label>

          <input type="checkbox" name="remember_me" id="remember_me">
          Remember me on this computer
		
        </label><br />

      </p>

      <p class="submit"><input type="submit" name="commit" value="Login"></p>
   
    </form>

  </div>
<div>&nbsp;</div>
<div>&nbsp;</div>
<div id="content_top"></div>

        <div class="login">

    <h1>New User SignUp</h1>
    
    <div>&nbsp;</div>

    <form method="post" action="validation">

      <p><input type="text" name="username" value="" placeholder="Username or Email" required></p><br />
      
      <p><input type="password" name="password" value="" placeholder="Password" required></p><br />

      <p><input type="password" name="confirm_password" value="" placeholder="Confirm Password" required></p><br />
	  
	  <p><input type="hidden" name="join" value="join" ></p><br />

      <p class="submit"><input type="submit" name="commit" value="Join"></p>

    </form>

  </div>

	   </div>
        <div id="content_bottom"></div>
            
            <div id="footer">
                
      </div>
   </div>
</body>
</html>












