<html>
<body>
	<h2>Employee Status</h2>

	<form action="sendStatus" method="post">
		<table>
			<tr>

				<td>Employee Name:</td>
				<td><input type="text" name="empName" /></td>
			</tr>
			<tr>

				<td>Status:</td>
				<td><input type="text" name="status" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Send" /></td>
			</tr>
		</table>
	</form>
	<h1>Circle Messages</h1>
		<table class="tg">
			<tr>
				<th width="80">Sender</th>
				<th width="120">Posted Date</th>
				<th width="120">Message</th>

			</tr>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td>${emp.EmpName}</td>
					<td>${emp.postedDate}</td>
					<td>${emp.EmpStatus}</td>
					
				</tr>
			</c:forEach>
		</table>
</body>
</html>
