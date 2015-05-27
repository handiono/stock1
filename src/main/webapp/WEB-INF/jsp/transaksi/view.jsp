<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Jenis Transaksi</title>
</head>
<body>
	<h1>Jenis Transaksi</h1>
	<form action="transaksi" method="post">
	<input type="hidden" name="tambah">
	<ul>
	<li>Jenis Transaksi: <input type="text" name="transaksi"></li>
	
	</ul>
	<input type="submit" value="tambah">
	</form>
	<a href="transaksi">Kembali ke List Jenis Transaksi</a>
</body>
</html>