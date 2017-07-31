
function printInfo(){
	
	//NAME INFO
	var fname = document.getElementById("fname");
	var lname = document.getElementById("lname");
	var mname = document.getElementById("mname");
	
	//ADDRESS INFO
	var address = document.getElementById("address");
	var city = document.getElementById("city");
	var state = document.getElementById("state");
	var zip = document.getElementById("zip");
	
	//CONTACT INFO
	var phone = document.getElementById("phone");
	var email = document.getElementById("email");
	
	//REIMBURSEMENT INFO
	var r_amount = document.getElementById("amount");
	var r_title = document.getElementById("title");
	var r_start = document.getElementById("start");
	var r_end = document.getElementById("end");
	var explaination = document.getElementById("explaination");
	
	
	console.log("Firstname: " + fname.value);
	console.log("Lastname: " + lname.value);
	console.log("Middlename: " + mname.value);
	console.log("Address: " + address.value + " " + city.value + ", " + state.value + " " + zip.value);
	console.log("Phone Number: " + phone.value);
	console.log("Email: " + email.value);
	
	console.log("Reimbusement Info");
	console.log("Amount: " + r_amount.value);
	console.log("Title: " + r_title.value);
	console.log("Start Date: " + r_start.value + " / "  + "End Date: " + r_end.value);
	console.log("Explaination:\n" + explaination.value);
	
}

window.onload = function(){

	document.getElementById("apply").addEventListener("click", printInfo, true);

	};