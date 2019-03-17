<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Madhu batte angadi</title>
</head>
<body>
	<form action="kharidi" method="post">
	
		<pre>
Brand :     <input type="text" name="brand"><br>
Category :  <input type="text" name="category"><br>
Quantity :  <input type="text" name="quantity"><br>
Size :      <select name="size">
			<option value="xs">Xs</option>
			<option value="s">S</option>
			<option value="m">M</option>
			<option value="l">L</option>
			<option value="xl">XL</option>
			<option value="xxl">XXL</option>
	   </select><br>
Color :     <select name="color">
			<option value="blue">Blue</option>
			<option value="red">Red</option>
			<option value="green">Green</option>
			<option value="white">White</option>
			<option value="gray">Gray</option>
			<option value="pink">Pink</option>
</select><br>
<input type="submit" value="Kharidi">	<input type="reset" value="Cancel">

</pre>

	</form>
</body>
</html>