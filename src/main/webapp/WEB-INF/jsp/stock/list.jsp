<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>List Transaksi Stock</title>
</head>
<body>
	<h1>List Transaksi Stock</h1>
	<ul>
	<c:forEach var="transaksi" items="${transaksi2}">
		<li><a href="transaksi?id=${transaksi.id}&ganti">
		id: ${transaksi.id}, 
		tanggal: ${transaksi.tanggal}, 
		quantity:  ${transaksi.quantity}, 
		transaksi: ${transaksi.transaksi.jenis}, 
		barang : ${transaksi.barang.partname}
		</a></li>
	</c:forEach>
	</ul>
	<a href="stock?tambah">Tambah Transaksi Stock</a> 
</body>
</html>