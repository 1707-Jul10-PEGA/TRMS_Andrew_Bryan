

function printName(){
	
	var username = document.getElementById("user");
	var password = document.getElementById("pass");

	console.log("Username: " + username.value);
	console.log("Password: " + password.value);
}

window.onload = function(){

document.getElementById("login").addEventListener("click", printName, true);

};
