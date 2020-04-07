<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="sum" value="${requestScope.sum}" scope="request" />

<p>
  <c:out value="${sum.firstNumber}" /> +
  <c:out value="${sum.secondNumber}" /> =
  <c:out value="${sum.result}" />
</p>

<h1>Do you want to add things together again??</h1>

<%@ include file="new.jsp" %>

<a href="/sum">Add another</a>