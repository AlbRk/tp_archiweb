<%--
  Created by IntelliJ IDEA.
  User: SarahAllouche
  Date: 20/10/2017
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Exo2</title>
</head>
<body bgcolor="#fffacd">
    <h2>exxo2 : ${formation}</h2>
    <hr color="navyblue"/>
<form:form method="post" modelAttribute="requestForm" action="/exercice2/person-formation">
    <div id="person">
        <form:label path="person.nom" for="person.nom">Nom</form:label>
        <form:input path="person.nom" id="person.nom" size="20"/>
        <form:errors path="person.nom"/><br/>

        <form:label path="person.prenom" for="person.prenom">Prenom</form:label>
        <form:input path="person.prenom" id="person.prenom" size="20"/>
        <form:errors path="person.prenom"/><br/>

        <form:label path="person.dateNaissance" for="person.dateNaissance">dateNaissance</form:label>
        <form:input path="person.dateNaissance" id="person.dateNaissance" size="20"/>
        <form:errors path="person.dateNaissance"/><br/>

        <form:label path="person.email" for="person.email">email</form:label>
        <form:input path="person.email" id="person.email" size="20"/>
        <form:errors path="person.email"/><br/>

    </div>

    <div id="formation">
        <form:label path="formation.formation" for="formation.formation">formation</form:label>
        <form:input path="formation.formation" id="formation.formation" size="20"/>
        <form:errors path="formation.formation"/><br/>

        <form:label path="formation.annee" for="formation.annee">annee</form:label>
        <form:input path="formation.annee" id="formation.annee" size="20"/>
        <form:errors path="formation.annee"/><br/>

        <form:label path="formation.lieu" for="formation.lieu">lieu</form:label>
        <form:input path="formation.lieu" id="formation.lieu" size="20"/>
        <form:errors path="formation.lieu"/><br/>

        <form:label path="formation.rythme" for="formation.rythme">ryhtme</form:label>
        <form:input path="formation.rythme" id="formation.rythme" size="20"/>
        <form:errors path="formation.rythme"/><br/>
    </div>

    <form:button name="Submit" value="Envoyer" id="Submit">Envoyer></form:button>

</form:form>
</body>
</html>
