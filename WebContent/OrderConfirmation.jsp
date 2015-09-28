<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="/273Assign2/css/style.css" />
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
        
<form method = "post" action = "CancelOrder">
        
 <p><h2>YOUR ORDER HAS BEEN CONFIRMED!!!!</h2></p>
 <br></br>
 <p><h2>Thank you for shopping : <%=(String)request.getSession().getAttribute("productId")%></h2></p>
 <div>&nbsp;</div>
 <p><h2><em> Your order will be delivered in <span style="color: #ff0000">3 business days</span></em></h2></p>
 <p><h2><em>Your order Number is : <%=request.getAttribute("order") %></em></h2> </p>
 
 <input type="submit" value="CANCEL ORDER"> 
 </form> 
 	
<p>&nbsp;</p>
</div>
        <div id="content_bottom"></div>
            
            <div id="footer">
                
      </div>
   </div>
</body>
</html>









