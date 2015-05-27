<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Masukkan Nama Barang</title>
</head>
<body>
	<h1>Masukkan Nama Barang</h1>
	<form action="barang" method="post">
	<input type="hidden" name="id" value="${barang1.id}">
	<input type="hidden" name="ganti">
	<ul>
	<li>Part No: <input type="text" name="partno" value="${barang1.partno}"></li>
	<li>Part Name <input type="text" name="partname" value="${barang1.partname}"></li>
	</ul>
	<input type="submit" value="ganti">
	</form>
	
	<form action="barang" method="post">
	<input type="hidden" name="id" value="${barang1.id}">
	<input type="hidden" name="hapus">
	<input type="submit" value="hapus">
	</form>
	<a href="barang">Kembali ke List Barang</a>
</body>
</html>