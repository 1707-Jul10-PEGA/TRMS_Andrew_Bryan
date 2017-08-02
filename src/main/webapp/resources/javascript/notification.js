
function populateTable(){
	
	
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
	xhr.open("POST", "TestServlet",true);
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	//var data = {};
	//data.username = document.cookie;
	//xhr.send(data);
	
	xhr.send();
	
}

populateTable();
