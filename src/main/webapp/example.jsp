<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<%!
    String version = "1.0.0";

    private String getNewVersion() {
        return "1.0.1";
    } %>
<% out.println("Старое значение version: "); %>
<%= version %>
<br/>
<% out.println("Новое значение version: " + getNewVersion()); %>
</body>
</html>