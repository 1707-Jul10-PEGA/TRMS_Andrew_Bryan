// TABLE 1 - update current Reimbursements

	function addCurrent(){
		
		/*
		 * <td style="padding:10px;font-size:16px;"> Submission Date </td>
		   <td style="padding:10px;font-size:16px;"> Approval Date  </td>
 	   	   <td style="padding:10px;font-size:16px;"> Cause </td>
		   <td style="padding:10px;font-size:16px;"> Amount Given </td>
		   <td style="padding:10px;font-size:16px;"> Approved By </td>
		 * 
		 * 
		 * 
		 */
		var row = document.createElement("tr");
		var submissionDate = document.createElement("td");
		var approvalDate = document.createElement("td");
		var title = document.createElement("td");
		var amount = document.createElement("td");
		var approvedby = document.createElement("td");
		
		submissionDate.innerHTML = "INSERT DATE";
		approvalDate.innerHTML = "INSERT DATE";
		title.innerHTML = "INSERT TITLE";
		amount.innerHTML = "INSERT AMOUNT";
		approvedby.innerHTML = "INSERT NAME";
		
		row.appendChild(submissionDate);
		row.appendChild(approvalDate);
		row.appendChild(title);
		row.appendChild(amount);
		row.appendChild(approvedby);
		
		document.getElementById("c_re").appendChild(row);
		
		
	}




// TABLE 2 - update status Reimbursements
	
	function addStatus(){
		
		/* <td style="padding:10px;font-size:16px;"> Submission Date </td>
		   <td style="padding:10px;font-size:16px;"> Reimbursement ID </td>
		   <td style="padding:10px;font-size:16px;"> Reimbursement Summary </td>
		   <td style="padding:10px;font-size:16px;"> Amount Applied For </td>
		   <td style="padding:10px;font-size:16px;"> Status </td>
		   <td style="padding:10px;font-size:16px;"> Additional Information </td>						
		 */
		
		var row = document.createElement("tr");
		var submissionDate = document.createElement("td");
		var reimbursementID = document.createElement("td");
		var details = document.createElement("td");
		var amount = document.createElement("td");
		var status = document.createElement("td");
		var reason = document.createElement("td");
		
		submissionDate.innerHTML = "INSERT SUBMISSION DATE";
		reimbursementID.innerHTML = "INSERT ID";
		details.innerHTML = "Details";
		amount.innerHTML = "Amount";
		status.innerHTML = "status";
		reason.innerHTML = "reason";
		
		row.appendChild(submissionDate);
		row.appendChild(reimbursementID);
		row.appendChild(details);
		row.appendChild(amount);
		row.appendChild(status);
		row.appendChild(reason);
		
		document.getElementById("s_re").appendChild(row);
		
	}
	
	
	// ON START FUNCTION TO ADD TO TABLE at LOAD TIME!! 