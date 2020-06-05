<?php
$server = "localhost";
$username = "id12192818_root";
$password = "Revata_123456";
$dbname = "id12192818_jsonrewa";

//koneksi
$conn= new mysqli ($server,$username,$password,$dbname);

//check koneksi
if($conn->connect_error){
die("koneksi gagal/failed".$conn->connect_error);
}
$sql="SELECT * FROM t_menu";
$result=$conn->query($sql);
$data=array();

if($result->num_rows>0){
	while ($row=$result->fetch_assoc()){
		$data[]=$row;
		}
		}else{
	echo"data kosong";
	}
	echo json_encode($data);
	$conn->close();
	?>
