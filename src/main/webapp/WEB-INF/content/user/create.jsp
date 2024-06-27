<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Create User</title>
</head>
<body>
    <h2>Create User</h2>
    <s:form action="create" method="post">
        <s:textfield name="user.name" label="Name"/>
        <s:textfield name="user.email" label="Email"/>
        <s:submit value="Create"/>
    </s:form>
</body>
</html>