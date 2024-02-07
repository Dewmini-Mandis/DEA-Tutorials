<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin: auto;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Request Headers</h2>
    <button onclick="fetchHeaders()">Fetch Headers</button>
    <div id="headersTableDiv"></div>

    <script>
        function fetchHeaders() {
            var xhr = new XMLHttpRequest();
            xhr.open("GET", "HeaderPrintServlet", true);
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    document.getElementById("headersTableDiv").innerHTML = xhr.responseText;
                }
            };
            xhr.send();
        }
    </script>
    
<!--        <h2>Image Upload</h2>
    <form action="ImageUploadServlet" method="post" enctype="multipart/form-data">
        Select an image to upload:
        <input type="file" name="file" accept=".jpeg">
        <br>
        <button type="submit">Upload Image</button>
    </form>-->
</body>
</html>
