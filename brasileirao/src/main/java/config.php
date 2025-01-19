<?php
$servername = "192.168.0.105";
$username = "info22_vinicius";
$password = "info22_vinicius";
$dbname = "brasileirao";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}
$sql = "SELECT * FROM Times_Brasileirao";

$result = $conn->query($sql);

if ($result->num_rows > 0) {

    while ($row = $result->fetch_assoc()) {

        echo "id: " . $row["id"] . " - Nome: " . $row["nome"] . " - Estado: " . $row["estado"] . "<br>";
    }
} else {
    echo "Nenhum resultado encontrado";
}

$conn->close();
?>
