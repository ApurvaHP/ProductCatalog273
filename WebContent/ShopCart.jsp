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
        
 <form method="post" action ="ShoppingCart">
 <table id="t01" style="width:100%" >
 
  <tr>
  	<th>IMAGE</th>
    <th>ITEM</th>
    <th>DESCRIPTION</th> 
    <th>PRICE</th>
    <th>QUANTITY</th>
    
  </tr>
  <tr class="spaceUnder">
  	<td><img src="http://localhost:3000/images/misc/<%=request.getAttribute("Image")%>" width="160" height="160"/></td>
    <td> <%=(String)request.getSession().getAttribute("productId")%></td>
    <td> <%=(String)request.getSession().getAttribute("Desc")%></td>		
    <td>$<%=(String)request.getSession().getAttribute("price")%></td>
    <td>
	<select name="Quantity">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    </select>
    </td>
  
  </tr>
 
</table>   
<br></br>

<!-- <form style="float: right" method="post" action ="ShoppingCart">-->
<input type="submit" style="float: right" name="ConfirmButton" value="CONFIRM"/>
</form>
       	
<p>&nbsp;</p>
</div>
        <div id="content_bottom"></div>
            
            <div id="footer">
                
      </div>
   </div>
</body>
</html>









