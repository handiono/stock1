<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Input Transaksi Stock</title>
</head>
<body>
	<h1>Input Transaksi Stock</h1>
	<form action="stock" method="post">
	<input type="hidden" name="tambah">
	<ul>
	
	<li>Jenis Transaksi: <select name="t_id">
					<c:forEach var="transaksi" items="${transaksi2}">
								<option value="${transaksi.id}">${transaksi.jenis}</option>
					</c:forEach>
			</select>
			</li>
	<li>Jenis Barang: <select name="b_id">
					<c:forEach var="barang" items="${barang2}">
								<option value="${barang.id}">${barang.partno} | ${barang.partname}</option>
					</c:forEach>
			</select>
			</li>
	<li>Quantity: <input type="number" name="quantity"></li>		
	</ul>
	<input type="submit" value="tambah">
	</form>
	<a href="stock">Kembali ke List Transaksi Stock</a>
</body>
</html>