<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>QR Code</title>
</head>
<body>
    <h1>QR Code</h1>
    <div id="wechatQrcode"></div>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
    <script>
        jQuery('#wechatQrcode').qrcode({
            text: "${codeUrl}"
            }
        );
    </script>
</body>
</html>
