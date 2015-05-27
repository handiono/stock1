<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Masukkan Nama Barang</title>
</head>
<body>
	<h1>Masukkan Nama Barang</h1>
	<form action="barang" method="post">
	<input type="hidden" name="tambah">
	<ul>
	<li>Part No: <input type="text" name="partno"></li>
	<li>Part Name <input type="text" name="partname"></li>
	</ul>
	<input type="submit" value="tambah">
	</form>
	<a href="barang">Kembali ke List Barang</a>
</body>
</html>