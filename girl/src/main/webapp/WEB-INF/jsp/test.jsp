<%@ page contentType="text/html; charset=UTF-8"%>
<%System.out.println(request.getParameter("id"));%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="http://apps.bdimg.com/libs/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6" style="border:1px solid black">${requestScope.msg}</div>
			<div class="col-md-6" style="border:1px solid black">${param.id}</div>
		</div>
	</div>
</body>
</html>