<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>User page</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<link rel="stylesheet" type="text/css" href="../css/tabs.css">
	<script src="../js/tabs.js"></script>
	<script>
        function openTab(evt, tabName) {
            var i, tabcontent, tablinks;
            tabcontent = document.getElementsByClassName("tabcontent");
            for (i = 0; i < tabcontent.length; i++) {
                tabcontent[i].style.display = "none";
            }
            tablinks = document.getElementsByClassName("tablinks");
            for (i = 0; i < tablinks.length; i++) {
                tablinks[i].className = tablinks[i].className.replace(" active", "");
            }
            document.getElementById(tabName).style.display = "block";
            evt.currentTarget.className += " active";
        }
	</script>
</head>
<body>
	Account list:<br><br>
	<table>
		<tr>
			<th>Account number</th>
			<th>Card number</th>
			<th>Amount, BYN</th>
			<th>Block Status</th>
		</tr>
		<c:forEach var="MainTable" items="${requestScope.get(\"mainTable\")}">
			<tr>
				<td><c:out value="${MainTable[0]}"/></td>
				<td><c:out value="${MainTable[1]}"/></td>
				<td><c:out value="${MainTable[2]}"/></td>
				<td><c:out value="${MainTable[3]}"/></td>
			</tr>
		</c:forEach>
	</table>
	<br><br><br>
	<c:out value="${requestScope.get(\"error\")}"></c:out>
<br><br><br>

<div class="tab">
  <button class="tablinks" onclick="openTab(event, 'makePayment')">Make a payment</button>
  <button class="tablinks" onclick="openTab(event, 'fillAccount')">Fill account</button>
  <button class="tablinks" onclick="openTab(event, 'blockAccount')">Block account</button>
</div>

<div id="makePayment" class="tabcontent">
  <form>
  Account number:<br>
  <select name="accNumber">
	  <c:forEach var="MainTable" items="${requestScope.get(\"mainTable\")}">
			  <option><c:out value="${MainTable[0]}"/></option>
	  </c:forEach>
  </select><br>  
  Recipient's account number:<br>
  <input type="number" name="recAccNumber"><br>
  Amount, BYN:<br>
  <input type="number" name="amount"><br>
  Card valid thru:<br>
  <input type="text" name="validThru1" style="width: 2%; margin-right: 0.5%;">
  /<input type="text" name="validThru2" style="width: 2%; margin-left: 0.5%;"><br>
	  <input type="submit" value="Transfer" name="command" formaction="../controller.do" formmethod="get">

  </form>
</div>

<div id="fillAccount" class="tabcontent">
  FILL ACCOUNT
</div>

<div id="blockAccount" class="tabcontent">
  <form>
  	Account number:<br>
  	<select name="accNumberBlock">
		<c:forEach var="MainTable" items="${requestScope.get(\"mainTable\")}">
			<option><c:out value="${MainTable[0]}"/></option>
		</c:forEach>
  	</select><br> 
  	<p style="color: #c70000">Remember, the card will be unavailable.<br>
	Only the administrator can unlock the lock.</p>
	  <input type="submit" value="Block" name="command" formaction="../controller.do" formmethod="get">
  </form>
</div>
</body>
</html>