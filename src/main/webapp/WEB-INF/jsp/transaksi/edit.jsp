<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Edit Jenis Transaksi</title>
</head>
<body>
	<h1>Edit Jenis Transaksi</h1>
	<form action="transaksi" method="post">
	<input type="hidden" name="id" value="${transaksi1.id}">
	<input type="hidden" name="ganti">
	<ul>
	<li>Part No: <input type="text" name="transaksi" value="${transaksi1.jenis}"></li>
	</ul>
	<input type="submit" value="ganti">
	</form>
	
	<form action="transaksi" method="post">
	<input type="hidden" name="id" value="${transaksi1.id}">
	<input type="hidden" name="hapus">
	<input type="submit" value="hapus">
	</form>
	<a href="transaksi">Kembali ke List Jenis Transaksi</a>
</body>
</html>