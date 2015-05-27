<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Daftar Barang</title>
</head>
<body>
	<h1>Daftar Barang</h1>
	<ul>
	<c:forEach var="barang" items="${barang2}">
		<li><a href="barang?id=${barang.id}&ganti">${barang.partname}</a></li>
	</c:forEach>
	</ul>
	<a href="barang?tambah">Tambah Barang</a> 
</body>
</html>