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
        
 <form method="post" action="BillingInfo">
 <p><h2>YOUR TOTAL PRICE IS: <span style="color: #ff0000">$<%=request.getAttribute("Total") %></span></h2></p>
 <br></br>
 <p><h2>Please Enter Your Billing Details</h2> </p><br></br>
 
 
 <p><input type="text" name="firstname" value="" placeholder="First Name" required/></p><br></br>
 <p><input type="text" name="lastname" value="" placeholder="LastName" required/></p><br></br>
 <p><input type="text" name="email" value="" placeholder="Email Address" required/></p><br></br>
  <p><input type="text" name="phone" value="" placeholder="Telephone Number" required/></p><br></br>
  <p><input type="text" name="Address1" value="" placeholder="Address1" required/></p><br></br>
  <p><input type="text" name="Address2" value="" placeholder="Address2"required/></p><br></br>
  <p><input type="text" name="City" value="" placeholder="City"required/></p><br></br>
   <p><input type="text" name="ZipCode" value="" placeholder="Zip Code"required/></p><br></br>
    <p><input type="text" name="State" value="" placeholder="State"required/></p><br></br>
  <p><input type="text" name="Country" value="" placeholder="Country"required/></p><br></br>
   
  <div>&nbsp;</div>
  <div>&nbsp;</div>
 
 <p><h2>Card Details</p></h2><br></br>
 <p><input type="text" name="Card_Number" value="" placeholder="Card Number"required/></p><br></br>
 <p><input type="text" name="Name" value="" placeholder="Card Holder Name" required/></p><br></br>
 <p><input type="password" name="CVV" value="" placeholder="CVV" required/></p><br></br>
 <p><label> Expiration Date </label><select><optgroup label="Month">
 <option>Jan</option>
 <option>Feb</option>
 <option>Mar</option>
 <option>Apr</option>
 <option>May</option>
 <option>Jun</option>
 <option>Jul</option>
 <option>Aug</option>
 <option>Sept</option>
 <option>Oct</option>
 <option>Nov</option>
 <option>Dec</option>
 </optgroup></select>
 <select><optgroup label="Year">
 <option>2014</option>
 <option>2013</option>
 <option>2012</option>
 <option>2011</option>
 <option>2010</option>
 <option>2019</option>
 </optgroup></select>
 <div>&nbsp;</div>
 <input type="submit" value="CHECKOUT">
 </form>
       	
<p>&nbsp;</p>
        </div>
        <div id="content_bottom"></div>
            
            <div id="footer">
                
      </div>
   </div>
</body>
</html>









