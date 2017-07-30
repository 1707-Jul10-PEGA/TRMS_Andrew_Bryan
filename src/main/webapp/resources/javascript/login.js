

function printName(){
	
	var username = document.getElementById("user");
	var password = document.getElementById("pass");

	console.log("Username: " + username.value);
	console.log("Password: " + password.value);
}

document.getElementById("login").addEventListener("click", printName, false);
