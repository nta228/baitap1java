<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>

<form action="/register" method="post" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin">
    <h2 class="w3-center">Register Form</h2>

    <div class="w3-row w3-section">
        <div class="w3-rest">
            <input class="w3-input w3-border" name="username" type="text" placeholder="User Name">
        </div>
    </div>

    <div class="w3-row w3-section">
        <div class="w3-rest">
            <input class="w3-input w3-border" name="password" type="password" placeholder="Password">
        </div>
    </div>
    <div class="w3-row w3-section">
        <div class="w3-rest">
            <input class="w3-input w3-border" name="confirmPassword" type="password" placeholder="Confirm Password">
        </div>
    </div>
    <div class="w3-row w3-section">
        <div class="w3-rest">
            <input class="w3-input w3-border" name="fullName" type="text" placeholder="Full Name">
        </div>
    </div>
    <div class="w3-row w3-section">
        <div class="w3-rest">
            <input class="w3-input w3-border" name="email" type="text" placeholder="Email">
        </div>
    </div>

    <div class="w3-row w3-section">
        <div class="w3-rest">
            <input class="w3-input w3-border" name="phone" type="text" placeholder="Phone">
        </div>
    </div>
    <div class="w3-row w3-section">
        <div class="w3-rest">
            <input class="w3-input w3-border" name="birthday" type="text" placeholder="Birthday">
        </div>
    </div>


    <p class="w3-center">
        <button type="submit" class="w3-button w3-section w3-blue w3-ripple"> Send </button>
        <button type="reset" class="w3-button w3-section w3-white w3-ripple"> Reset </button>
    </p>
</form>

</body>
</html>
