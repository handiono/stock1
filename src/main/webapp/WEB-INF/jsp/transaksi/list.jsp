<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>List Jenis Transaksi</title>
</head>
<body>
	<h1>List Jenis Transaksi</h1>
	<ul>
	<c:forEach var="transaksi" items="${transaksi2}">
		<li><a href="transaksi?id=${transaksi.id}&ganti">${transaksi.jenis}</a></li>
	</c:forEach>
	</ul>
	<a href="transaksi?tambah">Tambah Jenis Transaksi</a> 
</body>
</html>