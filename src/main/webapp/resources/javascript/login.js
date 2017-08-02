

function printName(){
	
	var username = document.getElementById("user");
	var password = document.getElementById("pass");

	console.log("Username: " + username.value);
	console.log("Password: " + password.value);
}

function postEmployee(){
	var user = document.getElementById("user");
	var pass = document.getElementById("pass");
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		
		switch(xhr.readyState){
		case 0:
			console.log(0);
			break;
		case 1:
			console.log(1);
			break;
		case 2:
			console.log(2);
			break;
		case 3:
			console.log(3);
			break;
		case 4:
			if(xhr.status == 200){
				console.log('success');
				document.cookie = user.value;
				window.location.href = "TRMSmenu.html";
			}else{
				console.log('fail');
				console.log(xhr.status);
			}
			break;
		}
	};
	
	xhr.open("POST","LoginServlet",true);
	
	// we are changing the header
	//we are telling the java code what to expect
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	var data = "login_cred=" + JSON.stringify(makeLoginCred(user.value,pass.value));
	
	// grab the data within the servlet
	xhr.send(data);
	
}
function makeLoginCred(x,y){
	obj = {};
	obj.username = x;
	obj.password = y;	
	return obj;
}

window.onload = function(){
console.log("HELLO");
document.getElementById("login").addEventListener("click", postEmployee, true);

};
