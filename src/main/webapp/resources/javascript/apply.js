
function printInfo(){
	
	//REIMBURSEMENT INFO
	var r_amount = document.getElementById("amount");
	var r_title = document.getElementById("type");
	var grade = document.getElementById("grade");
	var details = document.getElementById("details");
	
	

	console.log("Reimbusement Info");
	console.log("Amount: " + r_amount.value);
	console.log("Title: " + r_title.value);
	console.log("Grade: " + grade.value);
	console.log("Details:\n" + details.value);
	
}


function postApplication(){
	
	//REIMBURSEMENT INFO
	var r_amount = document.getElementById("amount");
	var r_title = document.getElementById("title");
	var grade = document.getElementById("grade");
	var details = document.getElementById("details");
	
	
	//OPEN HTTP REQUEST
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
			}else{
				console.log('fail');
				console.log(xhr.status);
			}
			break;
		}
	};
	
	xhr.open("POST","ApplyServlet",true);
	
	// we are changing the header
	//we are telling the java code what to expect
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	var data = "application_cred=" + JSON.stringify(makeApplicationCred(amount.value, title.value, grade.value, details.value));
	
	// grab the data within the servlet
	xhr.send(data);
}	
	
	
	function makeApplicationCred(a,b){
		obj = {};
		obj.amount = a;
		obj.title = b;
		obj.grade = c;
		obj.details = d;
		//obj.password = y;	
		return obj;
	}






window.onload = function(){

	document.getElementById("apply").addEventListener("click", printInfo, true);

};